package com.alumni.spring.controllers;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.service.EvenementService;
import com.alumni.spring.validator.AjoutEvenementValidator;
import com.alumni.spring.validator.ModifEvenementValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
@RequestMapping("/evenement")
public class ModifierEvenementController {

    @Autowired
    private ModifEvenementValidator evenementValidator;

    @Autowired
    private EvenementService evenementService;

    @GetMapping("modification/{evenement}")
    public String modifierEvenement(@PathVariable("evenement")Evenement evenement, Model model){
        model.addAttribute("evenement", evenement);
        return "modifier-evenement";
    }

    @PostMapping("modification/{evenement}")
    public String modifierEvenementPost(@Valid @ModelAttribute("evenement")Evenement evenement, BindingResult result){
        evenementValidator.validate(evenement, result);
        if(result.hasErrors()){
            return "modifier-evenement";
        }
        // -client
        evenementService.update(evenement);
        return "redirect:/evenement/consultation";
    }
}
