package com.direction.entity;

public class Secretaire extends Employe {
    public Secretaire(String nom, int annee, String lieu, int salaire) {
        super(nom, annee, salaire, lieu);
    }

    @Override
    public void afficher() {
        System.out.println("Secretaire : ");
        super.afficher();
    }
}
