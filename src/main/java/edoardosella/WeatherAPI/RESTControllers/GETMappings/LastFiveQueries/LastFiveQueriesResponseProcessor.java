package edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveQueries;

import edoardosella.WeatherAPI.HTTPResources.JSONProcessor;
import edoardosella.WeatherAPI.JPA.Models.PreviousRoute;
import edoardosella.WeatherAPI.JPA.Repositories.PreviousRouteRepo;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveQueries.POJO.Output.QueryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class LastFiveQueriesResponseProcessor {

    @Autowired
    PreviousRouteRepo previousRouteRepo;
    JSONProcessor jsonProcessor;

    public LastFiveQueriesResponseProcessor(){
        jsonProcessor = new JSONProcessor();
    }

    public String getLastFiveQueries(){

        String output = "";
        QueryList queryList = new QueryList();

        if(previousRouteRepo.count() > 0){
            List<PreviousRoute> lastFiveQueries = previousRouteRepo.findLast5ByOrderById();

            for(PreviousRoute route : lastFiveQueries) {
                queryList.addRoute(route.getRoute());
            }

            output = jsonProcessor.objectToJSONString(queryList);
        }else{
            output = "";
        }

        return output;
    }
}
