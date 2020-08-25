package edoardosella.WeatherAPI.OWM_API;

import com.fasterxml.jackson.databind.ObjectMapper;
import edoardosella.WeatherAPI.DailyPOJO.DailyWeatherStackRequest;
import edoardosella.WeatherAPI.HourlyPOJO.HourlyWeatherStackRequest;

public class JSONManipulator {

    private ObjectMapper objectMapper;

    public JSONManipulator(){
        this.objectMapper = new ObjectMapper();
    }

    public String javaToJSON(Object object){
        try {
            return objectMapper.writeValueAsString(object);

        }catch(Exception e){
            return null;
        }
    }

    public HourlyWeatherStackRequest JSONToHourlyWeatherStack(String JSON){
        try {
            return objectMapper.readValue(JSON, HourlyWeatherStackRequest.class);

        }catch(Exception e){
            return null;
        }
    }

    public DailyWeatherStackRequest JSONToDailyWeatherStack(String JSON){
        try {
            return objectMapper.readValue(JSON, DailyWeatherStackRequest.class);

        }catch(Exception e){
            return null;
        }
    }

}
