package com.alumni.spring.controllers;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.service.UtilisateurService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@Controller
public class InscriptionController {

    UtilisateurService utilisateurService;

    @GetMapping("/inscription")
    public String inscription(final Model model){
        model.addAttribute("utilisateurForm", new Utilisateur());
        return "inscription";
    }

   @PostMapping("/ajoutuser")
    public String submit(final @Valid @ModelAttribute("utilisateurForm") Utilisateur utilisateur,final BindingResult result,final Model model)
   {
        if (result.hasErrors()) {
            System.out.println(result.getAllErrors());
            model.addAttribute("utilisateurForm", utilisateur);
            return "inscription";
        }
        try {
           utilisateurService.inscription(utilisateur);
        } catch (Exception e) {
            result.rejectValue("login", "Login deja utilisé!");
            e.getMessage();
            System.out.println(e.getMessage() +" " + "erreur inscription");
            return "inscription";
        }
        return "info";
        /*
        * Charge et affiche toutes les informations
        model.addAttribute("nom", utilisateur.getNom());
        model.addAttribute("prenom", utilisateur.getPrenom());
        model.addAttribute("anneePromotion", utilisateur.getAnneePromotion());
        model.addAttribute("login", utilisateur.getLogin());
        model.addAttribute("role", utilisateur.getRole());
        model.addAttribute("password", utilisateur.getPassword());
        return "info";
        */
   }
}




