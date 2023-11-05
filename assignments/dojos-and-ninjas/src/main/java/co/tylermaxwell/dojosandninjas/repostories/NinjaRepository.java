package co.tylermaxwell.dojosandninjas.repostories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.dojosandninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
    List<Ninja> findAll();
    

    
}
