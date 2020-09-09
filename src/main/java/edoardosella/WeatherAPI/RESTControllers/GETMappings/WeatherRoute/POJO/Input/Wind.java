package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Speed",
        "Direction"
})
public class Wind implements Serializable {

    private final static long serialVersionUID = -8201313255909778984L;
    @JsonProperty("Speed")
    private Speed speed;
    @JsonProperty("Direction")
    private Direction direction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Wind() {
    }

    /**
     * @param speed
     * @param direction
     */
    public Wind(Speed speed, Direction direction) {
        super();
        this.speed = speed;
        this.direction = direction;
    }

    @JsonProperty("Speed")
    public Speed getSpeed() {
        return speed;
    }

    @JsonProperty("Speed")
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Wind withSpeed(Speed speed) {
        this.speed = speed;
        return this;
    }

    @JsonProperty("Direction")
    public Direction getDirection() {
        return direction;
    }

    @JsonProperty("Direction")
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Wind withDirection(Direction direction) {
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

    public Wind withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
