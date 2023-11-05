package co.tylermaxwell.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import co.tylermaxwell.dojosandninjas.models.Dojo;
import co.tylermaxwell.dojosandninjas.models.Ninja;
import co.tylermaxwell.dojosandninjas.services.DojoService;
import co.tylermaxwell.dojosandninjas.services.NinjaService;


@Controller
public class HomeController {
    
    @Autowired
    DojoService dojoService;

    @Autowired
    NinjaService ninjaService;

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute Dojo dojo) {
        return "dojos/new";
    }

    @PostMapping("/dojos")
    public String createDojo(@ModelAttribute Dojo dojo){
        Dojo newDojo = dojoService.addNewDojo(dojo);
        return String.format("redirect:/dojos/%d", newDojo.getId());
    }

    
    @GetMapping("/dojos/{id}")
    public String showDojo(@PathVariable Long id, Model model){
        Dojo dojo = dojoService.getOneDojo(id);
        model.addAttribute("dojo", dojo);
        return "dojos/show";
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute Ninja ninja, Model model){
        List<Dojo> dojos = dojoService.getAllDojos();
        model.addAttribute("dojos", dojos);
        return "ninjas/new";
    }

    @PostMapping("/ninjas")
    public String createNinja(@ModelAttribute Ninja ninja){
        Ninja newNinja = ninjaService.addNewNinja(ninja);
         return String.format("redirect:/dojos/%d", newNinja.getDojo().getId());

    }
    
}
