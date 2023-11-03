package co.tylermaxwell.burgertracker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.tylermaxwell.burgertracker.models.Burger;
import co.tylermaxwell.burgertracker.repositories.BurgerRepository;
import jakarta.validation.Valid;

@Service
public class BurgerService {

    @Autowired
    BurgerRepository burgerRepository;

    public List<Burger> getAllBurgers() {
        return burgerRepository.findAll();
    }

    public void addBurger(@Valid Burger burger) {
        burgerRepository.save(burger);
    }

    public Burger getOneBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        // if(optionalBurger.isPresent()){
        //     return optionalBurger.get();
        // } else {
        //    return null;
        // }
        return optionalBurger.orElse(null);
    }

    public void updateBurger(Burger burger) {
        burgerRepository.save(burger);
    }

    
}
