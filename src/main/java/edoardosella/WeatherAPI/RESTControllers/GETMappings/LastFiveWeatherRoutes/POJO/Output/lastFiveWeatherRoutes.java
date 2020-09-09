package edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveWeatherRoutes.POJO.Output;

import edoardosella.WeatherAPI.JPA.Models.WeatherRoute;

import java.util.ArrayList;
import java.util.List;

public class lastFiveWeatherRoutes {

    private List<String> routeList;

    public lastFiveWeatherRoutes() {
        this.routeList = new ArrayList<>();
    }

    public lastFiveWeatherRoutes(List<String> routeList) {
        this.routeList = routeList;
    }

    public void addRoute(String route) {
        this.routeList.add(route);
    }

    public List<String> getRouteList() {
        return routeList;
    }

    public void setRouteList(List<String> routeList) {
        this.routeList = routeList;
    }

    public void addRoutes(List<WeatherRoute> weatherRoutes) {
        for (WeatherRoute route : weatherRoutes) {
            routeList.add(route.getRoute());
        }
    }
}
