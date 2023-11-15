package co.tylermaxwell.adeebmn.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.tylermaxwell.adeebmn.models.Item;
import co.tylermaxwell.adeebmn.models.Order;
import co.tylermaxwell.adeebmn.models.User;
import co.tylermaxwell.adeebmn.repostories.ItemRepository;
import co.tylermaxwell.adeebmn.repostories.OrderRepository;
import co.tylermaxwell.adeebmn.repostories.UserRepository;

@RestController
public class MainController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    
    @PostMapping("/users/new")
    public void addUser(@RequestBody User user){
        System.out.println(user);
        userRepository.save(user);
    }

    @GetMapping("/users/{id}")
    public User getUserWithItems(@PathVariable Long id){
        Optional<User> user = userRepository.findById(id);
        System.out.println(user);
        return user.get();
    }
    
    @GetMapping("/items")
    public List<Item> getItems(){
        return itemRepository.findAll();
    }
    

    
    @PostMapping("/items/new")
    public void addItem(@RequestBody Item item){
        System.out.println(item);
        itemRepository.save(item);
    }

    @GetMapping("/orders/users/{id}")
    public List<Item> getItemsByUser(@PathVariable Long id){
        Optional<User> user = userRepository.findById(id);
        List<Item> items = itemRepository.findByUsersContains(user.get());
        return items;
    }

    @GetMapping("/orders/items/{id}")
    public List<User> getUserByItem(@PathVariable Long id){
        Optional<Item> item = itemRepository.findById(id);
        List<User> users = userRepository.findByItemsContains(item.get());
        return users;
    }

    @GetMapping("/orders")
    @ResponseBody
    public List<Order> getOrders(){
        List<Order> orders = (List<Order>) orderRepository.findAll();
        System.out.println(orders);
        return orders;
    }

    @GetMapping("/orders/{id}")
    @ResponseBody
    public Order getOneOrder(@PathVariable Long id){
        Optional<Order> order = orderRepository.findById(id);
        System.out.println(order.get());
   
        return order.get();
    }

    @PostMapping("/orders/new")
    public void getOrders(@RequestBody Order order){
        System.out.println(order.getUser());
        userRepository.save(order.getUser());
        itemRepository.save(order.getItem());
        orderRepository.save(order);
    
    }


}
