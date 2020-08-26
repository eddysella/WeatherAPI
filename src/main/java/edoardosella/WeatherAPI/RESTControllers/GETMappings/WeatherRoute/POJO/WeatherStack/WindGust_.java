package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Speed",
        "Direction"
})
public class WindGust_ implements Serializable {

    @JsonProperty("Speed")
    private Speed___ speed;
    @JsonProperty("Direction")
    private Direction___ direction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7445103135052185268L;

    /**
     * No args constructor for use in serialization
     */
    public WindGust_() {
    }

    /**
     * @param speed
     * @param direction
     */
    public WindGust_(Speed___ speed, Direction___ direction) {
        super();
        this.speed = speed;
        this.direction = direction;
    }

    @JsonProperty("Speed")
    public Speed___ getSpeed() {
        return speed;
    }

    @JsonProperty("Speed")
    public void setSpeed(Speed___ speed) {
        this.speed = speed;
    }

    public WindGust_ withSpeed(Speed___ speed) {
        this.speed = speed;
        return this;
    }

    @JsonProperty("Direction")
    public Direction___ getDirection() {
        return direction;
    }

    @JsonProperty("Direction")
    public void setDirection(Direction___ direction) {
        this.direction = direction;
    }

    public WindGust_ withDirection(Direction___ direction) {
        this.direction = direction;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public WindGust_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
