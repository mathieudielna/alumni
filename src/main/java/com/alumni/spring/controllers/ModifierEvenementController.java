package com.alumni.spring.controllers;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.validator.EvenementValidator;
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
    private EvenementValidator evenementValidator;

    @GetMapping("modification/{evenement}")
    public String modifierEvenement(@PathVariable("evenement")Evenement evenement, Model model){
        model.addAttribute("evenement", evenement);
        return "modifier-evenement-admin";
    }

    @PostMapping("modification/{evenement}")
    public String modifierEvenementPost(@Valid @ModelAttribute("evenement")Evenement evenement, BindingResult result){
        evenementValidator.validate(evenement, result);
        if(result.hasErrors()){
            return "modifier-evenement-admin";
        }
        // uptdate-client

        return "modifier-evenement";
    }
}
