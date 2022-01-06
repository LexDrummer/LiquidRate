package ru.lexdrummer.liquidrate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.lexdrummer.liquidrate.services.CommentSectionService;
import ru.lexdrummer.liquidrate.services.LiquidService;

@Controller
public class LiquidController {

    private final LiquidService liquidService;
    private final CommentSectionService commentSectionService;


    public LiquidController(LiquidService liquidService, CommentSectionService commentSectionService) {
        this.liquidService = liquidService;
        this.commentSectionService = commentSectionService;
    }

    @GetMapping("/liquids/{id}")
    public String liquidPage(Model model, @PathVariable("id") Long id){
        model.addAttribute("liquid", liquidService.findById(id));
        model.addAttribute("comments", commentSectionService.findAllByLiquidId(id));
        model.addAttribute("rate", commentSectionService.findRateByLiquidId(id));

        return "liquidPage";
    }
}
