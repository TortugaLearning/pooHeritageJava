package com.Direction.entity;

import com.Direction.entity.Base;

public class Employe extends Base {
    private int salaire;
    private  String lieu;

    public  Employe(String nom, int annee,int salaire, String lieu ){
        super(nom, annee);
        this.lieu = lieu;
        this.salaire = salaire;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void afficher() {
        super.afficher();
            if((lieu == "LMEP") || (lieu == "LMT")) {
                System.out.println("laboratoire : " + getLieu());
            } else {
                System.out.println("l'institut : " + getLieu());
            }
        System.out.println("le salaire : " + getSalaire());
    }
}
