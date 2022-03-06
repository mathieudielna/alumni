package com.alumni.spring.service;

import com.alumni.spring.models.Evenement;

import java.util.List;


public interface EvenementService {
    void ajouterEvenement(Evenement evenement);
    Evenement trouverEvenementParNom(String nomEvenement);
    List<Evenement> trouverToutEvenement();
    void update(Evenement evenement);
    void supprimerEvenement(Evenement evenement);
}
