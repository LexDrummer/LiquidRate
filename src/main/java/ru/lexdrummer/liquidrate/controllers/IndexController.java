package ru.lexdrummer.liquidrate.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lexdrummer.liquidrate.model.CommentSection;
import ru.lexdrummer.liquidrate.services.CommentSectionService;
import ru.lexdrummer.liquidrate.services.LiquidService;

import java.util.HashSet;
import java.util.Set;

@Controller
public class IndexController {

    private final LiquidService liquidService;
    private final CommentSectionService commentSectionService;

    public IndexController(LiquidService liquidService, CommentSectionService commentSectionService) {
        this.liquidService = liquidService;
        this.commentSectionService = commentSectionService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String index(Model model){

        model.addAttribute(liquidService.findByName("shoria"));
        return "index";
    }

}
