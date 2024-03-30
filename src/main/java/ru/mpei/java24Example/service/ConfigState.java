package ru.mpei.java24Example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mpei.java24Example.model.Car;
import ru.mpei.java24Example.model.Person;

import java.io.File;

/**
 * this class is aimed to parse initial json configuration
 */
@Service
public class ConfigState {

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private Car c;
    private Person data;

    @PostConstruct
    @SneakyThrows
    public void readIniCfg(){
        String path = "src/main/resources/iniCfg.json";
//        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(new File(path), Person.class);
        this.setData(person);
    }

    public void setData(Person p) {
        this.data = p;
        System.out.println("NEW STATE: "+data);
    }

    public Person getData(){
        return data;
    }

}
