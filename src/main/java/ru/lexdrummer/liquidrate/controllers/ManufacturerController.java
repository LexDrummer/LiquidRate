package ru.lexdrummer.liquidrate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.lexdrummer.liquidrate.services.ManufacturerService;

@Controller
public class ManufacturerController {
    private final ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping({"/manufacturers/{id}"})
    public String manufacturer(Model model, @PathVariable("id") Long id){
        model.addAttribute("manufacturer", manufacturerService.findById(id));
        return "manufacturerPage";
    }
}
