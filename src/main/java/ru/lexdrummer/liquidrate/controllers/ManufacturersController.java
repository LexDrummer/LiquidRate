package ru.lexdrummer.liquidrate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.lexdrummer.liquidrate.services.ManufacturerService;

@Controller
public class ManufacturersController {
    private ManufacturerService manufacturerService;

    public ManufacturersController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping({"/manufacturers", "/manufacturers.html"})
    public String manufacturers(Model model){
        model.addAttribute("manufacturers", manufacturerService.findAll());

        return "manufacturersPage";
    }
}
