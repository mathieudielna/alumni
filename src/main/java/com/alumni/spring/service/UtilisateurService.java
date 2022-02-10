package com.alumni.spring.service;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.repository.UtilisateurRepository;
import jdk.jshell.execution.Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UtilisateurService implements UserDetailsService {

    UtilisateurRepository utilisateurRepository;
    PasswordEncoder passwordEncoder;

    public void inscription(Utilisateur utilisateur) throws Exception {
        if(verifUtilisateurExist(utilisateur.getLogin())){
            System.out.println(verifUtilisateurExist(utilisateur.getLogin()));
            throw new Exception("Un utilisateur exist deja avec ce login!");
        }
        Utilisateur userEntity = new Utilisateur();
        BeanUtils.copyProperties(utilisateur, userEntity);
        encoderMdp(userEntity, utilisateur);
        utilisateurRepository.save(userEntity);
    }

    /*
    * Check si l'utilisateur exist
    * @Override
    * */
    public boolean verifUtilisateurExist(String login) {
        return utilisateurRepository.findUtilisateursByLogin(login) !=null ? true : false;
    }

    /*
    * Encoder les mots de passes
    * */
    private void encoderMdp( Utilisateur utilisateur, Utilisateur user){
        utilisateur.setPassword(passwordEncoder.encode(user.getPassword()));
    }

    /*FONCTION USER DETAILS SERVCE PAR DEFAULT*/
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Utilisateur utilisateurTrouve = utilisateurRepository.getByLogin(login);
        return utilisateurTrouve;
    }

    /*
    * Retrouve un utilisateur via recherche d'id
    * */
    public Utilisateur getUserById(int id) {
        Utilisateur user = utilisateurRepository.findUtilisateursById(id);

        return user;
    }

}
