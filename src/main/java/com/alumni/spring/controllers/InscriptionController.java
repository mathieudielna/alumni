package com.alumni.spring.controllers;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.service.SecurityService;
import com.alumni.spring.service.UtilisateurService;
import com.alumni.spring.validator.UtilisateurValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@Controller
public class InscriptionController {
    @Autowired
    private UtilisateurService utilisateurService;
    @Autowired
    private SecurityService securityService;
    /* @Autowired
    private UtilisateurValidator utilisateurValidator;
     */


    @GetMapping("/inscription")
    public String inscription(Model model){
        model.addAttribute("utilisateurForm", new Utilisateur());
        return "inscription";
    }

   @PostMapping("/ajoutuser")
    public String submit(final @Valid @ModelAttribute("utilisateurForm") Utilisateur utilisateur,final BindingResult result,final Model model)
   {
       //utilisateurValidator.validate(utilisateur, result);
        if (result.hasErrors()) {
            System.out.println("erreur avant inscription ->" + result.getAllErrors());
            model.addAttribute("utilisateurForm", utilisateur);
            return "inscription";
        }
        utilisateurService.ajouterUtilisateur(utilisateur);
        securityService.autoLogin(utilisateur.getLogin(),utilisateur.getPassword());
        return "info";
    /*
        catch (IOException e) {
            result.rejectValue("login", "Login deja utilisé!");
            e.getMessage();
            System.out.println(e.getMessage() +" " + "erreur inscription");
            return "inscription";
        }
        ------
        model.addAttribute("nom", utilisateur.getNom());
        model.addAttribute("prenom", utilisateur.getPrenom());
        model.addAttribute("anneePromotion", utilisateur.getAnneePromotion());
        model.addAttribute("login", utilisateur.getLogin());
       model.addAttribute("role", utilisateur.getRole());
        model.addAttribute("password", utilisateur.getPassword());
        return "info";*/

   }
}




