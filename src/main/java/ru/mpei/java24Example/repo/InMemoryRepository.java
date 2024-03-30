package ru.mpei.java24Example.repo;

import org.springframework.stereotype.Repository;
import ru.mpei.java24Example.model.Measurement;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryRepository {
    private Map<String, Double> storage = new HashMap<>();

    public void save(Measurement m){
        storage.put(m.getName(), m.getValue());
    }


    public Measurement get(String id){
        if (storage.containsKey(id)) {
            return new Measurement(id, storage.get(id));
        } else {
            throw new RuntimeException("no element found");
        }
    }



}
