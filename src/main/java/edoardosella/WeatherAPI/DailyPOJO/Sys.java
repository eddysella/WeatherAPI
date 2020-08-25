
package edoardosella.WeatherAPI.DailyPOJO;

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
    "type",
    "id",
    "message",
    "country",
    "sunrise",
    "sunset"
})
public class Sys implements Serializable
{

    @JsonProperty("type")
    private long type;
    @JsonProperty("id")
    private long id;
    @JsonProperty("message")
    private double message;
    @JsonProperty("country")
    private String country;
    @JsonProperty("sunrise")
    private long sunrise;
    @JsonProperty("sunset")
    private long sunset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3462714839285816105L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sys() {
    }

    /**
     * 
     * @param country
     * @param sunrise
     * @param sunset
     * @param id
     * @param type
     * @param message
     */
    public Sys(long type, long id, double message, String country, long sunrise, long sunset) {
        super();
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    @JsonProperty("type")
    public long getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(long type) {
        this.type = type;
    }

    public Sys withType(long type) {
        this.type = type;
        return this;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Sys withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("message")
    public double getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(double message) {
        this.message = message;
    }

    public Sys withMessage(double message) {
        this.message = message;
        return this;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Sys withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("sunrise")
    public long getSunrise() {
        return sunrise;
    }

    @JsonProperty("sunrise")
    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public Sys withSunrise(long sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    @JsonProperty("sunset")
    public long getSunset() {
        return sunset;
    }

    @JsonProperty("sunset")
    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public Sys withSunset(long sunset) {
        this.sunset = sunset;
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

    public Sys withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
