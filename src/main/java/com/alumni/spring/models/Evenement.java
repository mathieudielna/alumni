package com.alumni.spring.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name = "evenement")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvent;
    
    private Date dateEvent;

    private String nomEvent;

    private Time heureEvent;

    private String lieuEvent;

    private int nbPersonne;

    @ManyToOne
    @JoinColumn(name = "id")
    private Utilisateur idCreateur;

    public Evenement(){}

    public Evenement(Date date, String nom, Time heure, String lieu, int nbPersonne, Utilisateur createur){
        this.dateEvent = date;
        this.nomEvent = nom;
        this.heureEvent = heure;
        this.lieuEvent = lieu;
        this.nbPersonne = nbPersonne;
        this.idCreateur = createur;
    }

    // getter
    public Long getIdEvent() {
        return idEvent;
    }

    public Date getDateEvent() {
        return dateEvent;
    }

    public String getNomEvent() {
        return nomEvent;
    }

    public Time getHeureEvent() {
        return heureEvent;
    }

    public String getLieuEvent() {
        return lieuEvent;
    }

    public int getNbPersonne() {
        return nbPersonne;
    }

    public Utilisateur getIdCreateur() {
        return idCreateur;
    }

    // setter
    public void setDateEvent(Date dateEvent) {
        this.dateEvent = dateEvent;
    }

    public void setNomEvent(String nomEvent) {
        this.nomEvent = nomEvent;
    }

    public void setHeureEvent(Time heureEvent) {
        this.heureEvent = heureEvent;
    }

    public void setLieuEvent(String lieuEvent) {
        this.lieuEvent = lieuEvent;
    }

    public void setNbPersonne(int nbPersonne) {
        this.nbPersonne = nbPersonne;
    }

    public void setIdCreateur(Utilisateur idCreateur) {
        this.idCreateur = idCreateur;
    }
}
