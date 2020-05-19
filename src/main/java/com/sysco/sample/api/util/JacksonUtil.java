package com.sysco.sample.api.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.syscolab.qe.core.common.LoggerUtil;

import java.io.IOException;

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
        "id",
        "employee_name",
        "employee_salary",
        "employee_age",
        "profile_image"
})
public class JacksonUtil {

    @JsonProperty("id")
    private Object id;
    @JsonProperty("employee_name")
    private Object employeeName;
    @JsonProperty("employee_salary")
    private Object employeeSalary;
    @JsonProperty("employee_age")
    private Object employeeAge;
    @JsonProperty("profile_image")
    private Object profileImage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    @JsonProperty("employee_name")
    public Object getEmployeeName() {
        return employeeName;
    }

    @JsonProperty("employee_name")
    public void setEmployeeName(Object employeeName) {
        this.employeeName = employeeName;
    }

    @JsonProperty("employee_salary")
    public Object getEmployeeSalary() {
        return employeeSalary;
    }

    @JsonProperty("employee_salary")
    public void setEmployeeSalary(Object employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @JsonProperty("employee_age")
    public Object getEmployeeAge() {
        return employeeAge;
    }

    @JsonProperty("employee_age")
    public void setEmployeeAge(Object employeeAge) {
        this.employeeAge = employeeAge;
    }

    @JsonProperty("profile_image")
    public Object getProfileImage() {
        return profileImage;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(Object profileImage) {
        this.profileImage = profileImage;
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