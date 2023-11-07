package co.tylermaxwell.beltprep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.tylermaxwell.beltprep.models.Bundle;
import co.tylermaxwell.beltprep.services.BundleService;
import jakarta.validation.Valid;

@Controller
public class BundleController {

    @Autowired
    BundleService bundleService;


    //!CREATE

    @GetMapping("/bundles/new")
    public String newBundle(@ModelAttribute Bundle bundle ){
        return "bundles/new.jsp";
    }

    @PostMapping("/bundles")
    public String createBundle(@Valid @ModelAttribute Bundle bundle, BindingResult result){
        if(result.hasErrors()){
            return "bundles/new.jsp";
        } else {
            bundleService.addBundle(bundle);
            return "redirect:/bundles";
        }

    }
    

    //! READ ALL

    @GetMapping("/bundles")
    public String bundles(Model model){
        List<Bundle> bundles = bundleService.getAllNames();
        model.addAttribute("bundles", bundles);
        return "bundles/index.jsp";
    }
    
}
