package smachnogo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(String name, Model model) {
        return "index";
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome(String name, Model model) {
        return new ModelAndView("welcome", "message", "Hello");
    }
    
}
