package com.Direction.entity;

import com.Direction.entity.Base;

public class Etudiant extends Base {
private String section;

    public Etudiant(String nom, int annee, String section) {
        super(nom, annee);
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public boolean estEtudiant() {
        return  true;
    }

    @Override
    public void afficher() {
        super.afficher();
            System.out.println("Section : " + getSection());
        }
    }
