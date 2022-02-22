package com.alumni.spring.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name = "evenement")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvent;

    @NotNull
    private Date dateEvent;

    @NotNull
    @Size(min = 2)
    @Column(unique = true)
    private String nomEvent;

    @NotNull
    private Time heureEvent;

    @NotNull
    private String lieuEvent;

    @NotNull
    private int nbPersonneMax;

    @ManyToOne
    @JoinColumn(name = "id")
    private Utilisateur idCreateur;

    public Evenement(){}

    public Evenement(Date date, String nom, Time heure, String lieu, int nbPersonneMax, Utilisateur createur){
        this.dateEvent = date;
        this.nomEvent = nom;
        this.heureEvent = heure;
        this.lieuEvent = lieu;
        this.nbPersonneMax = nbPersonneMax;
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

    public int getNbPersonneMax() {
        return nbPersonneMax;
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

    public void setNbPersonneMax(int nbPersonneMax) {
        this.nbPersonneMax = nbPersonneMax;
    }

    public void setIdCreateur(Utilisateur idCreateur) {
        this.idCreateur = idCreateur;
    }
}
