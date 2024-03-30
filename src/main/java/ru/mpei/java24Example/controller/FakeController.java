package ru.mpei.java24Example.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import ru.mpei.java24Example.model.Person;
import ru.mpei.java24Example.repo.InMemoryRepository;
import ru.mpei.java24Example.service.ConfigState;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class FakeController {
    @Autowired
    private ConfigState state;
    @Autowired
    private InMemoryRepository repository;

    private AtomicInteger age = new AtomicInteger();

//    @PostConstruct
    public void startChange(){
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate( () -> {
                    state.setData(new Person("John", age.incrementAndGet()));
                }, 5000, 5000, TimeUnit.MILLISECONDS
        );
    }

}
