package com.alumni.spring.controllers;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
/*@RequestMapping("/evenement")*/
public class AjoutEvenementController {

    @Autowired
    EvenementService evenementService;

    @GetMapping("/ajouter")
    public String ajoutEvenement(Model model){
        model.addAttribute("evenementForm", new Evenement());
        return "ajoutEvenement";
    }

    @PostMapping("/ajouter")
    public String submitEvenement(@Valid @ModelAttribute("evenementForm") Evenement evenement,
                                  BindingResult result){
        //event validator
        if(result.hasErrors()){
            return "ajoutEvenement";
        }
        evenementService.ajouterEvenement(evenement);
        return "validinscription";


    }

}
