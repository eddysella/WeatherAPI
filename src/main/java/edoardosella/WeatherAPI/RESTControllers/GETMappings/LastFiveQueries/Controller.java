package edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveQueries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private ResponseProcessor responseProcessor;

    public Controller(){}

    @GetMapping(value="/lastFiveQueries")
    public ResponseEntity<String> getLastFiveQueries(){

        String output = this.responseProcessor.getLastFiveQueries();

        return ResponseEntity.ok(output);
    }
}
