package edoardosella.WeatherAPI.JPA.Repositories.WeatherRoute;

import edoardosella.WeatherAPI.JPA.Models.WeatherRoute;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CRUDInterface extends CrudRepository<WeatherRoute, Long> {

    List<WeatherRoute> findTop5ByOrderByIdDesc();

    WeatherRoute findTopByOrderByIdAsc();
}
