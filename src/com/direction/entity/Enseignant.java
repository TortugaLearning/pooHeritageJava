package com.direction.entity;

public class Enseignant extends Employe {
private String sectionenseignement;


    public Enseignant(String nom, int annee, int salaire, String lieuString, String sectionenseignement) {
        super(nom, annee, salaire, lieuString);
        this.sectionenseignement = sectionenseignement;
    }

    public String getSectionenseignement() {
        return sectionenseignement;
    }

    public void setSectionenseignement(String sectionenseignement) {
        this.sectionenseignement = sectionenseignement;
    }

    @Override
    public void afficher() {
        System.out.println("Enseignant : ");
        super.afficher();
        System.out.println("la section d'enseignement : " + getSectionenseignement());
    }
}
