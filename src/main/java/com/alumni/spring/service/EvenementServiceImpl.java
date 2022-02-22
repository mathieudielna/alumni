package com.alumni.spring.service;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class EvenementServiceImpl implements EvenementService{

    @Autowired
    private EvenementRepository evenementRepository;

    @Autowired
    private EntityManager em;

    @Override
    public void ajouterEvenement(Evenement evenement) {
        evenementRepository.save(evenement);
    }

    public Evenement trouverEvenementParNom(String nomEvenement){
        return evenementRepository.findByNomEvent(nomEvenement);
    }

    @Override
    public List<Evenement> trouverToutEvenement() {
        return evenementRepository.findAll();
    }

    public void update(Evenement evenement){
        Evenement evenementAjour = evenementRepository.getOne(evenement.getIdEvent());
        evenementAjour.setDateEvent(evenement.getDateEvent());
        evenementAjour.setHeureEvent(evenement.getHeureEvent());
        evenementAjour.setLieuEvent(evenement.getLieuEvent());
        evenementAjour.setNomEvent(evenement.getNomEvent());
        evenementAjour.setNbPersonneMax(evenement.getNbPersonneMax());
        evenementRepository.save(evenementAjour);
    }
}
