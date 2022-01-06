package ru.lexdrummer.liquidrate.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.lexdrummer.liquidrate.services.CommentSectionService;
import ru.lexdrummer.liquidrate.services.LiquidService;

@Controller
public class LiquidsController {

    private final LiquidService liquidService;
    private final CommentSectionService commentSectionService;

    public LiquidsController(LiquidService liquidService, CommentSectionService commentSectionService) {
        this.liquidService = liquidService;
        this.commentSectionService = commentSectionService;
    }

    @GetMapping({"/liquids", "/liquids.html"})
    public String liquids(Model model){
        model.addAttribute("liquids", liquidService.findAll());
        return "liquids";
    }

    @PostMapping("/deleteLiquid/{id}")
    public String deleteLiquid(@PathVariable Long id){
        commentSectionService.deleteAllByLiquidId(id);
        liquidService.deleteLiquid(id);
        return "redirect:/liquids";
    }

}
