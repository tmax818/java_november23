package co.tylermaxwell.omikujiform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import co.tylermaxwell.omikujiform.models.Omikuji;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String index(Omikuji omikuji){
        return "index.jsp";
    }

    @PostMapping("/handle")
    public String handle(Omikuji omikuji){
        System.out.println(omikuji);
        return "redirect:/";
    }


}
