package edoardosella.WeatherAPI.JPA.Repositories.PreviousRoutes;

import edoardosella.WeatherAPI.JPA.Models.PreviousRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PreviousRoutesManager {

    @Autowired
    PreviousRoutesCRUDInterface previousRouteRepo;

    public PreviousRoutesManager() { }

    public void save(PreviousRoute previousRoute) {
        truncateTableSize();
        previousRouteRepo.save(previousRoute);
    }

    private void truncateTableSize() {
        if (previousRouteRepo.count() == 5) {
            previousRouteRepo.delete(previousRouteRepo.findTopByOrderByIdAsc());
        }
    }
}
