
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
public class RealFeelTemperatureShade implements Serializable
{

    @JsonProperty("Minimum")
    private Minimum__ minimum;
    @JsonProperty("Maximum")
    private Maximum__ maximum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7299356619766965391L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RealFeelTemperatureShade() {
    }

    /**
     * 
     * @param maximum
     * @param minimum
     */
    public RealFeelTemperatureShade(Minimum__ minimum, Maximum__ maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @JsonProperty("Minimum")
    public Minimum__ getMinimum() {
        return minimum;
    }

    @JsonProperty("Minimum")
    public void setMinimum(Minimum__ minimum) {
        this.minimum = minimum;
    }

    public RealFeelTemperatureShade withMinimum(Minimum__ minimum) {
        this.minimum = minimum;
        return this;
    }

    @JsonProperty("Maximum")
    public Maximum__ getMaximum() {
        return maximum;
    }

    @JsonProperty("Maximum")
    public void setMaximum(Maximum__ maximum) {
        this.maximum = maximum;
    }

    public RealFeelTemperatureShade withMaximum(Maximum__ maximum) {
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

    public RealFeelTemperatureShade withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
