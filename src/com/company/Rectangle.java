package com.company;

public class Rectangle extends Figure {

    private double largeur;
    private double longueur;

    public Rectangle(double larg, double longueur, double x, double y) {
        super( x, y);
        this.largeur = larg;
        this.longueur = longueur;
    }

    public double surface() {
        return largeur * longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = 1;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = 1;
    }

    public void affiche(){
        affiche();
        System.out.println("largeur =" + largeur);
        System.out.println("longueur =" + longueur);
    }
}
