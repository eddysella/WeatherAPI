
package edoardosella.WeatherAPI.HourlyPOJO;

import java.util.ArrayList;
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
    "cod",
    "message",
    "cnt",
    "list",
    "city"
})
public class WeatherStackRequest {

    @JsonProperty("cod")
    private String cod;
    @JsonProperty("message")
    private double message;
    @JsonProperty("cnt")
    private long cnt;
    @JsonProperty("list")
    private java.util.List<edoardosella.WeatherAPI.HourlyPOJO.List> list = new ArrayList<>();
    @JsonProperty("city")
    private City city;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeatherStackRequest() {
    }

    /**
     * 
     * @param city
     * @param cnt
     * @param cod
     * @param message
     * @param list
     */
    public WeatherStackRequest(String cod, double message, long cnt, java.util.List<edoardosella.WeatherAPI.HourlyPOJO.List> list, City city) {
        super();
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.list = list;
        this.city = city;
    }

    @JsonProperty("cod")
    public String getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(String cod) {
        this.cod = cod;
    }

    public WeatherStackRequest withCod(String cod) {
        this.cod = cod;
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

    public WeatherStackRequest withMessage(double message) {
        this.message = message;
        return this;
    }

    @JsonProperty("cnt")
    public long getCnt() {
        return cnt;
    }

    @JsonProperty("cnt")
    public void setCnt(long cnt) {
        this.cnt = cnt;
    }

    public WeatherStackRequest withCnt(long cnt) {
        this.cnt = cnt;
        return this;
    }

    @JsonProperty("list")
    public java.util.List<edoardosella.WeatherAPI.HourlyPOJO.List> getList() {
        return list;
    }

    @JsonProperty("list")
    public void setList(java.util.List<edoardosella.WeatherAPI.HourlyPOJO.List> list) {
        this.list = list;
    }

    public WeatherStackRequest withList(java.util.List<edoardosella.WeatherAPI.HourlyPOJO.List> list) {
        this.list = list;
        return this;
    }

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    public WeatherStackRequest withCity(City city) {
        this.city = city;
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

    public WeatherStackRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
