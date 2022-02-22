package com.alumni.spring.service;

import com.alumni.spring.models.Role;
import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UtilisateurDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findUtilisateursByLogin(login);
        List<GrantedAuthority> rolesUtilisateur = getUtilisateurPermission(utilisateur.getRoles());
        if(utilisateur == null ) throw new UsernameNotFoundException(login);

        return contruitPourAuthentification(utilisateur, rolesUtilisateur);
    }

    private List<GrantedAuthority> getUtilisateurPermission(Set<Role> utilisateurRoles){
        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
        for(Role role : utilisateurRoles){
            roles.add(new SimpleGrantedAuthority(role.getName()));
        }
        List<GrantedAuthority>  grantedAuthorities = new ArrayList<>(roles);
        return grantedAuthorities;
    }

    private UserDetails contruitPourAuthentification(Utilisateur utilisateur,List<GrantedAuthority> rolesUtilisateur){
        return new org.springframework.security.core.userdetails.User(utilisateur.getUsername(),
                utilisateur.getPassword(), rolesUtilisateur);
    }

}
