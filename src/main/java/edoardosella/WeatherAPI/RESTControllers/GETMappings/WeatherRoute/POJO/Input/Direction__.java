package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Degrees",
        "Localized",
        "English"
})
public class Direction__ implements Serializable {

    @JsonProperty("Degrees")
    private long degrees;
    @JsonProperty("Localized")
    private String localized;
    @JsonProperty("English")
    private String english;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8492402220615631168L;

    /**
     * No args constructor for use in serialization
     */
    public Direction__() {
    }

    /**
     * @param localized
     * @param english
     * @param degrees
     */
    public Direction__(long degrees, String localized, String english) {
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

    public Direction__ withDegrees(long degrees) {
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

    public Direction__ withLocalized(String localized) {
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

    public Direction__ withEnglish(String english) {
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

    public Direction__ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
