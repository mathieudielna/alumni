package com.alumni.spring.service;

import com.alumni.spring.models.Utilisateur;

public interface UtilisateurService {
    void ajouterUtilisateur(Utilisateur utilisateur);

    Utilisateur trouverParLogin(String login);
}
