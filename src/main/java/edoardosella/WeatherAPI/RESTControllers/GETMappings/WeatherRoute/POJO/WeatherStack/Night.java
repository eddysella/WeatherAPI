
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
public class Night implements Serializable
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
    private Wind_ wind;
    @JsonProperty("WindGust")
    private WindGust_ windGust;
    @JsonProperty("TotalLiquid")
    private TotalLiquid_ totalLiquid;
    @JsonProperty("Rain")
    private Rain_ rain;
    @JsonProperty("Snow")
    private Snow_ snow;
    @JsonProperty("Ice")
    private Ice_ ice;
    @JsonProperty("HoursOfPrecipitation")
    private long hoursOfPrecipitation;
    @JsonProperty("HoursOfRain")
    private long hoursOfRain;
    @JsonProperty("HoursOfSnow")
    private long hoursOfSnow;
    @JsonProperty("HoursOfIce")
    private long hoursOfIce;
    @JsonProperty("CloudCover")
    private long cloudCover;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 71558975972539805L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Night() {
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
    public Night(long icon, String iconPhrase, boolean hasPrecipitation, String precipitationType, String precipitationIntensity, String shortPhrase, String longPhrase, long precipitationProbability, long thunderstormProbability, long rainProbability, long snowProbability, long iceProbability, Wind_ wind, WindGust_ windGust, TotalLiquid_ totalLiquid, Rain_ rain, Snow_ snow, Ice_ ice, long hoursOfPrecipitation, long hoursOfRain, long hoursOfSnow, long hoursOfIce, long cloudCover) {
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

    public Night withIcon(long icon) {
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

    public Night withIconPhrase(String iconPhrase) {
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

    public Night withHasPrecipitation(boolean hasPrecipitation) {
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

    public Night withPrecipitationType(String precipitationType) {
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

    public Night withPrecipitationIntensity(String precipitationIntensity) {
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

    public Night withShortPhrase(String shortPhrase) {
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

    public Night withLongPhrase(String longPhrase) {
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

    public Night withPrecipitationProbability(long precipitationProbability) {
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

    public Night withThunderstormProbability(long thunderstormProbability) {
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

    public Night withRainProbability(long rainProbability) {
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

    public Night withSnowProbability(long snowProbability) {
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

    public Night withIceProbability(long iceProbability) {
        this.iceProbability = iceProbability;
        return this;
    }

    @JsonProperty("Wind")
    public Wind_ getWind() {
        return wind;
    }

    @JsonProperty("Wind")
    public void setWind(Wind_ wind) {
        this.wind = wind;
    }

    public Night withWind(Wind_ wind) {
        this.wind = wind;
        return this;
    }

    @JsonProperty("WindGust")
    public WindGust_ getWindGust() {
        return windGust;
    }

    @JsonProperty("WindGust")
    public void setWindGust(WindGust_ windGust) {
        this.windGust = windGust;
    }

    public Night withWindGust(WindGust_ windGust) {
        this.windGust = windGust;
        return this;
    }

    @JsonProperty("TotalLiquid")
    public TotalLiquid_ getTotalLiquid() {
        return totalLiquid;
    }

    @JsonProperty("TotalLiquid")
    public void setTotalLiquid(TotalLiquid_ totalLiquid) {
        this.totalLiquid = totalLiquid;
    }

    public Night withTotalLiquid(TotalLiquid_ totalLiquid) {
        this.totalLiquid = totalLiquid;
        return this;
    }

    @JsonProperty("Rain")
    public Rain_ getRain() {
        return rain;
    }

    @JsonProperty("Rain")
    public void setRain(Rain_ rain) {
        this.rain = rain;
    }

    public Night withRain(Rain_ rain) {
        this.rain = rain;
        return this;
    }

    @JsonProperty("Snow")
    public Snow_ getSnow() {
        return snow;
    }

    @JsonProperty("Snow")
    public void setSnow(Snow_ snow) {
        this.snow = snow;
    }

    public Night withSnow(Snow_ snow) {
        this.snow = snow;
        return this;
    }

    @JsonProperty("Ice")
    public Ice_ getIce() {
        return ice;
    }

    @JsonProperty("Ice")
    public void setIce(Ice_ ice) {
        this.ice = ice;
    }

    public Night withIce(Ice_ ice) {
        this.ice = ice;
        return this;
    }

    @JsonProperty("HoursOfPrecipitation")
    public long getHoursOfPrecipitation() {
        return hoursOfPrecipitation;
    }

    @JsonProperty("HoursOfPrecipitation")
    public void setHoursOfPrecipitation(long hoursOfPrecipitation) {
        this.hoursOfPrecipitation = hoursOfPrecipitation;
    }

    public Night withHoursOfPrecipitation(long hoursOfPrecipitation) {
        this.hoursOfPrecipitation = hoursOfPrecipitation;
        return this;
    }

    @JsonProperty("HoursOfRain")
    public long getHoursOfRain() {
        return hoursOfRain;
    }

    @JsonProperty("HoursOfRain")
    public void setHoursOfRain(long hoursOfRain) {
        this.hoursOfRain = hoursOfRain;
    }

    public Night withHoursOfRain(long hoursOfRain) {
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

    public Night withHoursOfSnow(long hoursOfSnow) {
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

    public Night withHoursOfIce(long hoursOfIce) {
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

    public Night withCloudCover(long cloudCover) {
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

    public Night withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
