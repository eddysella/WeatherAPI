package edoardosella.WeatherAPI.RESTControllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GETMappings {

    @GetMapping(value="/")
    public String index(){
        return "Welcome to a Weather REST API service. \n" +
                "The following endpoints are available: \n" +
                "1) /weather : Returns a JSON response with the weather for a specified route \n" +
                "Query Params: \n" +
                "date (i.e. 25/08/2020) + cities (multiple cities separated by '+') \n" +
                "2) /lastFive : Returns the JSON response for each of the last 5 routes which were queried";
    }

    @GetMapping(value="/weather")
    public ResponseEntity<String> getWeatherForRoute(@RequestParam(value="date") String date, @RequestParam(value="cities") String cities){
        return ResponseEntity.ok("");
    }

    @GetMapping(value="/lastFive")
    public ResponseEntity<String> getLastFiveQueries(@RequestParam(value="date") String date, @RequestParam(value="cities") String cities){
        return ResponseEntity.ok("");
    }
}
