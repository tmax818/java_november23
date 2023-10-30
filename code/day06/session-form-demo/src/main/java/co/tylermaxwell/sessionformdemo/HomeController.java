package co.tylermaxwell.sessionformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    private final HomeService homeService;

    
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/")
    public String index(HttpSession session, Survey survey){
        homeService.setCount(session);



        System.out.println(survey);
        return "index.jsp";
    }
    
    @PostMapping("/process")
    public String process(HttpSession session, Survey survey){
        // System.out.println(name);
        System.out.println(survey);
        session.setAttribute("survey", survey);
        return "redirect:/result";
    }
    
    @GetMapping("/result")
    public String result(){
        return "show.jsp";
    }
    
        @GetMapping("/increase")
        public String increase(HttpSession session){

            homeService.incrementCounter(session);

            
            return "redirect:/";
        }
    
        @GetMapping("/reset")
        public String reset(HttpSession session){
            session.setAttribute("count", 0);
    
            return "redirect:/";
        }

    
}
