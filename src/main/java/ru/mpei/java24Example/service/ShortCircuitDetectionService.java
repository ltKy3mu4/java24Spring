package ru.mpei.java24Example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mpei.java24Example.model.Sample;
import ru.mpei.java24Example.repo.MeasurementRepository;

import java.util.List;

@Service
public class ShortCircuitDetectionService {

    @Autowired
    private MeasurementRepository repo;

    private double setpoint = 100;

    public boolean checkSC(long ini, long end){
        //1. get data from repo
        List<Sample> samples = repo.getForPeriod(ini, end);
        //2. calculate current value
        double[] doubles = currentValues(samples);
        //3. check if current exceeds setpoint
        for (double d : doubles) {
            if (d > setpoint){
                return true;
            }
        }
        return false;
    }

    public void setSetpoint(double setpoint) {
        this.setpoint = setpoint;
    }

    private double[] currentValues(List<Sample> samples){
        return new double[]{};
    }

}
