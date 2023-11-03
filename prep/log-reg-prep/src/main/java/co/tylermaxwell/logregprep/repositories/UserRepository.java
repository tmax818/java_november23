package co.tylermaxwell.logregprep.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.logregprep.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
