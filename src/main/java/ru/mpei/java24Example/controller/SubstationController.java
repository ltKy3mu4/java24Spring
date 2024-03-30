package ru.mpei.java24Example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mpei.java24Example.model.Substation;
import ru.mpei.java24Example.repo.SubstationsRepository;

@RestController
public class SubstationController {

    @Autowired
    private SubstationsRepository repo;

    @GetMapping("substation/get")
    public Substation get(@RequestParam long id){
        return repo.getById(id);
    }

}
