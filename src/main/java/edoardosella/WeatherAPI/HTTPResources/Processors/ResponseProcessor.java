package edoardosella.WeatherAPI.HTTPResources.Processors;

import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.City;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output.Route;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack.DailyForecast;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack.WeatherStack;

import java.util.Map;

public class ResponseProcessor {

    JSONProcessor jsonProcessor;

    public ResponseProcessor(){
        jsonProcessor = new JSONProcessor();
    }

    public String getWeatherRoute(Map<String, WeatherStack> cities, int index){

        String output = "";
        double average;
        DailyForecast forecast;
        City cityPOJO;
        Route route = new Route();

        for(Map.Entry<String, WeatherStack> city : cities.entrySet()) {
            forecast = city.getValue().getDailyForecasts().get(index);
            average = (forecast.getTemperature().getMinimum().getValue() + forecast.getTemperature().getMaximum().getValue()) / 2;
            cityPOJO = new City();
            cityPOJO.setCityID(city.getKey());
            cityPOJO.setMinTemp(forecast.getTemperature().getMinimum().getValue());
            cityPOJO.setMaxTemp(forecast.getTemperature().getMaximum().getValue());
            cityPOJO.setAverageTemp(average);
            cityPOJO.setWeatherDescription(forecast.getDay().getIconPhrase());
            route.addCity(cityPOJO);
        }

        output = jsonProcessor.objectToJSON(route);

        return output;
    }
}
