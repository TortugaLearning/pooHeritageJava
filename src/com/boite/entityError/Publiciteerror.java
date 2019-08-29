package com.boite.entityError;

public class Publiciteerror extends Boitesauxlettres {

    public Publiciteerror(double grammes, String expedition, String adresse, double prix, double totalprix) {
        super(grammes, expedition, adresse, prix, totalprix);
    }

//    @Override
//    public void affranchir(){
//        System.out.println("Publicite");
//        super.afficher();
//        setPrix(5.0 *  ((getGrammes() % 100)));
//        total();
//    }

}
