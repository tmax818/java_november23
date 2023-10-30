package co.tylermaxwell.sessionformdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(HttpSession session, Survey survey){
        if(session.getAttribute("count") == null){
            session.setAttribute("count", 0);
        } else {
            int count = (int)session.getAttribute("count");
            session.setAttribute("count", count + 1);
        }
        return "index.jsp";
    }

    @GetMapping("/increase")
    public String increase(HttpSession session){
        int count = (int)session.getAttribute("count");
        session.setAttribute("count", count++);
        
        return "redirect:/";
    }

    @GetMapping("/reset")
    public String reset(HttpSession session){
        session.setAttribute("count", 0);

        return "redirect:/";
    }

    @PostMapping("/process")
    public String process(HttpSession session, Survey survey){
        System.out.println(survey);
        session.setAttribute("survey", survey);
        return "redirect:/result";
    }

    @GetMapping("/result")
    public String result(){
        return "show.jsp";
    }

    
}
