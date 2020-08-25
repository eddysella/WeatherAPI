package edoardosella.WeatherAPI.HTTPResources;

import edoardosella.WeatherAPI.POJO.DailyForecast;
import edoardosella.WeatherAPI.POJO.WeatherStackRequest;
import java.util.List;
import java.util.*;
import java.util.Date;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class BeautifyResponse {

    public BeautifyResponse(){}

    public String fiveDayForecast(Map<String, WeatherStackRequest> cities, int index){

        String output = "";
        DailyForecast forecast;
        double average;

        //TODO: Change to output JSON format
        for(Map.Entry<String, WeatherStackRequest> city : cities.entrySet()){
            forecast = city.getValue().getDailyForecasts().get(index);
            average = (forecast.getTemperature().getMinimum().getValue() + forecast.getTemperature().getMaximum().getValue())/2;
            output += city.getKey() + ": " +
                    forecast.getDay().getIconPhrase() + ", " +
                    "MinTemp: " + forecast.getTemperature().getMinimum().getValue() + ", " +
                    "MaxTemp: " + forecast.getTemperature().getMaximum().getValue() + ", " +
                    "Avg: " + average +
                    "\n";
            }

        return output;
    }
}
