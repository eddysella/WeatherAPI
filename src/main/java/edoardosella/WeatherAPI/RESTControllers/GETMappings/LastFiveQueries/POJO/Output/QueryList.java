package edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveQueries.POJO.Output;

import java.util.ArrayList;
import java.util.List;

public class QueryList {

    List<String> routeList;

    public QueryList(){ this.routeList = new ArrayList<>(); }

    public QueryList(List<String> routeList){
        this.routeList = routeList;
    }

    public void addRoute(String route){
        this.routeList.add(route);
    }

    public List<String> getRouteList() {
        return routeList;
    }

    public void setRouteList(List<String> routeList) {
        this.routeList = routeList;
    }
}
