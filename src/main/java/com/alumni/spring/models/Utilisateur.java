package com.alumni.spring.models;

import com.sun.istack.NotNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "utilisateur")
public class Utilisateur implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(unique=true)
    private String login;

    @NotNull
    private String password;

    @NotNull
    private String nom;

    @NotNull
    private String prenom;

    @NotNull
    private Date anneePromotion;

    @NotNull
    private String role;

    public Utilisateur() {}

    public Utilisateur( String login, String password, String nom, String prenom, Date anneePromotion,
                       String role){
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.anneePromotion = anneePromotion;
        this.role = role;
    }

    // UserDetails
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {

        return this.password;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    //getter
    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getAnneePromotion() {
        return anneePromotion;
    }

    public String getRole() {
        return role;
    }

    //Setter
    public void setRole(String role) {
        this.role = role;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnneePromotion(Date anneePromotion) {
        this.anneePromotion = anneePromotion;
    }
}
