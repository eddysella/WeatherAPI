
package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Date",
    "EpochDate",
    "Sun",
    "Moon",
    "Temperature",
    "RealFeelTemperature",
    "RealFeelTemperatureShade",
    "HoursOfSun",
    "DegreeDaySummary",
    "AirAndPollen",
    "Day",
    "Night",
    "Sources",
    "MobileLink",
    "Link"
})
public class DailyForecast implements Serializable
{

    @JsonProperty("Date")
    private String date;
    @JsonProperty("EpochDate")
    private long epochDate;
    @JsonProperty("Sun")
    private Sun sun;
    @JsonProperty("Moon")
    private Moon moon;
    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonProperty("RealFeelTemperature")
    private RealFeelTemperature realFeelTemperature;
    @JsonProperty("RealFeelTemperatureShade")
    private RealFeelTemperatureShade realFeelTemperatureShade;
    @JsonProperty("HoursOfSun")
    private double hoursOfSun;
    @JsonProperty("DegreeDaySummary")
    private DegreeDaySummary degreeDaySummary;
    @JsonProperty("AirAndPollen")
    private List<AirAndPollen> airAndPollen = new ArrayList<AirAndPollen>();
    @JsonProperty("Day")
    private Day day;
    @JsonProperty("Night")
    private Night night;
    @JsonProperty("Sources")
    private List<String> sources = new ArrayList<String>();
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4111529110006201835L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DailyForecast() {
    }

    /**
     * 
     * @param date
     * @param airAndPollen
     * @param sources
     * @param night
     * @param link
     * @param sun
     * @param mobileLink
     * @param moon
     * @param epochDate
     * @param temperature
     * @param degreeDaySummary
     * @param realFeelTemperatureShade
     * @param realFeelTemperature
     * @param day
     * @param hoursOfSun
     */
    public DailyForecast(String date, long epochDate, Sun sun, Moon moon, Temperature temperature, RealFeelTemperature realFeelTemperature, RealFeelTemperatureShade realFeelTemperatureShade, double hoursOfSun, DegreeDaySummary degreeDaySummary, List<AirAndPollen> airAndPollen, Day day, Night night, List<String> sources, String mobileLink, String link) {
        super();
        this.date = date;
        this.epochDate = epochDate;
        this.sun = sun;
        this.moon = moon;
        this.temperature = temperature;
        this.realFeelTemperature = realFeelTemperature;
        this.realFeelTemperatureShade = realFeelTemperatureShade;
        this.hoursOfSun = hoursOfSun;
        this.degreeDaySummary = degreeDaySummary;
        this.airAndPollen = airAndPollen;
        this.day = day;
        this.night = night;
        this.sources = sources;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    public DailyForecast withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("EpochDate")
    public long getEpochDate() {
        return epochDate;
    }

    @JsonProperty("EpochDate")
    public void setEpochDate(long epochDate) {
        this.epochDate = epochDate;
    }

    public DailyForecast withEpochDate(long epochDate) {
        this.epochDate = epochDate;
        return this;
    }

    @JsonProperty("Sun")
    public Sun getSun() {
        return sun;
    }

    @JsonProperty("Sun")
    public void setSun(Sun sun) {
        this.sun = sun;
    }

    public DailyForecast withSun(Sun sun) {
        this.sun = sun;
        return this;
    }

    @JsonProperty("Moon")
    public Moon getMoon() {
        return moon;
    }

    @JsonProperty("Moon")
    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    public DailyForecast withMoon(Moon moon) {
        this.moon = moon;
        return this;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public DailyForecast withTemperature(Temperature temperature) {
        this.temperature = temperature;
        return this;
    }

    @JsonProperty("RealFeelTemperature")
    public RealFeelTemperature getRealFeelTemperature() {
        return realFeelTemperature;
    }

    @JsonProperty("RealFeelTemperature")
    public void setRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }

    public DailyForecast withRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
        return this;
    }

    @JsonProperty("RealFeelTemperatureShade")
    public RealFeelTemperatureShade getRealFeelTemperatureShade() {
        return realFeelTemperatureShade;
    }

    @JsonProperty("RealFeelTemperatureShade")
    public void setRealFeelTemperatureShade(RealFeelTemperatureShade realFeelTemperatureShade) {
        this.realFeelTemperatureShade = realFeelTemperatureShade;
    }

    public DailyForecast withRealFeelTemperatureShade(RealFeelTemperatureShade realFeelTemperatureShade) {
        this.realFeelTemperatureShade = realFeelTemperatureShade;
        return this;
    }

    @JsonProperty("HoursOfSun")
    public double getHoursOfSun() {
        return hoursOfSun;
    }

    @JsonProperty("HoursOfSun")
    public void setHoursOfSun(double hoursOfSun) {
        this.hoursOfSun = hoursOfSun;
    }

    public DailyForecast withHoursOfSun(double hoursOfSun) {
        this.hoursOfSun = hoursOfSun;
        return this;
    }

    @JsonProperty("DegreeDaySummary")
    public DegreeDaySummary getDegreeDaySummary() {
        return degreeDaySummary;
    }

    @JsonProperty("DegreeDaySummary")
    public void setDegreeDaySummary(DegreeDaySummary degreeDaySummary) {
        this.degreeDaySummary = degreeDaySummary;
    }

    public DailyForecast withDegreeDaySummary(DegreeDaySummary degreeDaySummary) {
        this.degreeDaySummary = degreeDaySummary;
        return this;
    }

    @JsonProperty("AirAndPollen")
    public List<AirAndPollen> getAirAndPollen() {
        return airAndPollen;
    }

    @JsonProperty("AirAndPollen")
    public void setAirAndPollen(List<AirAndPollen> airAndPollen) {
        this.airAndPollen = airAndPollen;
    }

    public DailyForecast withAirAndPollen(List<AirAndPollen> airAndPollen) {
        this.airAndPollen = airAndPollen;
        return this;
    }

    @JsonProperty("Day")
    public Day getDay() {
        return day;
    }

    @JsonProperty("Day")
    public void setDay(Day day) {
        this.day = day;
    }

    public DailyForecast withDay(Day day) {
        this.day = day;
        return this;
    }

    @JsonProperty("Night")
    public Night getNight() {
        return night;
    }

    @JsonProperty("Night")
    public void setNight(Night night) {
        this.night = night;
    }

    public DailyForecast withNight(Night night) {
        this.night = night;
        return this;
    }

    @JsonProperty("Sources")
    public List<String> getSources() {
        return sources;
    }

    @JsonProperty("Sources")
    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public DailyForecast withSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return mobileLink;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public DailyForecast withMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
        return this;
    }

    @JsonProperty("Link")
    public String getLink() {
        return link;
    }

    @JsonProperty("Link")
    public void setLink(String link) {
        this.link = link;
    }

    public DailyForecast withLink(String link) {
        this.link = link;
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

    public DailyForecast withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
