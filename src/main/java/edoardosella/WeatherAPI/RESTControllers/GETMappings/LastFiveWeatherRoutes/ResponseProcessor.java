package edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveWeatherRoutes;

import edoardosella.WeatherAPI.JPA.Repositories.WeatherRoute.WeatherRouteManager;
import edoardosella.WeatherAPI.RESTControllers.GETMappings.LastFiveWeatherRoutes.POJO.Output.lastFiveWeatherRoutes;
import edoardosella.WeatherAPI.Resources.JSONProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "GETLastFiveWeatherRoutesResponseProcessor")
class ResponseProcessor {

    @Autowired
    private WeatherRouteManager weatherRouteManager;
    private JSONProcessor jsonProcessor;

    public ResponseProcessor() {
        jsonProcessor = new JSONProcessor();
    }

    String getResponseString() { return jsonProcessor.objectToJSONString(compileQueryLastFiveWeatherRoutes()); }

    private lastFiveWeatherRoutes compileQueryLastFiveWeatherRoutes() {
        lastFiveWeatherRoutes routes = new lastFiveWeatherRoutes();
        routes.addRoutes(weatherRouteManager.getAll());
        return routes;
    }
}
