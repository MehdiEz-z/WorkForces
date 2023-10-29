package com.workforces.domaine;

public class Employe {
    private long id;
    private String nom;
    private Double salaire;
    public Employe(String nom, Double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }
    public Employe() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
