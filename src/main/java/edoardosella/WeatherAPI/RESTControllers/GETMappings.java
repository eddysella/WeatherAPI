package edoardosella.WeatherAPI.RESTControllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GETMappings {

    @GetMapping(value="/")
    public String index(){
        return "hello";
    }

    @GetMapping(value="/test")
    public ResponseEntity<String> getWeather(){
        return ResponseEntity.ok("hello");
    }

    @GetMapping(value="/getweather")
    public ResponseEntity<String> getWeatherForRoute(@RequestParam(value="date") String date, @RequestParam(value="cities") String cities){
        return ResponseEntity.ok(date + cities);
    }
}
