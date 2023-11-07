package co.tylermaxwell.beltprep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.beltprep.models.Bundle;
import co.tylermaxwell.beltprep.services.BundleService;
import jakarta.servlet.http.HttpSession;
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

    //! READ ONE

    @GetMapping("/bundles/{id}")
    public String showBundle(@PathVariable Long id, HttpSession session, Model model){
        if(session.getAttribute("userId") == null){
            return "redirect:/";
        }
        Bundle bundle = bundleService.getOneBundleById(id);
        model.addAttribute("bundle", bundle);
        return "bundles/show.jsp";
    }

    //! UPDATE

    @GetMapping("/bundles/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Bundle bundle = bundleService.getOneBundleById(id);
        model.addAttribute("bundle", bundle);
        return "bundles/edit.jsp";
    }

    @PutMapping("/bundles/{id}")
    public String update(@Valid @ModelAttribute Bundle bundle, BindingResult result){
        if(result.hasErrors()){
            return "bundles/edit.jsp";
        }
        System.out.println(bundle);
        bundleService.updateBundle(bundle);
        return "redirect:/bundles";

    }

    @DeleteMapping("/bundles/{id}")
    public String destroy(@PathVariable Long id){
        bundleService.destroyBundle(id);
        return "redirect:/bundles";
    }
    
}
