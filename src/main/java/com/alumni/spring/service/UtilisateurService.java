package com.alumni.spring.service;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.repository.UtilisateurRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.io.IOException;

public interface UtilisateurService {
    void ajouterUtilisateur(Utilisateur utilisateur);

    Utilisateur trouverParLogin(String login);
}
