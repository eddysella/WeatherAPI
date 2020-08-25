package edoardosella.WeatherAPI.RESTControllers;

import edoardosella.WeatherAPI.HTTPResources.BeautifyResponse;
import edoardosella.WeatherAPI.HTTPResources.JSONManipulator;
import edoardosella.WeatherAPI.HTTPResources.HTTPClient;
import edoardosella.WeatherAPI.POJO.WeatherStackRequest;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class GETMappings {
    private HTTPClient weather;
    private JSONManipulator jsonManipulator;
    private BeautifyResponse beautifier;

    GETMappings(){
        this.weather = new HTTPClient();
        this.jsonManipulator = new JSONManipulator();
        this.beautifier = new BeautifyResponse();
    }

    @GetMapping(value="/")
    public String index(){
        return "Welcome to a Weather REST API service. \n" +
                "The following endpoints are available: \n" +
                "1) /weather : Returns a JSON response with the weather for a specified route \n" +
                "Query Params: \n" +
                "date (i.e. 25-08-2020) + cities (multiple cities separated by '+') \n" +
                "2) /lastFive : Returns the JSON response for each of the last 5 routes which were queried";
    }

    @GetMapping(value="/weather")
    public ResponseEntity<String> getWeatherForRoute(@RequestParam(value="date") String dateParam, @RequestParam(value="cities") String citiesParam){

        int index = calculateDateDifference(dateParam);

        if(index < 0 || index > 4){
            return ResponseEntity.badRequest().build();
        }

        //https://stackoverflow.com/questions/7488643/how-to-convert-comma-separated-string-to-list
        List<String> cities = new ArrayList<String>(Arrays.asList(citiesParam.split("&")));

        Map<String,WeatherStackRequest> responsePOJOs = new HashMap<>();

        for(String city : cities){
            String weatherJSON = this.weather.getFiveDayForecast(city);
            responsePOJOs.put(city, this.jsonManipulator.JSONToWeatherStackRequest(weatherJSON));
        }
        String output = beautifier.fiveDayForecast(responsePOJOs, index);

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
