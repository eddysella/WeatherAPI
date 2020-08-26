package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.WeatherStack;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Name",
        "Value",
        "Category",
        "CategoryValue",
        "Type"
})
public class AirAndPollen implements Serializable {

    @JsonProperty("Name")
    private String name;
    @JsonProperty("Value")
    private long value;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("CategoryValue")
    private long categoryValue;
    @JsonProperty("Type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 970996431767907208L;

    /**
     * No args constructor for use in serialization
     */
    public AirAndPollen() {
    }

    /**
     * @param name
     * @param categoryValue
     * @param category
     * @param type
     * @param value
     */
    public AirAndPollen(String name, long value, String category, long categoryValue, String type) {
        super();
        this.name = name;
        this.value = value;
        this.category = category;
        this.categoryValue = categoryValue;
        this.type = type;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public AirAndPollen withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("Value")
    public long getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(long value) {
        this.value = value;
    }

    public AirAndPollen withValue(long value) {
        this.value = value;
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

    public AirAndPollen withCategory(String category) {
        this.category = category;
        return this;
    }

    @JsonProperty("CategoryValue")
    public long getCategoryValue() {
        return categoryValue;
    }

    @JsonProperty("CategoryValue")
    public void setCategoryValue(long categoryValue) {
        this.categoryValue = categoryValue;
    }

    public AirAndPollen withCategoryValue(long categoryValue) {
        this.categoryValue = categoryValue;
        return this;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    public AirAndPollen withType(String type) {
        this.type = type;
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

    public AirAndPollen withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
