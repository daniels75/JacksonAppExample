package org.daniels.examples.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = false)
//@JsonIgnoreProperties(value = {"name"})
public class User2 {
 

    private String name;

    private Integer age;

    private Double height;
    @JsonProperty(value="isUserMarried")
    private Boolean married;
 
    public User2() {
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
 
    public Double getHeight() {
        return height;
    }
 
    public void setHeight(Double height) {
        this.height = height;
    }
 
    public Boolean getMarried() {
        return married;
    }
 
    public void setMarried(Boolean married) {
        this.married = married;
    }
 
    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", height=" + height
                + ", married=" + married + "]";
    }
}
