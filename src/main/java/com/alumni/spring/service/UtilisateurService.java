package com.alumni.spring.service;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.repository.UtilisateurRepository;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {

    @Autowired
    UtilisateurRepository userRep;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<Utilisateur> getUserById(int id) {
        List<Utilisateur> user = userRep.findUtilisateursById(id);

        return user;
    }

/*    @Override
    public void inscription(Utilisateur newUtilisateur) {

        if(utilisateurExist(newUtilisateur.getLogin())){
          System.out.println("Login exist deja!");
        }
        Utilisateur utilisateur = new Utilisateur();

    }*/

  /*  @Override
    public boolean utilisateurExist(String login) {
        return userRep.findUtilisateursByLogin(login)  !=null ? true : false;
    }
*/

}
