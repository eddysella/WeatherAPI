package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Headline",
        "DailyForecasts"
})
public class WeatherStack implements Serializable {

    @JsonProperty("Headline")
    private Headline headline;
    @JsonProperty("DailyForecasts")
    private List<DailyForecast> dailyForecasts = new ArrayList<DailyForecast>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5782077206797781806L;

    /**
     * No args constructor for use in serialization
     */
    public WeatherStack() {
    }

    /**
     * @param headline
     * @param dailyForecasts
     */
    public WeatherStack(Headline headline, List<DailyForecast> dailyForecasts) {
        super();
        this.headline = headline;
        this.dailyForecasts = dailyForecasts;
    }

    @JsonProperty("Headline")
    public Headline getHeadline() {
        return headline;
    }

    @JsonProperty("Headline")
    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

    public WeatherStack withHeadline(Headline headline) {
        this.headline = headline;
        return this;
    }

    @JsonProperty("DailyForecasts")
    public List<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }

    @JsonProperty("DailyForecasts")
    public void setDailyForecasts(List<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

    public WeatherStack withDailyForecasts(List<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
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

    public WeatherStack withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
