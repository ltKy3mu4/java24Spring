package ru.mpei.java24Example.repo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.mpei.java24Example.model.Substation;

@Repository
public class SubstationsRepository {

    @PersistenceContext
    private EntityManager entityManager;

//
//    public boolean save(Substation s){
//        entityManager.persist(s);
//        return true;
//    }

    public Substation getById(long id){
        Substation substation = entityManager.find(Substation.class, id);
        return substation;
    }


}
