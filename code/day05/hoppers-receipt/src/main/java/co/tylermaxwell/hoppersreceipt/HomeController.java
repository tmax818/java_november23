package co.tylermaxwell.hoppersreceipt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import co.tylermaxwell.hoppersreceipt.models.Item;

@Controller
public class HomeController {

    ArrayList<Item> items = new ArrayList<>();

    {
        items.addAll(Arrays.asList(
            new Item("Grace Hopper", "copper wire", 5.25, "nano second wire", "Home depot"),
            new Item("Grace Hopper", "copper wire", 500.25, "984 feet nano second wire", "Lowe's")

        ));
    }

    // the method that will file when I got to http://localhost:8080/
    @GetMapping(" ")
    public String index(Model model){
        model.addAttribute("items", items );
        return "index.jsp";
    }
    
}
