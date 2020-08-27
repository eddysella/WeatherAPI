package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "EffectiveDate",
        "EffectiveEpochDate",
        "Severity",
        "Text",
        "Category",
        "EndDate",
        "EndEpochDate",
        "MobileLink",
        "Link"
})
public class Headline implements Serializable {

    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("EffectiveEpochDate")
    private long effectiveEpochDate;
    @JsonProperty("Severity")
    private long severity;
    @JsonProperty("Text")
    private String text;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("EndDate")
    private String endDate;
    @JsonProperty("EndEpochDate")
    private long endEpochDate;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4441126259839612215L;

    /**
     * No args constructor for use in serialization
     */
    public Headline() {
    }

    /**
     * @param severity
     * @param endEpochDate
     * @param effectiveEpochDate
     * @param endDate
     * @param link
     * @param text
     * @param category
     * @param mobileLink
     * @param effectiveDate
     */
    public Headline(String effectiveDate, long effectiveEpochDate, long severity, String text, String category, String endDate, long endEpochDate, String mobileLink, String link) {
        super();
        this.effectiveDate = effectiveDate;
        this.effectiveEpochDate = effectiveEpochDate;
        this.severity = severity;
        this.text = text;
        this.category = category;
        this.endDate = endDate;
        this.endEpochDate = endEpochDate;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    @JsonProperty("EffectiveDate")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    @JsonProperty("EffectiveDate")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Headline withEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    @JsonProperty("EffectiveEpochDate")
    public long getEffectiveEpochDate() {
        return effectiveEpochDate;
    }

    @JsonProperty("EffectiveEpochDate")
    public void setEffectiveEpochDate(long effectiveEpochDate) {
        this.effectiveEpochDate = effectiveEpochDate;
    }

    public Headline withEffectiveEpochDate(long effectiveEpochDate) {
        this.effectiveEpochDate = effectiveEpochDate;
        return this;
    }

    @JsonProperty("Severity")
    public long getSeverity() {
        return severity;
    }

    @JsonProperty("Severity")
    public void setSeverity(long severity) {
        this.severity = severity;
    }

    public Headline withSeverity(long severity) {
        this.severity = severity;
        return this;
    }

    @JsonProperty("Text")
    public String getText() {
        return text;
    }

    @JsonProperty("Text")
    public void setText(String text) {
        this.text = text;
    }

    public Headline withText(String text) {
        this.text = text;
        return this;
    }

    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(String category) {
        this.category = category;
    }

    public Headline withCategory(String category) {
        this.category = category;
        return this;
    }

    @JsonProperty("EndDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Headline withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("EndEpochDate")
    public long getEndEpochDate() {
        return endEpochDate;
    }

    @JsonProperty("EndEpochDate")
    public void setEndEpochDate(long endEpochDate) {
        this.endEpochDate = endEpochDate;
    }

    public Headline withEndEpochDate(long endEpochDate) {
        this.endEpochDate = endEpochDate;
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

    public Headline withMobileLink(String mobileLink) {
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

    public Headline withLink(String link) {
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

    public Headline withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
