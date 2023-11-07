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
import co.tylermaxwell.beltprep.models.User;
import co.tylermaxwell.beltprep.services.BundleService;
import co.tylermaxwell.beltprep.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BundleController {

    @Autowired
    BundleService bundleService;

    @Autowired
    UserService userService;

    @GetMapping("/bundles")
    public String bundles(@ModelAttribute Bundle bundle, Model model){
        List<Bundle> bundles = bundleService.getAllBundles();
    
        model.addAttribute("bundles", bundles);
        return "bundles/index.jsp";
    }

    @PostMapping("/bundles")
    public String createBundle(@ModelAttribute Bundle bundle){
        System.out.println(bundle);
        bundleService.addBundle(bundle);
        return "redirect:/bundles";
    }

    
    //! READ ONE
    
    @GetMapping("/bundles/{id}")
    public String show(@PathVariable Long id, Model model){
        Bundle bundle = bundleService.getOneBundle(id);
        System.out.println(bundle);
        model.addAttribute("bundle", bundle);
        return "bundles/show.jsp";
    }
    
    
    //! UPDATE
    
    @GetMapping("/bundles/edit/{id}")
    public String edit(@PathVariable Long id, Model model){
        Bundle bundle = bundleService.getOneBundle(id);
        model.addAttribute("bundle", bundle);
        return "bundles/edit.jsp";
    }
    
    @PutMapping("/bundles/{id}")
    public String update(@Valid @ModelAttribute Bundle bundle, BindingResult result, Model model, @PathVariable Long id){
        if(result.hasErrors()){
            Bundle ebundle = bundleService.getOneBundle(id);
            model.addAttribute("ebundle", ebundle);

            return "/bundles/edit.jsp";
        }
        bundleService.updateBundle(bundle);
        return "redirect:/bundles";
    }
    
    //! DELETE

    @DeleteMapping("/bundles/{id}")
    public String destroy(@PathVariable Long id){
        bundleService.destroyBundle(id);
        return "redirect:/bundles";
    }

    @GetMapping("/bundles/vote/{id}")
    public String vote(@PathVariable Long id, HttpSession session){
        User user = userService.getOneUserById((Long)session.getAttribute("userId"));
        Bundle bundle = bundleService.getOneBundle(id);
        bundleService.addUserVote(bundle, user);
        return "redirect:/bundles";
    }
    
}
