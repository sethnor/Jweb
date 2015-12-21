package com.skalli;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sami on 21/12/2015.
 */

@RestController
public class GreetingController implements ErrorController
{
    private static final String PATH = "/error";

    @RequestMapping(value = "/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model)
    {
//        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(value = PATH)
    public String error()
    {
        return "error";
    }

    @Override
    public String getErrorPath()
    {
        return PATH;
    }
}