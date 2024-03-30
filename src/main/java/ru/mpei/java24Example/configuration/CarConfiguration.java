package ru.mpei.java24Example.configuration;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mpei.java24Example.model.Car;

@Configuration
public class CarConfiguration {

    @Bean
    public Car car(){
        Car c = new Car();
        c.setAge(20);
        c.setModel("Jiguli");
        return c;
    }

    @Bean
    public ObjectMapper mapper(){
        ObjectMapper m = new ObjectMapper();
        m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return m;
    }

}
