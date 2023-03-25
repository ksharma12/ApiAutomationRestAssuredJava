
package rest_assured_practice.users;
import com.fasterxml.jackson.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "district",
    "pin"
})
@Generated("jsonschema2pojo")
public class Abc {

    @JsonProperty("district")
    private String district;
    @JsonProperty("pin")
    private Integer pin;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("pin")
    public Integer getPin() {
        return pin;
    }

    @JsonProperty("pin")
    public void setPin(Integer pin) {
        this.pin = pin;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
