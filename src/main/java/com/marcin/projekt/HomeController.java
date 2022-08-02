package com.marcin.projekt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap map){
        map.put("hello", "Mam na imie Marcin");
        return "home"; //resources.template.home.html
    }

}
