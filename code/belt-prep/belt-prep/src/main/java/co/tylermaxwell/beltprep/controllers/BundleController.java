package co.tylermaxwell.beltprep.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BundleController {

    @GetMapping("/bundles")
    public String bundles(){
        return "bundles/index.jsp";
    }
    
}
