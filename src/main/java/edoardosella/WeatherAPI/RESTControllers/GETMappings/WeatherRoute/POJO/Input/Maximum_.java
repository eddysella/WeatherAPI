package edoardosella.WeatherAPI.RESTControllers.GETMappings.WeatherRoute.POJO.Input;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Value",
        "Unit",
        "UnitType"
})
public class Maximum_ implements Serializable {

    private final static long serialVersionUID = 5748200301911706688L;
    @JsonProperty("Value")
    private double value;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("UnitType")
    private long unitType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Maximum_() {
    }

    /**
     * @param unitType
     * @param unit
     * @param value
     */
    public Maximum_(double value, String unit, long unitType) {
        super();
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    @JsonProperty("Value")
    public double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(double value) {
        this.value = value;
    }

    public Maximum_ withValue(double value) {
        this.value = value;
        return this;
    }

    @JsonProperty("Unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("Unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Maximum_ withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @JsonProperty("UnitType")
    public long getUnitType() {
        return unitType;
    }

    @JsonProperty("UnitType")
    public void setUnitType(long unitType) {
        this.unitType = unitType;
    }

    public Maximum_ withUnitType(long unitType) {
        this.unitType = unitType;
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

    public Maximum_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
