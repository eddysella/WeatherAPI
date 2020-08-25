
package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Icon",
    "IconPhrase",
    "HasPrecipitation",
    "PrecipitationType",
    "PrecipitationIntensity",
    "ShortPhrase",
    "LongPhrase",
    "PrecipitationProbability",
    "ThunderstormProbability",
    "RainProbability",
    "SnowProbability",
    "IceProbability",
    "Wind",
    "WindGust",
    "TotalLiquid",
    "Rain",
    "Snow",
    "Ice",
    "HoursOfPrecipitation",
    "HoursOfRain",
    "HoursOfSnow",
    "HoursOfIce",
    "CloudCover"
})
public class Day implements Serializable
{

    @JsonProperty("Icon")
    private long icon;
    @JsonProperty("IconPhrase")
    private String iconPhrase;
    @JsonProperty("HasPrecipitation")
    private boolean hasPrecipitation;
    @JsonProperty("PrecipitationType")
    private String precipitationType;
    @JsonProperty("PrecipitationIntensity")
    private String precipitationIntensity;
    @JsonProperty("ShortPhrase")
    private String shortPhrase;
    @JsonProperty("LongPhrase")
    private String longPhrase;
    @JsonProperty("PrecipitationProbability")
    private long precipitationProbability;
    @JsonProperty("ThunderstormProbability")
    private long thunderstormProbability;
    @JsonProperty("RainProbability")
    private long rainProbability;
    @JsonProperty("SnowProbability")
    private long snowProbability;
    @JsonProperty("IceProbability")
    private long iceProbability;
    @JsonProperty("Wind")
    private Wind wind;
    @JsonProperty("WindGust")
    private WindGust windGust;
    @JsonProperty("TotalLiquid")
    private TotalLiquid totalLiquid;
    @JsonProperty("Rain")
    private Rain rain;
    @JsonProperty("Snow")
    private Snow snow;
    @JsonProperty("Ice")
    private Ice ice;
    @JsonProperty("HoursOfPrecipitation")
    private double hoursOfPrecipitation;
    @JsonProperty("HoursOfRain")
    private double hoursOfRain;
    @JsonProperty("HoursOfSnow")
    private long hoursOfSnow;
    @JsonProperty("HoursOfIce")
    private long hoursOfIce;
    @JsonProperty("CloudCover")
    private long cloudCover;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2310495539072701008L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Day() {
    }

    /**
     * 
     * @param hoursOfPrecipitation
     * @param precipitationProbability
     * @param rain
     * @param hoursOfSnow
     * @param precipitationIntensity
     * @param windGust
     * @param thunderstormProbability
     * @param icon
     * @param longPhrase
     * @param cloudCover
     * @param iconPhrase
     * @param ice
     * @param snowProbability
     * @param rainProbability
     * @param hasPrecipitation
     * @param precipitationType
     * @param snow
     * @param hoursOfRain
     * @param totalLiquid
     * @param shortPhrase
     * @param iceProbability
     * @param hoursOfIce
     * @param wind
     */
    public Day(long icon, String iconPhrase, boolean hasPrecipitation, String precipitationType, String precipitationIntensity, String shortPhrase, String longPhrase, long precipitationProbability, long thunderstormProbability, long rainProbability, long snowProbability, long iceProbability, Wind wind, WindGust windGust, TotalLiquid totalLiquid, Rain rain, Snow snow, Ice ice, double hoursOfPrecipitation, double hoursOfRain, long hoursOfSnow, long hoursOfIce, long cloudCover) {
        super();
        this.icon = icon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
        this.precipitationType = precipitationType;
        this.precipitationIntensity = precipitationIntensity;
        this.shortPhrase = shortPhrase;
        this.longPhrase = longPhrase;
        this.precipitationProbability = precipitationProbability;
        this.thunderstormProbability = thunderstormProbability;
        this.rainProbability = rainProbability;
        this.snowProbability = snowProbability;
        this.iceProbability = iceProbability;
        this.wind = wind;
        this.windGust = windGust;
        this.totalLiquid = totalLiquid;
        this.rain = rain;
        this.snow = snow;
        this.ice = ice;
        this.hoursOfPrecipitation = hoursOfPrecipitation;
        this.hoursOfRain = hoursOfRain;
        this.hoursOfSnow = hoursOfSnow;
        this.hoursOfIce = hoursOfIce;
        this.cloudCover = cloudCover;
    }

