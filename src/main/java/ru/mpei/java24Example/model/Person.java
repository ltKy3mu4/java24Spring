package ru.mpei.java24Example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @JsonProperty("nameOfPerson")
    private String name;

    @JsonProperty("ageOfPerson")
    private int age;

    @JsonIgnore
    private String nickName;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
