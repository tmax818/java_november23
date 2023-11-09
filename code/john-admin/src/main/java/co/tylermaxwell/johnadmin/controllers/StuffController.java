package co.tylermaxwell.johnadmin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stuff")
public class StuffController {


    @GetMapping("")
    public String allStuff(){
        return "/stuff/index.jsp";
    }
    
}
