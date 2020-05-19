package com.sysco.sample.api.response.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "data"
})
public class EmployeeGridRes {
    @JsonProperty("status")
    public String status;
    @JsonProperty("data")
    public List<Datum> data = null;
    /**
     * No args constructor for use in serialization
     *
     */
    public EmployeeGridRes() {
    }
    /**
     *
     * @param data
     * @param status
     */
    public EmployeeGridRes (String status, List<Datum> data) {
        super();
        this.status = status;
        this.data = data;
    }
}