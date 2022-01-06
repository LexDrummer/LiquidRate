package ru.lexdrummer.liquidrate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping({"/", "/index", "/main"})
    public String index(){
        return "mainPage";
    }
}
