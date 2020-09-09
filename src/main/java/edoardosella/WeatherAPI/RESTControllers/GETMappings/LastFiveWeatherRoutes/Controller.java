package edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveWeatherRoutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Scope("request")
@RestController(value = "GETLastFiveWeatherRoutesController")
class Controller {

    @Autowired
    private ResponseProcessor responseProcessor;

    Controller() { }

    @GetMapping(value = "/lastFiveWeatherRoutes")
    ResponseEntity<String> getLastFiveWeatherRoutes() {
        return ResponseEntity.ok(responseProcessor.getResponseString());
    }
}
