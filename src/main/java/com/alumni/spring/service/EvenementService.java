package com.alumni.spring.service;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.repository.EvenementRepository;
import com.alumni.spring.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Service
public class EvenementService {

    private final EvenementRepository eventRepo;
    private final UtilisateurRepository userRepo;

    public EvenementService(EvenementRepository eventRepo, UtilisateurRepository userRepo) {
        this.eventRepo = eventRepo;
        this.userRepo = userRepo;
    }

    public void doWork() {

        Date maDate = new Date();

        Utilisateur user = new Utilisateur(1, "tester", "test", "test", "test", maDate,"USER_ADMIN");
        userRepo.save(user);

        Time monTemp = new Time(14,00,00);

        eventRepo.deleteAll();

        Evenement e1 = new Evenement(1, maDate, "e1", monTemp , "France", 0,user );
        Evenement e2 = new Evenement(2, maDate, "e2", monTemp , "France", 0,user );
        eventRepo.save(e1);
        eventRepo.save(e2);

        List<Evenement> findByNomResult = eventRepo.findByNomEvent("e1");
        List<Evenement> findByDateResult = eventRepo.findByDateEvent(maDate);

        System.out.println("By nom" + findByNomResult);
        System.out.println("By date" + findByDateResult);
    }

}
