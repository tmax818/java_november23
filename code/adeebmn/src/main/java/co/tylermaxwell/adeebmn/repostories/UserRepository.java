package co.tylermaxwell.adeebmn.repostories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.adeebmn.models.Item;
import co.tylermaxwell.adeebmn.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();

    List<User> findByItemsContains(Item item);

    
}
