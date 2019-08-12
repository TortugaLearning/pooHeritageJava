package com.Direction.entity;

public class Etudiantregulier extends Etudiant {
    private double moyenne;

    public Etudiantregulier(String nom, int annee, String section, double moyenne) {
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
        super.afficher();
        System.out.println("le moyenne : " + getMoyenne());
    }
}
