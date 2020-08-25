package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import edoardosella.WeatherAPI.HTTPResources.HTTPClient;
import edoardosella.WeatherAPI.HTTPResources.Processors.JSONProcessor;
import edoardosella.WeatherAPI.HTTPResources.Processors.ResponseProcessor;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack.WeatherStack;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class WeatherRoute {
    private HTTPClient weather;
    private JSONProcessor jsonProcessor;
    private ResponseProcessor responseProcessor;

    WeatherRoute(){
        this.weather = new HTTPClient();
        this.jsonProcessor = new JSONProcessor();
        this.responseProcessor = new ResponseProcessor();
    }

    @GetMapping(value="/weatherRoute")
    public ResponseEntity<String> getWeatherRoute(@RequestParam(value="date") String dateParam, @RequestParam(value="cities") String citiesParam){

        int dateDifference = calculateDateDifference(dateParam);

        if(dateDifference < 0 || dateDifference > 4){
            return ResponseEntity.badRequest().build();
        }

        //https://stackoverflow.com/questions/7488643/how-to-convert-comma-separated-string-to-list
        List<String> cities = new ArrayList<String>(Arrays.asList(citiesParam.split("&")));

        Map<String, WeatherStack> responsePOJOs = new HashMap<>();
        WeatherStack weatherStack = new WeatherStack();

        for(String city : cities){
            String weatherJSON = this.weather.getFiveDayForecast(city);
            weatherStack = (WeatherStack) this.jsonProcessor.jsonToObject(weatherJSON, WeatherStack.class);
            responsePOJOs.put(city, weatherStack);
        }

        String output = this.responseProcessor.getWeatherRoute(responsePOJOs, dateDifference);

        return ResponseEntity.ok(output);
    }

    //https://stackoverflow.com/questions/3299972/difference-in-days-between-two-dates-in-java
    private int calculateDateDifference(String past){
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy");
        DateTime pastDate = DateTime.parse(past, formatter).withTimeAtStartOfDay();
        DateTime today = new DateTime().withTimeAtStartOfDay();

        return Days.daysBetween(today, pastDate).getDays();
    }
}
