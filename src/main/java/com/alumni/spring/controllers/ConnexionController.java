package com.alumni.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.plaf.PanelUI;

@Controller
public class ConnexionController {

    @RequestMapping("/connexion")
    public String connexion() {
        return "connexion";
    }

    @RequestMapping("/admin")
    public String adm(){
        return "validinscription";
    }


}
