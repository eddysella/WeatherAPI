
package edoardosella.WeatherAPI.POJO;

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
    "Value",
    "Unit",
    "UnitType"
})
public class Snow implements Serializable
{

    @JsonProperty("Value")
    private long value;
    @JsonProperty("Unit")
    private String unit;
    @JsonProperty("UnitType")
    private long unitType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3204255503448959686L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Snow() {
    }

    /**
     * 
     * @param unitType
     * @param unit
     * @param value
     */
    public Snow(long value, String unit, long unitType) {
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

    public Snow withValue(long value) {
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

    public Snow withUnit(String unit) {
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

    public Snow withUnitType(long unitType) {
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

    public Snow withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}