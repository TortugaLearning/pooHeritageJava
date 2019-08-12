package com.Direction.entity;

public class Etudiantechange  extends  Etudiant{
    private String universite;

    public Etudiantechange(String nom, int annee, String section, String universite) {
        super(nom, annee, section);
        this.universite = universite;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("l'universite : " + getUniversite());
    }
}
