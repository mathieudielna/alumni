package com.alumni.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AccueilController {

    @RequestMapping("/")
    public String accueil(Model model) {
        model.addAttribute("message", "Home App");
        return "accueil";
    }
}
