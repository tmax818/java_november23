package co.tylermaxwell.beltprep.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.beltprep.models.User;
import java.util.List;
import co.tylermaxwell.beltprep.models.Bundle;


public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);

}
