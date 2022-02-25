package com.alumni.spring.controllers;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/evenement")
public class ConsulterEvenement {

    @Autowired
    private EvenementService evenementService;

    @RequestMapping("/consultation")
    public String affichageEvenementsAdmin(Model model){
        List<Evenement> evenements = evenementService.trouverToutEvenement();
        model.addAttribute("evenements", evenements);
        return "consulter-evenement-admin";
    }

    @RequestMapping("/open-event")
    public String affichageEvenements(Model model){
        List<Evenement> evenements = evenementService.trouverToutEvenement();
        model.addAttribute("evenements", evenements);
        return "consulter-evenement";
    }
}
