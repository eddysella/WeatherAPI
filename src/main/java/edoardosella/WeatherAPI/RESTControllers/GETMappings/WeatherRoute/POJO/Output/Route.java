package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Output;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private List<City> route;

    public Route(){
        this.route = new ArrayList<>();
    }

    public Route(ArrayList<City> route){
        this.route = route;
    }

    public void addCity(City city){
        route.add(city);
    }

    public List<City> getRoute() {
        return route;
    }

    public void setRoute(List<City> route) {
        this.route = route;
    }
}
