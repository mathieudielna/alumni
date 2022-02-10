package com.alumni.spring.controllers;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Date;

@Controller
public class InscriptionController {

    /*
    * https://www-baeldung-com.translate.goog/spring-mvc-form-tutorial?_x_tr_sl=auto&_x_tr_tl=fr&_x_tr_hl=fr
    * @Autowired
    */
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
/*    @RequestMapping(value ="/ajouterUtilisateur", method = RequestMethod.POST)
    public String inscriptionUtilisateur(final @Valid @ModelAttribute("utilisateur") Utilisateur infoUser, final BindingResult bindingResult, final Model model)
    {
        if(bindingResult.hasErrors()){
            model.addAttribute("registrationForm", infoUser);
            return "inscription";
        }
        try {
            utilisateurService.inscription(infoUser);
        }catch (Exception e){
            bindingResult.rejectValue("email", "userData.email","An account already exists for this email.");
            model.addAttribute("registrationForm", infoUser);
            return "inscription";
        }
        return "validInscription";
    }*/



