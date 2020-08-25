
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
    "Degrees",
    "Localized",
    "English"
})
public class Direction_ implements Serializable
{

    @JsonProperty("Degrees")
    private long degrees;
    @JsonProperty("Localized")
    private String localized;
    @JsonProperty("English")
    private String english;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5445443995661352236L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Direction_() {
    }

    /**
     * 
     * @param localized
     * @param english
     * @param degrees
     */
    public Direction_(long degrees, String localized, String english) {
        super();
        this.degrees = degrees;
        this.localized = localized;
        this.english = english;
    }

    @JsonProperty("Degrees")
    public long getDegrees() {
        return degrees;
    }

    @JsonProperty("Degrees")
    public void setDegrees(long degrees) {
        this.degrees = degrees;
    }

    public Direction_ withDegrees(long degrees) {
        this.degrees = degrees;
        return this;
    }

    @JsonProperty("Localized")
    public String getLocalized() {
        return localized;
    }

    @JsonProperty("Localized")
    public void setLocalized(String localized) {
        this.localized = localized;
    }

    public Direction_ withLocalized(String localized) {
        this.localized = localized;
        return this;
    }

    @JsonProperty("English")
    public String getEnglish() {
        return english;
    }

    @JsonProperty("English")
    public void setEnglish(String english) {
        this.english = english;
    }

    public Direction_ withEnglish(String english) {
        this.english = english;
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

    public Direction_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
