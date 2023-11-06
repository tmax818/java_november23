package co.tylermaxwell.beltprep.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.beltprep.models.Bundle;

public interface BundleRepository extends CrudRepository<Bundle, Long> {
    List<Bundle> findAll();
    
}
