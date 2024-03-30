package ru.mpei.java24Example.repo;

import ru.mpei.java24Example.model.Sample;

import java.util.List;

public interface MeasurementRepository {

    List<Sample> getForPeriod(long start, long end );

}
