package com.skalli;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by héhéhéhéhéhéhéhé on 22/12/2015.
 */

@RestController
class errorController implements ErrorController{

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Sorry, an error occured";
    }

    @Override
    public String getErrorPath()
    {
        return PATH;
    }
}
