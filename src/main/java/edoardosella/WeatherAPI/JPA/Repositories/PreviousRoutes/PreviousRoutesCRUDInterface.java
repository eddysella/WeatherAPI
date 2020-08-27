package edoardosella.WeatherAPI.JPA.Repositories.PreviousRoutes;

import edoardosella.WeatherAPI.JPA.Models.PreviousRoute;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PreviousRoutesCRUDInterface extends CrudRepository<PreviousRoute, Long> {
    //https://stackoverflow.com/questions/27567351/get-last-records-ordered-by-data-on-spring-data
    List<PreviousRoute> findTop5ByOrderByIdDesc();

    PreviousRoute findTopByOrderByIdAsc();
}
