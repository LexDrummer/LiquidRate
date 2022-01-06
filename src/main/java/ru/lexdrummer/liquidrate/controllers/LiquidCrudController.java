package ru.lexdrummer.liquidrate.controllers;

import org.springframework.stereotype.Controller;
import ru.lexdrummer.liquidrate.services.LiquidService;

@Controller
public class LiquidCrudController {

    private final LiquidService liquidService;

    public LiquidCrudController(LiquidService liquidService) {
        this.liquidService = liquidService;
    }
}
