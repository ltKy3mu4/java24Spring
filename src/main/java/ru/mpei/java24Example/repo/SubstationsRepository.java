package ru.mpei.java24Example.repo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ru.mpei.java24Example.model.Substation;

import java.util.List;

@Repository
@Transactional
public class SubstationsRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public boolean save(Substation s){
        if (s.getId() == 0){
            entityManager.persist(s);
        } else {
            entityManager.merge(s);
        }
        return true;
    }

    public Substation getById(long id){
//        return entityManager.find(Substation.class, id);
        return entityManager.createQuery("select s from Equipment e join e.substation s where s.id = :id", Substation.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    public boolean deleteById(long id){
//        Substation removed = this.getById(id);
//        if (removed != null) {
//            entityManager.remove(removed);
//            return true;
//        }
//        return false;
        int count = entityManager.createQuery("delete from Substation where id = :id")
                .setParameter("id", id)
                .executeUpdate();
        return count == 1;
    }

    public List<Substation> getAll(){
        return entityManager.createQuery("select s from Substation s", Substation.class)
                .getResultList();
//        return entityManager.createQuery("select s from Equipment e join e.substation s", Substation.class)
//                .getResultList();
    }

    public List<Substation> getAllForVoltageClass(int vclass){
        return entityManager.createQuery("select s from Substation s where s.voltageClass = :vc", Substation.class)
                .setParameter("vc", vclass)
                .getResultList();
    }


}
