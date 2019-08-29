package com.boite.entityError;

public class Colis extends Boitesauxlettres {
private double litres;

    public Colis(double grammes, String expedition, String adresse,double prix, double totalprix, double litres) {
        super(grammes, expedition, adresse, prix, totalprix);
        this.litres = litres;
    }

    public double getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }

//@Override
//    public void affranchir(){
//        if(litres <= 70) {
//            setPrix( 0.25 + (litres * (getGrammes() % 100)));
//        } else if (litres >= 71){
//            setPrix(0);
//            }
//        total();
//        }
//
//
//    @Override
//    public void afficher() {
//        System.out.println("Colis");
//        if(litres > 51){
//            System.out.println("courrier invalide");
//        }
//        super.afficher();
//        System.out.println(" litres : " + litres);
//    }
}
