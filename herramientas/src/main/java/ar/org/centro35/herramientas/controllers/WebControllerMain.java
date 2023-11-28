package ar.org.centro35.herramientas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebControllerMain {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

}
