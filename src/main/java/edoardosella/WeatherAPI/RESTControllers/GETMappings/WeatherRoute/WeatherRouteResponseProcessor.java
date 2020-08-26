package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import edoardosella.WeatherAPI.JPA.Models.PreviousRoute;
import edoardosella.WeatherAPI.JPA.Repositories.PreviousRoutes.PreviousRoutesManager;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.City;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.Route;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack.DailyForecast;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack.WeatherStack;
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

    public String processRequest(String citiesParam, String apiKey, int dateDifference) throws MalformedURLException, PatternSyntaxException{
        String output;
        double average;
        DailyForecast forecast;
        City cityPOJO;
        List<String> cities;
        Route route = new Route();
        cities = new ArrayList<String>(Arrays.asList(citiesParam.split("&")));
        Map<String, WeatherStack> responsePOJOs = getWeatherForRoute(cities, apiKey);


        for (String city : cities) {
            cityPOJO = new City();
            try{
                forecast = responsePOJOs.get(city).getDailyForecasts().get(dateDifference);
                average = (forecast.getTemperature().getMinimum().getValue() + forecast.getTemperature().getMaximum().getValue()) / 2;
                cityPOJO.setCityID(city);
                cityPOJO.setMinTemp(forecast.getTemperature().getMinimum().getValue());
                cityPOJO.setMaxTemp(forecast.getTemperature().getMaximum().getValue());
                cityPOJO.setAverageTemp(average);
                cityPOJO.setWeatherDescription(forecast.getDay().getIconPhrase());
            }catch(IndexOutOfBoundsException e){
                cityPOJO.setCityID(city);
                cityPOJO.setMinTemp(0);
                cityPOJO.setMaxTemp(0);
                cityPOJO.setAverageTemp(0);
                cityPOJO.setWeatherDescription("Unavailable");
            }

            route.addCity(cityPOJO);
        }

        output = jsonProcessor.objectToJSONString(route);

        previousRouteManager.save(new PreviousRoute(output));

        return output;
    }

    public Map<String, WeatherStack> getWeatherForRoute(List<String> cities, String apiKey) throws MalformedURLException{
        //https://stackoverflow.com/questions/7488643/how-to-convert-comma-separated-string-to-list

        Map<String, WeatherStack> responsePOJOs = new HashMap<>();
        WeatherStack weatherStack;
        String weatherJSON = "";

        for (String city : cities) {
            weatherJSON = this.weatherClient.getFiveDayForecast(city, apiKey);
            weatherStack = (WeatherStack) this.jsonProcessor.jsonToObject(weatherJSON, WeatherStack.class);
            responsePOJOs.put(city, weatherStack);
        }

        return responsePOJOs;
    }
}
