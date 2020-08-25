package edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveQueries;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LastFiveQueries {

    public LastFiveQueries(){}

    @GetMapping(value="/lastFiveQueries")
    public ResponseEntity<String> getLastFiveQueries(@RequestParam(value="date") String date, @RequestParam(value="cities") String cities){
        return ResponseEntity.ok("");
    }
}
