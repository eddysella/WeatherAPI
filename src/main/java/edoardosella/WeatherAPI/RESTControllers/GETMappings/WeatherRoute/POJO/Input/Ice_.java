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
public class Ice_ implements Serializable {

    private final static long serialVersionUID = 2725503247146513682L;
    @JsonProperty("Value")
    private long value;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("UnitType")
    private long unitType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Ice_() {
    }

    /**
     * @param unitType
     * @param unit
     * @param value
     */
    public Ice_(long value, String unit, long unitType) {
        super();
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    @JsonProperty("Value")
    public long getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(long value) {
        this.value = value;
    }

    public Ice_ withValue(long value) {
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

    public Ice_ withUnit(String unit) {
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

    public Ice_ withUnitType(long unitType) {
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

    public Ice_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
