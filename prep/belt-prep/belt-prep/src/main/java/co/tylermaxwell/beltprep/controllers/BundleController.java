package co.tylermaxwell.beltprep.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.tylermaxwell.beltprep.models.Bundle;

@Controller
public class BundleController {

    @GetMapping("/bundles")
    public String bundles(@ModelAttribute Bundle bundle){
        return "bundles/index.jsp";
    }

    @PostMapping("/bundles")
    public String createBundle(@ModelAttribute Bundle bundle){
        System.out.println(bundle);
        return "redirect:/bundles";

    }
    
}
