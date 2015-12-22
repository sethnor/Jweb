package com.skalli;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Sami on 21/12/2015.
 */

@Controller
public class GreetingController
{
    private static final String PATH = "/greeting";

    @RequestMapping(value = PATH, method = RequestMethod.GET)
    public ModelAndView greeting(@RequestParam(value="name", required=false, defaultValue="World") String name)
    {
        ModelAndView mv = new ModelAndView("greeting");
        return mv;
    }
}