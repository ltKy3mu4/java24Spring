package ru.mpei.java24Example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.mpei.java24Example.service.ShortCircuitDetectionService;

@RestController
public class SCController {

    @Autowired
    private ShortCircuitDetectionService service;

    @GetMapping("sc/setpoint")
    public void setSetpoint(@RequestParam double setpoint){
        service.setSetpoint(setpoint);
    }

    @GetMapping("sc/check")
    public boolean checkSc(@RequestParam long ini, @RequestParam long fin){
        return service.checkSC(ini, fin);
    }


}
