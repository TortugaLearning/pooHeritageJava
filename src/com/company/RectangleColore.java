package com.company;

public class RectangleColore extends Rectangle {
    private int couleur;


    public RectangleColore(double larg, double longueur, int c, double x, double y) {
        super(larg, longueur, x, y);
        couleur = c;
    }
    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = 1;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("couleur =" + couleur);
    }
}
