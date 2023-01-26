package se.lexicon.spring_boot_workshop.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.spring_boot_workshop.dao.AppUserDAO;
import se.lexicon.spring_boot_workshop.entity.AppUser;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
@Repository
public class AppUserDAOImpl implements AppUserDAO {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional(readOnly = true)
    public AppUser findById(int appUserId) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<AppUser> findAll() {
        return null;
    }

    @Override
    @Transactional
    public AppUser creat(AppUser appUser) {
        return null;
    }

    @Override
    @Transactional
    public AppUser update(AppUser appUser) {
        return null;
    }

    @Override
    @Transactional
    public void delete(int appUserId) {

    }
}
