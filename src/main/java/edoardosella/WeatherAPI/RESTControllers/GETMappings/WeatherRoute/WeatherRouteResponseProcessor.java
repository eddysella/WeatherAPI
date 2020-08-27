package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import edoardosella.WeatherAPI.JPA.Models.PreviousRoute;
import edoardosella.WeatherAPI.JPA.Repositories.PreviousRoutes.PreviousRoutesManager;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.City;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.Route;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input.DailyForecast;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input.WeatherStack;
import edoardosella.WeatherAPI.Resources.JSONProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.util.*;
import java.util.regex.PatternSyntaxException;

@Service
public class WeatherRouteResponseProcessor {
    private HTTPClient weatherClient;
    private JSONProcessor jsonProcessor;

    @Autowired
    PreviousRoutesManager previousRouteManager;

    public WeatherRouteResponseProcessor() {
        this.weatherClient = new HTTPClient();
        this.jsonProcessor = new JSONProcessor();
    }

    public String processRequest(String citiesParam, String apikey, int dateDifference) throws MalformedURLException, PatternSyntaxException {
        //https://stackoverflow.com/questions/7488643/how-to-convert-comma-separated-string-to-list
        List<String> cities = new ArrayList<>(Arrays.asList(citiesParam.split("&")));
        Route route = processRoute(cities, apikey, dateDifference);
        String output = jsonProcessor.objectToJSONString(route);
        previousRouteManager.save(new PreviousRoute(output));
        return output;
    }

    private Route processRoute(List<String> cities, String apikey, int dateDifference) throws MalformedURLException {
        Map<String, WeatherStack> responsePOJOs = getWeatherByCity(cities, apikey);
        Route route = compileRoute(cities, responsePOJOs, dateDifference);
        return route;

    }

    private Route compileRoute(List<String> cities, Map<String, WeatherStack> responsePOJOs, int dateDifference) {
        Route route = new Route();
        for (String cityName : cities) {
            try {
                DailyForecast forecast = responsePOJOs.get(cityName).getDailyForecasts().get(dateDifference);
                route.addCity(createCityPOJO(cityName, forecast));
            } catch (IndexOutOfBoundsException e) {
                route.addCity(createEmptyCityPOJO(cityName));
            }
        }
        return route;
    }

    private City createEmptyCityPOJO(String cityName) {
        City city = new City();
        city.setCityID(cityName);
        city.setMinTemp(0);
        city.setMaxTemp(0);
        city.setAverageTemp(0);
        city.setWeatherDescription("Unavailable");
        return city;
    }

    private City createCityPOJO(String cityName, DailyForecast forecast) {
        City city = new City();
        double average = calculateAvg(forecast);
        city.setCityID(cityName);
        city.setMinTemp(forecast.getTemperature().getMinimum().getValue());
        city.setMaxTemp(forecast.getTemperature().getMaximum().getValue());
        city.setAverageTemp(average);
        city.setWeatherDescription(forecast.getDay().getIconPhrase());
        return city;
    }

    private double calculateAvg(DailyForecast forecast) {
        double minimum, maximum, average, output;
        minimum = maximum = average = output = 0;
        minimum = forecast.getTemperature().getMinimum().getValue();
        maximum = forecast.getTemperature().getMaximum().getValue();
        average = minimum + maximum;
        if (average != 0) {
            output = average / 2;
        }
        return output;
    }


    public Map<String, WeatherStack> getWeatherByCity(List<String> cities, String apiKey) throws MalformedURLException {
        Map<String, WeatherStack> responsePOJOs = new HashMap<>();
        for (String city : cities) {
            String weatherJSON = this.weatherClient.getFiveDayForecast(city, apiKey);
            WeatherStack weatherStack = (WeatherStack) this.jsonProcessor.jsonToObject(weatherJSON, WeatherStack.class);
            responsePOJOs.put(city, weatherStack);
        }
        return responsePOJOs;
    }
}
