package edoardosella.WeatherAPI.JPA.Repositories.WeatherRoute;

import edoardosella.WeatherAPI.JPA.Models.WeatherRoute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "WeatherRouteRepositoryManager")
public class WeatherRouteManager {

    @Autowired
    private CRUDInterface CRUDInterface;

    public WeatherRouteManager() { }

    public void save(String weatherRoute) {
        truncateTableSize();
        CRUDInterface.save(new WeatherRoute(weatherRoute));
    }

    private void truncateTableSize() {
        if (CRUDInterface.count() == 5) {
            CRUDInterface.delete(CRUDInterface.findTopByOrderByIdAsc());
        }
    }

    public void deleteAll() { CRUDInterface.deleteAll(); }

    public List<WeatherRoute> getAll() { return CRUDInterface.findTop5ByOrderByIdDesc(); }
}
