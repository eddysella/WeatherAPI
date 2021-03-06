package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Heating",
        "Cooling"
})
public class DegreeDaySummary implements Serializable {

    private final static long serialVersionUID = 8955844351252750771L;
    @JsonProperty("Heating")
    private Heating heating;
    @JsonProperty("Cooling")
    private Cooling cooling;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public DegreeDaySummary() {
    }

    /**
     * @param cooling
     * @param heating
     */
    public DegreeDaySummary(Heating heating, Cooling cooling) {
        super();
        this.heating = heating;
        this.cooling = cooling;
    }

    @JsonProperty("Heating")
    public Heating getHeating() {
        return heating;
    }

    @JsonProperty("Heating")
    public void setHeating(Heating heating) {
        this.heating = heating;
    }

    public DegreeDaySummary withHeating(Heating heating) {
        this.heating = heating;
        return this;
    }

    @JsonProperty("Cooling")
    public Cooling getCooling() {
        return cooling;
    }

    @JsonProperty("Cooling")
    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }

    public DegreeDaySummary withCooling(Cooling cooling) {
        this.cooling = cooling;
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

    public DegreeDaySummary withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
