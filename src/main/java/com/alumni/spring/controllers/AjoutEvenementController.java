package com.alumni.spring.controllers;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.service.EvenementService;
import com.alumni.spring.validator.EvenementValidator;
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
@RequestMapping("/evenement")
public class AjoutEvenementController {

    @Autowired
    private EvenementService evenementService;

    @Autowired
    private EvenementValidator evenementValidator;

    @GetMapping("/ajouter")
    public String ajoutEvenement(Model model){
        model.addAttribute("evenementForm", new Evenement());
        return "ajout-evenement";
    }

    @PostMapping("/ajouter")
    public String submitEvenement(@Valid @ModelAttribute("evenementForm") Evenement evenement,
                                  BindingResult result)
    {
        evenementValidator.validate(evenement,result);
        if(result.hasErrors()){
            System.err.println("Erreur ajout ->" + result.getAllErrors());
            return "ajout-evenement";
        }
        System.err.println(evenement.getHeureEvent());
        evenementService.ajouterEvenement(evenement);
        return "redirect:/evenement/open-event";


    }

}
