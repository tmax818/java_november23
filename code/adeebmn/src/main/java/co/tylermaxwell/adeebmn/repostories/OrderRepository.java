package co.tylermaxwell.adeebmn.repostories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.adeebmn.models.Item;
import co.tylermaxwell.adeebmn.models.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findAll();

    
}
