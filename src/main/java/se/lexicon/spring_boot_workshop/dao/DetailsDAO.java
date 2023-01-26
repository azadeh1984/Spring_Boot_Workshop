package se.lexicon.spring_boot_workshop.dao;

import se.lexicon.spring_boot_workshop.entity.AppUser;
import se.lexicon.spring_boot_workshop.entity.Details;

import java.util.Collection;

public interface DetailsDAO {
   Details findById (int detailsId);

    Collection<Details> findAll();

    Details creat (Details details);

    Details update (Details details);

    void delete (int detailsId);
}
