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
        String  output = jsonProcessor.objectToJSONString(compileQueryListFromRepo());
        return output;
    }

    private QueryList compileQueryListFromRepo() {
        QueryList queryList = new QueryList();
        List<PreviousRoute> lastFiveQueries = previousRouteRepo.findTop5ByOrderByIdDesc();
        for (PreviousRoute route : lastFiveQueries) {
            queryList.addRoute(route.getRoute());
        }
        return queryList;
    }
}
