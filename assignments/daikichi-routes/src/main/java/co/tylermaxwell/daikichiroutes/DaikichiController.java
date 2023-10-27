package co.tylermaxwell.daikichiroutes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DaikichiController {

    
    @GetMapping("/whatever")
    public String index(){
        return "Hello Route";
    }

    @GetMapping("/bats")
    public Bat bats(){
        Bat bat = new Bat("Benny", 34);
        return bat;
    }

    @GetMapping("/vars/{test}")
    public String vars(@PathVariable String test){
        return String.format("%s", test);

    }

}
