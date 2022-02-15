package com.alumni.spring.controllers;


import com.alumni.spring.service.UtilisateurService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*@RestController*/
@Controller
public class AccueilController {

    UtilisateurService utilisateurService;

    @RequestMapping("/")
    public String accueil(Model model) {
        // Utilisateur user = utilisateurService.getUtilisateurParId(1);
        //System.out.print("Nom user-->" +user.getNom());
        // String textMess ="Hello :" + " " +  user.getNom();
        model.addAttribute("message", "SALAMATOOOS");
    return "accueil";
    }
}
