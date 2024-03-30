package ru.mpei.java24Example.model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private ObjectMapper m = new ObjectMapper();

    @Test
    @SneakyThrows
    void serializationTest1(){
        Person p = new Person("jack", 18, "Sparrow");
        String s = m.writeValueAsString(p);
        System.out.println(s);
    }

    @Test
    @SneakyThrows
    void deserializationTest1(){
        String json = "{\"nameOfPerson\":\"jack\",\"ageOfPerson\":18,\"nickName\":\"Sparrow\"}";
        Person person = m.readValue(json, Person.class);
        System.out.println(person);
    }

    @BeforeEach
    void configureMapper(){
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}