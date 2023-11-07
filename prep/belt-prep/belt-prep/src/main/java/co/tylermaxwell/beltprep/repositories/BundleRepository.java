package co.tylermaxwell.beltprep.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.beltprep.models.Bundle;
import co.tylermaxwell.beltprep.models.User;


public interface BundleRepository extends CrudRepository<Bundle, Long> {
    List<Bundle> findAll();
    // List<Bundle> findByUser(User user);
    Bundle findByVotesContains(User user);
    Optional<Bundle> findByName(String name);
    
}
