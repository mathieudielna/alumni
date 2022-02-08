package com.alumni.spring.controllers;


import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.repository.UtilisateurRepository;
import com.alumni.spring.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
public class UserController {

    @Autowired
    UtilisateurRepository userRep;

    @RequestMapping("/")
    public String home(Model model) {
        List<Utilisateur> user = userRep.findUtilisateursById(1);
        System.out.print(user.get(0).getNom());
        model.addAttribute("message", "Ok ok!");
    return "index";
    }

    @RequestMapping("/user")
    public String normalUser() {
        return ("<h1>This is my normal user page!</h1>");
    }

    @RequestMapping("/admin")
    public String adminUser() {
        return  ("<h1>This is my normal admin page!</h1>");
    }

    @RequestMapping("/anonymous")
    public String anonymous() {
        return  ("<h1>This is my anonymous page!</h1>");
    }

    @RequestMapping("/creationCompte")
    public String creationCompte() {
        return  ("");
    }
}
