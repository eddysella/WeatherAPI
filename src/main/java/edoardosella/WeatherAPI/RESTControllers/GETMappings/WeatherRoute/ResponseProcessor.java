package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import edoardosella.WeatherAPI.JPA.Repositories.WeatherRoute.WeatherRouteManager;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input.DailyForecast;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input.WeatherStack;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.City;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.Route;
import edoardosella.WeatherAPI.Resources.JSONProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "GETWeatherRouteResponseProcessor")
class ResponseProcessor {

    @Autowired
    private WeatherRouteManager weatherRouteManager;
    private HTTPClient weatherClient;
    private JSONProcessor jsonProcessor;

    public ResponseProcessor() {
        this.weatherClient = new HTTPClient();
        this.jsonProcessor = new JSONProcessor();
    }

    String getResponseString(List<String> cities, String apikeyParam, int dateIndex) throws MalformedURLException {
        Route route = getRoute(cities, apikeyParam, dateIndex);
        String output = jsonProcessor.objectToJSONString(route);
        weatherRouteManager.save(output);
        return output;
    }

    private Route getRoute(List<String> cities, String apikeyParam, int dateIndex) throws MalformedURLException {
        List<WeatherStack> weatherStackList = getWeatherForCities(cities, apikeyParam);
        return buildRoute(cities, weatherStackList, dateIndex);
    }

    private List<WeatherStack> getWeatherForCities(List<String> cities, String apiKey) throws MalformedURLException {
        List<WeatherStack> weatherStackList = new ArrayList<>();
        for (String city : cities) {
            String weatherJSON = weatherClient.getFiveDayForecast(city, apiKey);
            weatherStackList.add((WeatherStack) jsonProcessor.jsonToObject(weatherJSON, WeatherStack.class));
        }
        return weatherStackList;
    }

    private Route buildRoute(List<String> cities, List<WeatherStack> weatherStackList, int dateIndex){
        Route route = new Route();
        for (int i = 0; i < weatherStackList.size(); i++) {
            String cityID = cities.get(i);
            try {
                DailyForecast forecast = weatherStackList.get(i).getDailyForecasts().get(dateIndex);
                route.addCity(createCityPOJO(cityID, forecast));
            } catch (IndexOutOfBoundsException e) {
                route.addCity(createEmptyCityPOJO(cityID));
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
        output = 0;
        minimum = forecast.getTemperature().getMinimum().getValue();
        maximum = forecast.getTemperature().getMaximum().getValue();
        average = minimum + maximum;
        if (average != 0) {
            output = average / 2;
        }
        return output;
    }
}
