package com.alumni.spring.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String login;
    private String password;
    private String nom;
    private String prenom;
    private Date anneePromotion;
    private String role;

    public Utilisateur(){
    }

    public Utilisateur(int id, String login, String password, String nom, String prenom, Date anneePromotion,
                       String role){
        this.id = id;
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.anneePromotion = anneePromotion;
        this.role = role;
    }

    //getter
    public static long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
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
