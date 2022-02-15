package com.alumni.spring.models;

import jdk.jshell.execution.Util;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<Utilisateur> utilisateurs;


    // getter
    public String getName() {
        return name;
    }

    public Set<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public Long getId() {
        return id;
    }

    // setter
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }
}
