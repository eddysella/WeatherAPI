package edoardosella.WeatherAPI.Resources;

import com.fasterxml.jackson.databind.ObjectMapper;

//https://mkyong.com/java/jackson-2-convert-java-object-to-from-json/
public class JSONProcessor {

    private ObjectMapper objectMapper;

    public JSONProcessor() {
        this.objectMapper = new ObjectMapper();
    }

    public String objectToJSONString(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            return null;
        }
    }

    public Object jsonToObject(String JSON, Class objClass) {
        try {
            return objectMapper.readValue(JSON, objClass);
        } catch (Exception e) {
            return null;
        }
    }
}
