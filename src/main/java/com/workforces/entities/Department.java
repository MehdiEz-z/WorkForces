package com.workforces.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department(String nom, List<Employee> employees) {
        this.nom = nom;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "nom='" + nom + '\'' +
                ", employees=" + employees +
                '}';
    }
}
