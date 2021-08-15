package ru.lexdrummer.liquidrate.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lexdrummer.liquidrate.services.LiquidService;

@Controller
public class IndexController {

    private final LiquidService liquidService;

    public IndexController(LiquidService liquidService) {
        this.liquidService = liquidService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index(Model model){
        model.addAttribute("liquids", liquidService.findAllByManufacturersName("Maxwells"));
        return "index";
    }

}
