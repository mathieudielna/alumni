package com.alumni.spring.controllers;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.service.UtilisateurService;
import com.alumni.spring.validator.UtilisateurValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@Controller
public class AjoutUtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @Autowired
    private UtilisateurValidator utilisateurValidator;

    @GetMapping("/inscription")
    public String inscription(Model model){
        model.addAttribute("utilisateurForm", new Utilisateur());
        return "inscription";
    }

   @PostMapping("/inscription")
    public String submitInscription(@Valid @ModelAttribute("utilisateurForm") Utilisateur utilisateur,
                         BindingResult result)
   {
       utilisateurValidator.validate(utilisateur, result);
       if (result.hasErrors()) {
           //System.err.println("erreur avant inscription ->" + result.getAllErrors() + utilisateur.getAnneePromotion());
           return "inscription";
       }
       utilisateurService.ajouterUtilisateur(utilisateur);
       //securityService.autoLogin(utilisateur.getUsername(),utilisateur.getPassword());
       return "redirect:/connexion";
   }

    @GetMapping("/valid")
    public String valid(){
        return "validinscription";
    }
}




