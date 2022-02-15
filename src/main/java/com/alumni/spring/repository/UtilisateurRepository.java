package com.alumni.spring.repository;

import com.alumni.spring.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Utilisateur findUtilisateursById(Integer id);
    Utilisateur findUtilisateursByLogin(String login);

    Utilisateur getByLogin(String login);
}
