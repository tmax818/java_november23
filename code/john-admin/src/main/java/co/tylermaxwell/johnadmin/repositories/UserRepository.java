package co.tylermaxwell.johnadmin.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.johnadmin.models.User;
import java.util.List;



public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);

}
