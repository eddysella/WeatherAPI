package edoardosella.WeatherAPI.RESTControllers.GETMappings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @GetMapping(value="/")
    public String index(){
        return "Welcome to a Weather REST API service. \n" +
                "The following endpoints are available: \n" +
                "1) /weather : Returns a JSON response with the weather for a specified route \n" +
                "Query Params: \n" +
                "date (i.e. dd-MM-yyyy) + cities (multiple cities separated by '+') \n" +
                "2) /lastFive : Returns the JSON response for each of the last 5 routes which were queried";
    }
}
