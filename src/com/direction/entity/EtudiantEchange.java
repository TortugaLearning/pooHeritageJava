package com.direction.entity;

public class EtudiantEchange extends  Etudiant{
    private String universite;

    public EtudiantEchange(String nom, int annee, String section, String universite) {
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
        System.out.println("Etudiant echange : ");
        super.afficher();
        System.out.println("l'universite : " + getUniversite());
    }
}
