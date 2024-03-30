package ru.mpei.java24Example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.mpei.java24Example.model.Substation;
import ru.mpei.java24Example.repo.SubstationsRepository;

import java.util.List;

@RestController
public class SubstationController {

    @Autowired
    private SubstationsRepository repo;

    @GetMapping("substation/get")
    public Substation get(@RequestParam long id){
        Substation byId = repo.getById(id);
        return byId;
    }

    @PostMapping("substation/save")
    public boolean save(@RequestBody Substation newSub){
        return repo.save(newSub);
    }

    @GetMapping("substation/delete")
    public boolean remove(@RequestParam long id){
        return repo.deleteById(id);
    }

    @GetMapping("substation/all")
    public List<Substation> getAll(){
        List<Substation> all = repo.getAll();
        return all;
    }

    @GetMapping("substation/all-for-vclass")
    public List<Substation> getAllForClass(@RequestParam int vc){
        return repo.getAllForVoltageClass(vc);
    }

}
