
package rest_assured_practice.multipleUsers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "flatNo",
    "street",
    "abc"
})
@Generated("jsonschema2pojo")
public class Address {

    @JsonProperty("flatNo")
    private Integer flatNo;
    @JsonProperty("street")
    private String street;
    @JsonProperty("abc")
    @Valid
    private List<Abc> abc;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("flatNo")
    public Integer getFlatNo() {
        return flatNo;
    }

    @JsonProperty("flatNo")
    public void setFlatNo(Integer flatNo) {
        this.flatNo = flatNo;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("abc")
    public List<Abc> getAbc() {
        return abc;
    }

    @JsonProperty("abc")
    public void setAbc(List<Abc> abc) {
        this.abc = abc;
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
