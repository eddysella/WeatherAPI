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
public class Wind_ implements Serializable {

    @JsonProperty("Speed")
    private Speed__ speed;
    @JsonProperty("Direction")
    private Direction__ direction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8729486840724470260L;

    /**
     * No args constructor for use in serialization
     */
    public Wind_() {
    }

    /**
     * @param speed
     * @param direction
     */
    public Wind_(Speed__ speed, Direction__ direction) {
        super();
        this.speed = speed;
        this.direction = direction;
    }

    @JsonProperty("Speed")
    public Speed__ getSpeed() {
        return speed;
    }

    @JsonProperty("Speed")
    public void setSpeed(Speed__ speed) {
        this.speed = speed;
    }

    public Wind_ withSpeed(Speed__ speed) {
        this.speed = speed;
        return this;
    }

    @JsonProperty("Direction")
    public Direction__ getDirection() {
        return direction;
    }

    @JsonProperty("Direction")
    public void setDirection(Direction__ direction) {
        this.direction = direction;
    }

    public Wind_ withDirection(Direction__ direction) {
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

    public Wind_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
