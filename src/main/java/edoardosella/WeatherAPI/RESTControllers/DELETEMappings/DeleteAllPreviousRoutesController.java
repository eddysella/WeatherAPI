package edoardosella.WeatherAPI.RESTControllers.DELETEMappings;

import edoardosella.WeatherAPI.JPA.Repositories.PreviousRoutes.PreviousRoutesCRUDInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteAllPreviousRoutesController {

    @Autowired
    PreviousRoutesCRUDInterface previousRouteRepo;

    public DeleteAllPreviousRoutesController(){}

    @DeleteMapping(value = "/lastFiveQueries")
    public ResponseEntity<String> deleteAllPreviousRoutes() {
        previousRouteRepo.deleteAll();

        return ResponseEntity.ok("All previous routes deleted");
    }
}
