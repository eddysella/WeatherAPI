
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
    "lon",
    "lat"
})
public class Coord implements Serializable
{

    @JsonProperty("lon")
    private long lon;
    @JsonProperty("lat")
    private long lat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7469542953742887733L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Coord() {
    }

    /**
     * 
     * @param lon
     * @param lat
     */
    public Coord(long lon, long lat) {
        super();
        this.lon = lon;
        this.lat = lat;
    }

    @JsonProperty("lon")
    public long getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(long lon) {
        this.lon = lon;
    }

    public Coord withLon(long lon) {
        this.lon = lon;
        return this;
    }

    @JsonProperty("lat")
    public long getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(long lat) {
        this.lat = lat;
    }

    public Coord withLat(long lat) {
        this.lat = lat;
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

    public Coord withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
