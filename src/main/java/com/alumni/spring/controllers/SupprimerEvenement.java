package com.alumni.spring.controllers;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/evenement")
public class SupprimerEvenement {

    @Autowired
    private EvenementService evenementService;

    @RequestMapping("supprimer/{evenement}")
    public String supprimerEvenementPost(@ModelAttribute("evenement")Evenement evenement){
        System.out.println(evenement.getIdEvent());
        evenementService.supprimerEvenement(evenement);
        return "redirect:/evenement/consultation";
        //return "consulter-evenement-admin";
    }
}
