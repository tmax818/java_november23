package co.tylermaxwell.burgertracker.services;

import java.util.List;

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
    
}
