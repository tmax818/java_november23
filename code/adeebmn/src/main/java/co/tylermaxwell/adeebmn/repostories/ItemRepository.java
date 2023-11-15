package co.tylermaxwell.adeebmn.repostories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.adeebmn.models.Item;
import co.tylermaxwell.adeebmn.models.User;



public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findAll();
    List<Item> findByUsersContains(User user);
    
}
