package edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveQueries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LastFiveQueriesController {

    @Autowired
    private LastFiveQueriesResponseProcessor responseProcessor;

    public LastFiveQueriesController() { }

    @GetMapping(value = "/lastFiveQueries")
    public ResponseEntity<String> getLastFiveQueries() {
        String output = this.responseProcessor.getLastFiveQueries();
        return ResponseEntity.ok(output);
    }
}
