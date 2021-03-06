package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Rise",
        "EpochRise",
        "Set",
        "EpochSet"
})
public class Sun implements Serializable {

    private final static long serialVersionUID = -4126886112465535586L;
    @JsonProperty("Rise")
    private String rise;
    @JsonProperty("EpochRise")
    private long epochRise;
    @JsonProperty("Set")
    private String set;
    @JsonProperty("EpochSet")
    private long epochSet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Sun() {
    }

    /**
     * @param set
     * @param epochRise
     * @param epochSet
     * @param rise
     */
    public Sun(String rise, long epochRise, String set, long epochSet) {
        super();
        this.rise = rise;
        this.epochRise = epochRise;
        this.set = set;
        this.epochSet = epochSet;
    }

    @JsonProperty("Rise")
    public String getRise() {
        return rise;
    }

    @JsonProperty("Rise")
    public void setRise(String rise) {
        this.rise = rise;
    }

    public Sun withRise(String rise) {
        this.rise = rise;
        return this;
    }

    @JsonProperty("EpochRise")
    public long getEpochRise() {
        return epochRise;
    }

    @JsonProperty("EpochRise")
    public void setEpochRise(long epochRise) {
        this.epochRise = epochRise;
    }

    public Sun withEpochRise(long epochRise) {
        this.epochRise = epochRise;
        return this;
    }

    @JsonProperty("Set")
    public String getSet() {
        return set;
    }

    @JsonProperty("Set")
    public void setSet(String set) {
        this.set = set;
    }

    public Sun withSet(String set) {
        this.set = set;
        return this;
    }

    @JsonProperty("EpochSet")
    public long getEpochSet() {
        return epochSet;
    }

    @JsonProperty("EpochSet")
    public void setEpochSet(long epochSet) {
        this.epochSet = epochSet;
    }

    public Sun withEpochSet(long epochSet) {
        this.epochSet = epochSet;
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

    public Sun withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
