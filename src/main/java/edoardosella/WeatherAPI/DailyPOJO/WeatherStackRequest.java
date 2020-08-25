
package edoardosella.WeatherAPI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coord",
    "weather",
    "base",
    "main",
    "wind",
    "clouds",
    "dt",
    "sys",
    "timezone",
    "id",
    "name",
    "cod"
})
public class WeatherStackRequest implements Serializable
{

    @JsonProperty("coord")
    private Coord coord;
    @JsonProperty("weather")
    private List<Weather> weather = new ArrayList<Weather>();
    @JsonProperty("base")
    private String base;
    @JsonProperty("main")
    private Main main;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("clouds")
    private Clouds clouds;
    @JsonProperty("dt")
    private long dt;
    @JsonProperty("sys")
    private Sys sys;
    @JsonProperty("timezone")
    private long timezone;
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cod")
    private long cod;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6564216358832926233L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeatherStackRequest() {
    }

    /**
     * 
     * @param dt
     * @param coord
     * @param timezone
     * @param weather
     * @param name
     * @param cod
     * @param main
     * @param clouds
     * @param id
     * @param sys
     * @param base
     * @param wind
     */
    public WeatherStackRequest(Coord coord, List<Weather> weather, String base, Main main, Wind wind, Clouds clouds, long dt, Sys sys, long timezone, long id, String name, long cod) {
        super();
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.timezone = timezone;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    @JsonProperty("coord")
    public Coord getCoord() {
        return coord;
    }

    @JsonProperty("coord")
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public WeatherStackRequest withCoord(Coord coord) {
        this.coord = coord;
        return this;
    }

    @JsonProperty("weather")
    public List<Weather> getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public WeatherStackRequest withWeather(List<Weather> weather) {
        this.weather = weather;
        return this;
    }

    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    public WeatherStackRequest withBase(String base) {
        this.base = base;
        return this;
    }

    @JsonProperty("main")
    public Main getMain() {
        return main;
    }

    @JsonProperty("main")
    public void setMain(Main main) {
        this.main = main;
    }

    public WeatherStackRequest withMain(Main main) {
        this.main = main;
        return this;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public WeatherStackRequest withWind(Wind wind) {
        this.wind = wind;
        return this;
    }

    @JsonProperty("clouds")
    public Clouds getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public WeatherStackRequest withClouds(Clouds clouds) {
        this.clouds = clouds;
        return this;
    }

    @JsonProperty("dt")
    public long getDt() {
        return dt;
    }

    @JsonProperty("dt")
    public void setDt(long dt) {
        this.dt = dt;
    }

    public WeatherStackRequest withDt(long dt) {
        this.dt = dt;
        return this;
    }

    @JsonProperty("sys")
    public Sys getSys() {
        return sys;
    }

    @JsonProperty("sys")
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public WeatherStackRequest withSys(Sys sys) {
        this.sys = sys;
        return this;
    }

    @JsonProperty("timezone")
    public long getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(long timezone) {
        this.timezone = timezone;
    }

    public WeatherStackRequest withTimezone(long timezone) {
        this.timezone = timezone;
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

    public WeatherStackRequest withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public WeatherStackRequest withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("cod")
    public long getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(long cod) {
        this.cod = cod;
    }

    public WeatherStackRequest withCod(long cod) {
        this.cod = cod;
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
