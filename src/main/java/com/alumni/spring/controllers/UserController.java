package com.alumni.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String home() {
        return("<h1>This is my home page!</h1>");
    }

    @GetMapping("/user")
    public String normalUser() {
        return ("<h1>This is my normal user page!</h1>");
    }

    @GetMapping("/admin")
    public String adminUser() {
        return  ("<h1>This is my normal admin page!</h1>");
    }
}
