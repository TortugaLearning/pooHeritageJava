package com.company;

public class Cercle extends Figure {

    private double x;

    private double y;

    private double rayon;

    public Cercle(double x, double y, double r){
        super(x , y);
        rayon=r;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }

    public void setCentre(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public boolean estInterieur(double x,double y) {
        return (((x - this.x)  * (x - this.x) + (y - this.y) * (y - this.y)) <= rayon * rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double r) {
        if ( r < 0.0) r =0.0;
        rayon = r;
    }
    public void affiche(){
        super.affiche();
        System.out.println("rayon =" + rayon);
    }
}
