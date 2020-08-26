package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.util.regex.PatternSyntaxException;

@RestController
public class WeatherRouteController {

    @Autowired
    private WeatherRouteResponseProcessor responseProcessor;

    WeatherRouteController(){}

    @GetMapping(value = "/weatherRoute")
    public ResponseEntity<String> getWeatherRoute(@RequestParam(value = "date") String dateParam, @RequestParam(value = "cities") String citiesParam, @RequestParam(value = "apikey", defaultValue = "null") String apiKey) {
        String output;
        int dateDifference;
        try{
             dateDifference = calculateDateDifference(dateParam);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid date param Format");
        }

        if (dateDifference < 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Date already passed");
        }

        if (dateDifference < 0 || dateDifference > 4) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Date too far in the future (max 4 days ahead)");
        }

        if (!(validateCitiesParam(citiesParam))){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid cities param format");
        }

        try{
            output = this.responseProcessor.processRequest(citiesParam, apiKey, dateDifference);
        } catch (MalformedURLException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("API key invalid or Weather service unavailable " + e.getMessage());
        } catch (PatternSyntaxException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid cities param format");
        }

        return ResponseEntity.ok(output);
    }

    //https://stackoverflow.com/questions/3299972/difference-in-days-between-two-dates-in-java
    private int calculateDateDifference(String past) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy");
        DateTime pastDate = DateTime.parse(past, formatter).withTimeAtStartOfDay();
        DateTime today = new DateTime().withTimeAtStartOfDay();
        return Days.daysBetween(today, pastDate).getDays();
    }

    //https://www.geeksforgeeks.org/how-to-check-if-string-contains-only-digits-in-java/
    private boolean validateCitiesParam(String cities){
        for (int i = 0; i < cities.length(); i++) {
            if (!(Character.isDigit(cities.charAt(i)) || cities.charAt(i) == '&')){
                return false;
            }
        }
        return true;
    }
}