    @JsonProperty("Icon")
    public long getIcon() {
        return icon;
    }

    @JsonProperty("Icon")
    public void setIcon(long icon) {
        this.icon = icon;
    }

    public Day withIcon(long icon) {
        this.icon = icon;
        return this;
    }

    @JsonProperty("IconPhrase")
    public String getIconPhrase() {
        return iconPhrase;
    }

    @JsonProperty("IconPhrase")
    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public Day withIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
        return this;
    }

    @JsonProperty("HasPrecipitation")
    public boolean isHasPrecipitation() {
        return hasPrecipitation;
    }

    @JsonProperty("HasPrecipitation")
    public void setHasPrecipitation(boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }

    public Day withHasPrecipitation(boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
        return this;
    }

    @JsonProperty("PrecipitationType")
    public String getPrecipitationType() {
        return precipitationType;
    }

    @JsonProperty("PrecipitationType")
    public void setPrecipitationType(String precipitationType) {
        this.precipitationType = precipitationType;
    }

    public Day withPrecipitationType(String precipitationType) {
        this.precipitationType = precipitationType;
        return this;
    }

    @JsonProperty("PrecipitationIntensity")
    public String getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    @JsonProperty("PrecipitationIntensity")
    public void setPrecipitationIntensity(String precipitationIntensity) {
        this.precipitationIntensity = precipitationIntensity;
    }

    public Day withPrecipitationIntensity(String precipitationIntensity) {
        this.precipitationIntensity = precipitationIntensity;
        return this;
    }

    @JsonProperty("ShortPhrase")
    public String getShortPhrase() {
        return shortPhrase;
    }

    @JsonProperty("ShortPhrase")
    public void setShortPhrase(String shortPhrase) {
        this.shortPhrase = shortPhrase;
    }

    public Day withShortPhrase(String shortPhrase) {
        this.shortPhrase = shortPhrase;
        return this;
    }

    @JsonProperty("LongPhrase")
    public String getLongPhrase() {
        return longPhrase;
    }

    @JsonProperty("LongPhrase")
    public void setLongPhrase(String longPhrase) {
        this.longPhrase = longPhrase;
    }

    public Day withLongPhrase(String longPhrase) {
        this.longPhrase = longPhrase;
        return this;
    }

    @JsonProperty("PrecipitationProbability")
    public long getPrecipitationProbability() {
        return precipitationProbability;
    }

    @JsonProperty("PrecipitationProbability")
    public void setPrecipitationProbability(long precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public Day withPrecipitationProbability(long precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
        return this;
    }

    @JsonProperty("ThunderstormProbability")
    public long getThunderstormProbability() {
        return thunderstormProbability;
    }

    @JsonProperty("ThunderstormProbability")
    public void setThunderstormProbability(long thunderstormProbability) {
        this.thunderstormProbability = thunderstormProbability;
    }

    public Day withThunderstormProbability(long thunderstormProbability) {
        this.thunderstormProbability = thunderstormProbability;
        return this;
    }

    @JsonProperty("RainProbability")
    public long getRainProbability() {
        return rainProbability;
    }

    @JsonProperty("RainProbability")
    public void setRainProbability(long rainProbability) {
        this.rainProbability = rainProbability;
    }

    public Day withRainProbability(long rainProbability) {
        this.rainProbability = rainProbability;
        return this;
    }

    @JsonProperty("SnowProbability")
    public long getSnowProbability() {
        return snowProbability;
    }

    @JsonProperty("SnowProbability")
    public void setSnowProbability(long snowProbability) {
        this.snowProbability = snowProbability;
    }

    public Day withSnowProbability(long snowProbability) {
        this.snowProbability = snowProbability;
        return this;
    }

    @JsonProperty("IceProbability")
    public long getIceProbability() {
        return iceProbability;
    }

    @JsonProperty("IceProbability")
    public void setIceProbability(long iceProbability) {
        this.iceProbability = iceProbability;
    }

    public Day withIceProbability(long iceProbability) {
        this.iceProbability = iceProbability;
        return this;
    }

    @JsonProperty("Wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("Wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Day withWind(Wind wind) {
        this.wind = wind;
        return this;
    }

    @JsonProperty("WindGust")
    public WindGust getWindGust() {
        return windGust;
    }

    @JsonProperty("WindGust")
    public void setWindGust(WindGust windGust) {
        this.windGust = windGust;
    }

    public Day withWindGust(WindGust windGust) {
        this.windGust = windGust;
        return this;
    }

    @JsonProperty("TotalLiquid")
    public TotalLiquid getTotalLiquid() {
        return totalLiquid;
    }

    @JsonProperty("TotalLiquid")
    public void setTotalLiquid(TotalLiquid totalLiquid) {
        this.totalLiquid = totalLiquid;
    }

    public Day withTotalLiquid(TotalLiquid totalLiquid) {
        this.totalLiquid = totalLiquid;
        return this;
    }

    @JsonProperty("Rain")
    public Rain getRain() {
        return rain;
    }

    @JsonProperty("Rain")
    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Day withRain(Rain rain) {
        this.rain = rain;
        return this;
    }

    @JsonProperty("Snow")
    public Snow getSnow() {
        return snow;
    }

    @JsonProperty("Snow")
    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public Day withSnow(Snow snow) {
        this.snow = snow;
        return this;
    }

    @JsonProperty("Ice")
    public Ice getIce() {
        return ice;
    }

    @JsonProperty("Ice")
    public void setIce(Ice ice) {
        this.ice = ice;
    }

    public Day withIce(Ice ice) {
        this.ice = ice;
        return this;
    }

    @JsonProperty("HoursOfPrecipitation")
    public double getHoursOfPrecipitation() {
        return hoursOfPrecipitation;
    }

    @JsonProperty("HoursOfPrecipitation")
    public void setHoursOfPrecipitation(double hoursOfPrecipitation) {
        this.hoursOfPrecipitation = hoursOfPrecipitation;
    }

    public Day withHoursOfPrecipitation(double hoursOfPrecipitation) {
        this.hoursOfPrecipitation = hoursOfPrecipitation;
        return this;
    }

    @JsonProperty("HoursOfRain")
    public double getHoursOfRain() {
        return hoursOfRain;
    }

    @JsonProperty("HoursOfRain")
    public void setHoursOfRain(double hoursOfRain) {
        this.hoursOfRain = hoursOfRain;
    }

    public Day withHoursOfRain(double hoursOfRain) {
        this.hoursOfRain = hoursOfRain;
        return this;
    }

    @JsonProperty("HoursOfSnow")
    public long getHoursOfSnow() {
        return hoursOfSnow;
    }

    @JsonProperty("HoursOfSnow")
    public void setHoursOfSnow(long hoursOfSnow) {
        this.hoursOfSnow = hoursOfSnow;
    }

    public Day withHoursOfSnow(long hoursOfSnow) {
        this.hoursOfSnow = hoursOfSnow;
        return this;
    }

    @JsonProperty("HoursOfIce")
    public long getHoursOfIce() {
        return hoursOfIce;
    }

    @JsonProperty("HoursOfIce")
    public void setHoursOfIce(long hoursOfIce) {
        this.hoursOfIce = hoursOfIce;
    }

    public Day withHoursOfIce(long hoursOfIce) {
        this.hoursOfIce = hoursOfIce;
        return this;
    }

    @JsonProperty("CloudCover")
    public long getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("CloudCover")
    public void setCloudCover(long cloudCover) {
        this.cloudCover = cloudCover;
    }

    public Day withCloudCover(long cloudCover) {
        this.cloudCover = cloudCover;
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

    public Day withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
