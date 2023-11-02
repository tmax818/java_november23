package co.tylermaxwell.burgertracker.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.burgertracker.models.Burger;

public interface BurgerRepository extends CrudRepository<Burger, Long> {
    List<Burger> findAll();
}
