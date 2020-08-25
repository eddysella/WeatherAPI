
package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Rise",
    "EpochRise",
    "Set",
    "EpochSet",
    "Phase",
    "Age"
})
public class Moon implements Serializable
{

    @JsonProperty("Rise")
    private String rise;
    @JsonProperty("EpochRise")
    private long epochRise;
    @JsonProperty("Set")
    private String set;
    @JsonProperty("EpochSet")
    private long epochSet;
    @JsonProperty("Phase")
    private String phase;
    @JsonProperty("Age")
    private long age;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8559117829373077627L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Moon() {
    }

    /**
     * 
     * @param phase
     * @param set
     * @param epochRise
     * @param epochSet
     * @param rise
     * @param age
     */
    public Moon(String rise, long epochRise, String set, long epochSet, String phase, long age) {
        super();
        this.rise = rise;
        this.epochRise = epochRise;
        this.set = set;
        this.epochSet = epochSet;
        this.phase = phase;
        this.age = age;
    }

    @JsonProperty("Rise")
    public String getRise() {
        return rise;
    }

    @JsonProperty("Rise")
    public void setRise(String rise) {
        this.rise = rise;
    }

    public Moon withRise(String rise) {
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

    public Moon withEpochRise(long epochRise) {
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

    public Moon withSet(String set) {
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

    public Moon withEpochSet(long epochSet) {
        this.epochSet = epochSet;
        return this;
    }

    @JsonProperty("Phase")
    public String getPhase() {
        return phase;
    }

    @JsonProperty("Phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Moon withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    @JsonProperty("Age")
    public long getAge() {
        return age;
    }

    @JsonProperty("Age")
    public void setAge(long age) {
        this.age = age;
    }

    public Moon withAge(long age) {
        this.age = age;
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

    public Moon withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
