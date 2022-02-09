package com.alumni.spring.controllers;


import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*@RestController*/
@Controller
public class AccueilController {

    @Autowired
    UtilisateurService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @RequestMapping("/")
    public String accueil(Model model) {
        Utilisateur user = userService.getUserById(1);
        System.out.print(user.getNom());
        model.addAttribute("message", "Hello :" + " " +  user.getNom());
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

}
