package co.tylermaxwell.demojsptake2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping(" ")
    public String index(){
        return "index.jsp";
    }
    
}
