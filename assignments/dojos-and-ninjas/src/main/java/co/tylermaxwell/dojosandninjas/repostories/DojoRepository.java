package co.tylermaxwell.dojosandninjas.repostories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.dojosandninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {
    List<Dojo> findAll();
    
}
