package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ResponseProcessor responseProcessor;

    Controller(){}

    @GetMapping(value="/weatherRoute")
    public ResponseEntity<String> getWeatherRoute(@RequestParam(value="date") String dateParam, @RequestParam(value="cities") String citiesParam, @RequestParam(value="apikey", defaultValue = "null") String apiKey){

        int dateDifference = calculateDateDifference(dateParam);

        if(dateDifference < 0 || dateDifference > 4){
            return ResponseEntity.badRequest().build();
        }

        String output = this.responseProcessor.processRequest(citiesParam, apiKey, dateDifference);

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
