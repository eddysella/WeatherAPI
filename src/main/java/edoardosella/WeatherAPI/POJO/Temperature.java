
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
    "Minimum",
    "Maximum"
})
public class Temperature implements Serializable
{

    @JsonProperty("Minimum")
    private Minimum minimum;
    @JsonProperty("Maximum")
    private Maximum maximum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -188345012849043267L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Temperature() {
    }

    /**
     * 
     * @param maximum
     * @param minimum
     */
    public Temperature(Minimum minimum, Maximum maximum) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @JsonProperty("Minimum")
    public Minimum getMinimum() {
        return minimum;
    }

    @JsonProperty("Minimum")
    public void setMinimum(Minimum minimum) {
        this.minimum = minimum;
    }

    public Temperature withMinimum(Minimum minimum) {
        this.minimum = minimum;
        return this;
    }

    @JsonProperty("Maximum")
    public Maximum getMaximum() {
        return maximum;
    }

    @JsonProperty("Maximum")
    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
    }

    public Temperature withMaximum(Maximum maximum) {
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

    public Temperature withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
