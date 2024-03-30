package ru.mpei.java24Example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mpei.java24Example.model.Measurement;
import ru.mpei.java24Example.repo.InMemoryRepository;

@RestController
public class MeasurementsDataController {
    @Autowired
    private InMemoryRepository repo;

    @PostMapping("/save")
    public void saveMeasurement(@RequestBody  Measurement m){
        repo.save(m);
    }

    @GetMapping("/get")
    public Measurement getMeasurement(@RequestParam(value = "measurementId") String id){
        return repo.get(id);
    }

}
