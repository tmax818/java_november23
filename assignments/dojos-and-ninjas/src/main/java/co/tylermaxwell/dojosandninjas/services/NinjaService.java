package co.tylermaxwell.dojosandninjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.dojosandninjas.models.Ninja;
import co.tylermaxwell.dojosandninjas.repostories.NinjaRepository;

@Service
public class NinjaService {

    @Autowired
    NinjaRepository ninjaRepository;

    public Ninja addNewNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }
    
}
