package com.workforces.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    public Department(String nom) {
        this.nom = nom;
    }

    public Department() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public String toString() {
        return "Department{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
