package se.lexicon.spring_boot_workshop.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.spring_boot_workshop.dao.DetailsDAO;
import se.lexicon.spring_boot_workshop.entity.AppUser;
import se.lexicon.spring_boot_workshop.entity.Details;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
@Repository
public class DetailsDAOImpl implements DetailsDAO {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional(readOnly = true)
    public Details findById(int detailsId) {
        return entityManager.find(Details.class, detailsId);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Details> findAll() {
        return entityManager.createQuery("select d from Details d").getResultList();
    }

    @Override
    @Transactional
    public Details creat(Details details) {
        entityManager.persist(details);
        return details;
    }

    @Override
    @Transactional
    public Details update(Details details) {
        entityManager.merge(details);
        return details;
    }

    @Override
    @Transactional
    public void delete(int detailsId) {
        Details result = entityManager.find(Details.class , detailsId);
        entityManager.remove(result);

    }
}
