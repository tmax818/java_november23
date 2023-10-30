package co.tylermaxwell.hopperreceipt;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.tylermaxwell.hopperreceipt.models.Item;

@Controller
public class HomeController {

    ArrayList<Item> items = new ArrayList<>();
    
    
    {

        items.addAll(Arrays.asList(
            new Item("Grace Hopper", "Copper Wire", 5.25, "11.8 inch copper wire", "Home Depot"),
            new Item("Grace Hopper", "microsecond Copper Wire", 500.25, "984 feet copper wire", "Lowe's") 
            ));
        }
        

    
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("items", items);
        return "index.jsp";
    }

    @GetMapping("/items/new")
    public String create(){
        return "new.jsp";
    }

    @PostMapping("/items")
    public String createItem(Item item){
        System.out.println(item);
        return "redirect:/";
    }
}
