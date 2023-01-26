package se.lexicon.spring_boot_workshop.dao;

import antlr.collections.List;
import se.lexicon.spring_boot_workshop.entity.AppUser;

import java.util.Collection;

public interface AppUserDAO {
AppUser findById(int appUserId);

Collection<AppUser> findAll();
AppUser creat (AppUser appUser);
AppUser update (AppUser appUser);
void delete (int appUserId);

}
