package com.alumni.spring.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "utilisateur")
public class    Utilisateur implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique=true)
    @NotNull

    @Size(min = 2)
    private String login;

    @NotNull
    @Size(min = 2)
    private String nom;

    @NotNull
    @Size(min = 2)
    private String prenom;

    @NotNull
    @Size(min = 2)
    private String password;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotNull
    @Past
    private Date anneePromotion;

    @ManyToMany
    private Set<Role> roles;

    public Utilisateur() {}

    public Utilisateur( String login, String password, String nom, String prenom, Date anneePromotion){
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.anneePromotion = anneePromotion;
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
    public Long getId() {
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
    public Set<Role> getRoles() {
        return roles;
    }

    //Setter
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
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
