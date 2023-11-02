package com.workforces.entities;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Double salaire;
    @ManyToOne
    private Department department;
    public Employee(String nom, Double salaire, Department department) {
        this.nom = nom;
        this.salaire = salaire;
        this.department = department;
    }
    public Employee() {
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

    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nom='" + nom + '\'' +
                ", salaire=" + salaire +
                ", department=" + department +
                '}';
    }
}
