package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import edoardosella.WeatherAPI.Resources.JSONProcessor;
import edoardosella.WeatherAPI.JPA.Models.PreviousRoute;
import edoardosella.WeatherAPI.JPA.Repositories.PreviousRouteRepo;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.City;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.Route;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack.DailyForecast;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack.WeatherStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ResponseProcessor {
    private HTTPClient weatherClient;
    private JSONProcessor jsonProcessor;

    @Autowired
    PreviousRouteRepo previousRouteRepo;

    public ResponseProcessor(){
        this.weatherClient = new HTTPClient();
        this.jsonProcessor = new JSONProcessor();
    }

    public String processRequest(String citiesParam, String apiKey, int dateDifference){

        String output;
        double average;
        DailyForecast forecast;
        City cityPOJO;
        Route route = new Route();

        Map<String, WeatherStack> responsePOJOs = getWeatherForRoute(citiesParam, apiKey);

        for(Map.Entry<String, WeatherStack> city : responsePOJOs.entrySet()) {
            forecast = city.getValue().getDailyForecasts().get(dateDifference);
            average = (forecast.getTemperature().getMinimum().getValue() + forecast.getTemperature().getMaximum().getValue()) / 2;
            cityPOJO = new City();
            cityPOJO.setCityID(city.getKey());
            cityPOJO.setMinTemp(forecast.getTemperature().getMinimum().getValue());
            cityPOJO.setMaxTemp(forecast.getTemperature().getMaximum().getValue());
            cityPOJO.setAverageTemp(average);
            cityPOJO.setWeatherDescription(forecast.getDay().getIconPhrase());
            route.addCity(cityPOJO);
        }

        output = jsonProcessor.objectToJSONString(route);

        previousRouteRepo.save(new PreviousRoute(output));

        return output;
    }

    public Map<String, WeatherStack> getWeatherForRoute(String citiesParam, String apiKey){
        //https://stackoverflow.com/questions/7488643/how-to-convert-comma-separated-string-to-list
        List<String> cities = new ArrayList<String>(Arrays.asList(citiesParam.split("&")));

        Map<String, WeatherStack> responsePOJOs = new HashMap<>();
        WeatherStack weatherStack;
        String weatherJSON;

        for(String city : cities){
            weatherJSON = this.weatherClient.getFiveDayForecast(city, apiKey);
            weatherStack = (WeatherStack) this.jsonProcessor.jsonToObject(weatherJSON, WeatherStack.class);
            responsePOJOs.put(city, weatherStack);
        }

        return responsePOJOs;
    }
}
