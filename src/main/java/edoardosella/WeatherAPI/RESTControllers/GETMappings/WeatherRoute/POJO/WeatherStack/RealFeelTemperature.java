
package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Minimum",
    "Maximum"
})
public class RealFeelTemperature implements Serializable
{

    @JsonProperty("Minimum")
    private Minimum_ minimum;
    @JsonProperty("Maximum")
    private Maximum_ maximum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4669933434570462284L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RealFeelTemperature() {
    }

    /**
     * 
     * @param maximum
     * @param minimum
     */
    public RealFeelTemperature(Minimum_ minimum, Maximum_ maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @JsonProperty("Minimum")
    public Minimum_ getMinimum() {
        return minimum;
    }

    @JsonProperty("Minimum")
    public void setMinimum(Minimum_ minimum) {
        this.minimum = minimum;
    }

    public RealFeelTemperature withMinimum(Minimum_ minimum) {
        this.minimum = minimum;
        return this;
    }

    @JsonProperty("Maximum")
    public Maximum_ getMaximum() {
        return maximum;
    }

    @JsonProperty("Maximum")
    public void setMaximum(Maximum_ maximum) {
        this.maximum = maximum;
    }

    public RealFeelTemperature withMaximum(Maximum_ maximum) {
        this.maximum = maximum;
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

    public RealFeelTemperature withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
