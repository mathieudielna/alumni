package com.alumni.spring.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    public String home() {
        return("<h1>This is my home page!</h1>");
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
