package org.daniels.examples.model;

import org.daniels.examples.serializer.UserSerializer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = UserSerializer.class)
public class User {
 
    @JsonProperty(value="userName")
    private String name;
    @JsonProperty(value="userAge")
    private Integer age;
    @JsonProperty(value="userHeight")
    private Double height;
    @JsonProperty(value="isUserMarried")
    private Boolean married;
 
    public User() {
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
