package com.alumni.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConnexionController {

    @RequestMapping("/connexion")
    public String connexion() {
        return "connexion";
    }

}
