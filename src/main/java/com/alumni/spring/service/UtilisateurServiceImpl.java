package com.alumni.spring.service;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.repository.RoleRepository;
import com.alumni.spring.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateur.setPassword(bCryptPasswordEncoder.encode(utilisateur.getPassword()));
        utilisateur.setRoles(new HashSet<>(roleRepository.findAll()));
        utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur trouverParLogin(String login) {
        return utilisateurRepository.findUtilisateursByLogin(login);
    }

/*    UtilisateurRepository utilisateurRepository;
    PasswordEncoder passwordEncoder;

    public void inscription(Utilisateur utilisateur) {
        *//*if(verifUtilisateurExist(utilisateur.getLogin())){
            System.out.println(verifUtilisateurExist(utilisateur.getLogin()));
            throw new IOException("Un utilisateur exist deja avec ce login!");
        }*//*
        *//*Utilisateur userEntity = new Utilisateur();
        BeanUtils.copyProperties(utilisateur, userEntity);
        encoderMdp(userEntity, utilisateur);
        System.out.println("utilisateur" + utilisateur.getNom());*//*
        utilisateurRepository.save(utilisateur);
    }

    *//*
     * Retrouve un utilisateur par id
     * *//*
    public Utilisateur getUtilisateurParId(int id) {
        Utilisateur utilisateurParId = utilisateurRepository.findUtilisateursById(id);
        System.out.println(utilisateurParId.getNom());
        return utilisateurParId;
    }

    *//*
     * Check si l'utilisateur exist
     * @Override
     * *//*
    public boolean verifUtilisateurExist(String login) {
        return utilisateurRepository.findUtilisateursByLogin(login) !=null ? true : false;
    }

    *//*
     * Encoder les mots de passes
     * *//*
    private void encoderMdp( Utilisateur utilisateur, Utilisateur user){
        utilisateur.setPassword(passwordEncoder.encode(user.getPassword()));
    }

    *//*FONCTION USER DETAILS SERVCE PAR DEFAULT*//*
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Utilisateur utilisateurTrouve = utilisateurRepository.getByLogin(login);
        return utilisateurTrouve;
    }*/
}
