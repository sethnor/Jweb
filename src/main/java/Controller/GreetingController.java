package Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;

/**
 * Created by Sami on 21/12/2015.
 */

@Controller
public class GreetingController
{
    @RequestMapping("/greeting")
    public String gallery(@RequestParam(value="name", defaultValue="World") String name, Model model)
    {
        model.addAttribute("name", name);
        return "greeting";
    }
}