package edoardosella.WeatherAPI.RESTControllers.GETMappings;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @GetMapping(value = "/")
    public ResponseEntity<String> index() {
        String output = "Welcome to a Weather REST API service. \n" +
                        "The following endpoints are available: \n" +
                        "1) /weatherRoute : Returns a JSON response with the weather for each city in a specified route \n" +
                        "Query Params: \n" +
                        "date: the date of travel (i.e. dd-MM-yyyy), must be within the next 5 days\n" +
                        "cities: one/multiple city ids separated by '&' \n" +
                        "apikey: an API key from :  https://developer.accuweather.com/packages (limited trial should suffice) \n" +
                        "2) /lastFive : Returns the JSON response for each of the last 5 routes which were queried";

        return ResponseEntity.ok(output);
    }
}
