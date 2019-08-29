package com.direction.entity;

public class EtudiantRegulier extends Etudiant {
    private double moyenne;

    public EtudiantRegulier(String nom, int annee, String section, double moyenne) {
        super(nom, annee, section);
        this.moyenne = moyenne;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public void afficher() {
        System.out.println("Etudiant regulier : ");
        super.afficher();
        System.out.println("le moyenne : " + getMoyenne());
    }
}
