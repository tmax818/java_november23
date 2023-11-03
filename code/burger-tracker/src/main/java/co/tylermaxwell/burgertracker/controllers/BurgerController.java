package co.tylermaxwell.burgertracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import co.tylermaxwell.burgertracker.models.Burger;
import co.tylermaxwell.burgertracker.services.BurgerService;
import jakarta.validation.Valid;

@Controller
@RestController
public class BurgerController {

    @Autowired
    BurgerService burgerService;
    

    @GetMapping("/")
    public String index(Model model, @ModelAttribute Burger burger){
        List<Burger> burgers = burgerService.getAllBurgers();
        model.addAttribute("burgers", burgers);
        return "index.jsp";
    }
    
    @PostMapping("/burgers")
    public String addBurger(@Valid @ModelAttribute Burger burger, BindingResult result, Model model){
        if(result.hasErrors()){
            List<Burger> burgers = burgerService.getAllBurgers();
            model.addAttribute("burgers", burgers);
            return "index.jsp";
        }
        System.out.println(burger);
        burgerService.addBurger(burger);

        return "redirect:/";
    }

    @GetMapping("/burgers/edit/{id}")
    public String edit(@PathVariable Long id, Model model ){
        Burger burger = burgerService.getOneBurger(id);
        model.addAttribute("burger", burger);
        return "edit.jsp";
    }

    @PutMapping("/burgers/{id}")
    public String update(@Valid @ModelAttribute Burger burger, BindingResult result, @PathVariable Long id ){
        if(result.hasErrors()){
            return "edit.jsp";
        }
        System.out.println(burger);
        burgerService.updateBurger(burger);
        return "redirect:/";

    }
}
