package edoardosella.WeatherAPI.HTTPResources;

import com.fasterxml.jackson.databind.ObjectMapper;
import edoardosella.WeatherAPI.POJO.WeatherStackRequest;

//https://mkyong.com/java/jackson-2-convert-java-object-to-from-json/
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

    public WeatherStackRequest JSONToWeatherStackRequest(String JSON){
        try {
            return objectMapper.readValue(JSON, WeatherStackRequest.class);

        }catch(Exception e){
            return null;
        }
    }
}
