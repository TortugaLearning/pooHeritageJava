package com.direction.entity;

public class Base {
    private String nom;
    private int annee;

    public Base(String nom, int annee){
        this.nom = nom;
        this.annee = annee;
    }

    public String getNom() {
        return nom;
    }

    public int getAnnee() {
        return annee;
    }
    public void afficher() {
        System.out.println("le nom : " + getNom());
        System.out.println("l'annee : " + getAnnee());
    }

    public boolean estEtudiant() {
        return  false;
    }

}
