package com.alumni.spring.repository;

import com.alumni.spring.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Utilisateur findUtilisateursById(Integer id);
    Utilisateur findUtilisateursByLogin(String login);

    Utilisateur getByLogin(String login);
}
