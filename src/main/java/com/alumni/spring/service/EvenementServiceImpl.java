package com.alumni.spring.service;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.repository.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvenementServiceImpl implements EvenementService{

    @Autowired
    private EvenementRepository evenementRepository;

    @Override
    public void ajouterEvenement(Evenement evenement) {
        evenementRepository.save(evenement);
    }
}
