package com.alumni.spring.controllers;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class InscriptionController {

    /*@Autowired*/
    UtilisateurService utilisateurService;

    @GetMapping("/inscription")
    public String inscription(Model model){

        model.addAttribute("utilisateur", new Utilisateur());

        return "inscription";
        /*return new ModelAndView("inscription", "utilisateur", new Utilisateur());*/
    }

   @PostMapping("/ajoutuser")
    public String submit(@Valid @ModelAttribute("utilisateur") Utilisateur utilisateur,BindingResult bindingResult, ModelMap model)
   {
        /*
        if (bindingResult.hasErrors()) {
            System.out.println(utilisateur.getNom());
            return "erreur";
        }
        */
            model.addAttribute("nom", utilisateur.getNom());
            model.addAttribute("prenom", utilisateur.getPrenom());
            model.addAttribute("anneePromotion", utilisateur.getAnneePromotion());
            model.addAttribute("login", utilisateur.getLogin());
            model.addAttribute("role", utilisateur.getRole());
            model.addAttribute("password", utilisateur.getPassword());

            return "info";
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



