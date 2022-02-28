package com.alumni.spring.service;

import com.alumni.spring.models.Role;
import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.repository.RoleRepository;
import com.alumni.spring.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Arrays;
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
        // ajouter tout les roles -> utilisateur.setRoles(new HashSet<>(roleRepository.findAll()));
        Role utilisateurRole =  roleRepository.findRoleByName("ROLE_USER");
        utilisateur.setRoles(new HashSet<Role>(Arrays.asList(utilisateurRole)));
        utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur trouverParLogin(String login) {
        return utilisateurRepository.findUtilisateursByLogin(login);
    }
}
