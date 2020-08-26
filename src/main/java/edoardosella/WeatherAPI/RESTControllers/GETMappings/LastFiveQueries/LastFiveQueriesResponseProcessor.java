package edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveQueries;

import edoardosella.WeatherAPI.JPA.Models.PreviousRoute;
import edoardosella.WeatherAPI.JPA.Repositories.PreviousRoutes.PreviousRoutesCRUDInterface;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveQueries.POJO.Output.QueryList;
import edoardosella.WeatherAPI.Resources.JSONProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LastFiveQueriesResponseProcessor {

    @Autowired
    PreviousRoutesCRUDInterface previousRouteRepo;
    JSONProcessor jsonProcessor;

    public LastFiveQueriesResponseProcessor() {
        jsonProcessor = new JSONProcessor();
    }

    public String getLastFiveQueries() {
        String output;
        QueryList queryList = new QueryList();

        if (previousRouteRepo.count() > 0) {
            List<PreviousRoute> lastFiveQueries = previousRouteRepo.findTop5ByOrderByIdDesc();
            for (PreviousRoute route : lastFiveQueries) {
                queryList.addRoute(route.getRoute());
            }
            output = jsonProcessor.objectToJSONString(queryList);

        } else {
            output = "No Queries in Database";
        }

        return output;
    }
}
