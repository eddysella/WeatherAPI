package edoardosella.WeatherAPI.RESTControllers.DELETEMappings.LastFiveWeatherRoutes;

import edoardosella.WeatherAPI.JPA.Repositories.WeatherRoute.WeatherRouteManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@Scope("request")
@RestController(value = "DELETELastFiveWeatherRoutes")
class Controller {

    @Autowired
    private WeatherRouteManager weatherRouteManager;

    Controller() { }

    @DeleteMapping(value = "/lastFiveWeatherRoutes")
    ResponseEntity<String> deleteLastFiveWeatherRoutes() {
        weatherRouteManager.deleteAll();
        return ResponseEntity.ok("All previous routes deleted");
    }
}
