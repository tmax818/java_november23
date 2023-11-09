package co.tylermaxwell.johnadmin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.tylermaxwell.johnadmin.models.LoginUser;
import co.tylermaxwell.johnadmin.models.User;
import co.tylermaxwell.johnadmin.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String adminLogin(Model model) {
    
        // Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newLogin", new LoginUser());
        return "admin/index.jsp";
    }

        @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        
        // Add once service is implemented:
        User user = userService.adminlogin(newLogin, result, session);
    
        if(result.hasErrors()|| user == null) {
            model.addAttribute("newUser", new User());
            return "admin/index.jsp";
        }
        session.setAttribute("userId", user.getId());
        session.setAttribute("admin", user.getAdmin());

    
        return "redirect:/admin/home";
    }

    
}
