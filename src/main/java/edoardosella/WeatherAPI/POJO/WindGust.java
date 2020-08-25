
package edoardosella.WeatherAPI.POJO;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Speed",
    "Direction"
})
public class WindGust implements Serializable
{

    @JsonProperty("Speed")
    private Speed_ speed;
    @JsonProperty("Direction")
    private Direction_ direction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1292531963106098496L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WindGust() {
    }

    /**
     * 
     * @param speed
     * @param direction
     */
    public WindGust(Speed_ speed, Direction_ direction) {
        super();
        this.speed = speed;
        this.direction = direction;
    }

    @JsonProperty("Speed")
    public Speed_ getSpeed() {
        return speed;
    }

    @JsonProperty("Speed")
    public void setSpeed(Speed_ speed) {
        this.speed = speed;
    }

    public WindGust withSpeed(Speed_ speed) {
        this.speed = speed;
        return this;
    }

    @JsonProperty("Direction")
    public Direction_ getDirection() {
        return direction;
    }

    @JsonProperty("Direction")
    public void setDirection(Direction_ direction) {
        this.direction = direction;
    }

    public WindGust withDirection(Direction_ direction) {
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

    public WindGust withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
