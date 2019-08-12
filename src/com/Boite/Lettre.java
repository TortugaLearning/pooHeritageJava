package com.Boite;

public class Lettre extends Boitesauxlettres {
    private String fromat;

    public Lettre(double grammes, String expedition, String adresse,double prix, double totalprix, String fromat) {
        super(grammes, expedition, adresse, prix, totalprix);
        this.fromat = fromat;
    }

    public String getFromat() {
        return fromat;
    }

    public void setFromat(String fromat) {
        this.fromat = fromat;
    }
//    @Override
//    public double affranchir(){
//        if(fromat == "A3") {
//            getPrix() = 2.50 + (1.0 * (getGrammes() % 100));
//        } else if (fromat == "A4"){
//            getPrix() = 3.50 + (1.0 * (getGrammes() % 100));
//        }
//        if(getExpedition() == "oui"){
//            getPrix() = getPrix() *2;
//        }
//        return getTotalprix() = getTotalprix() + getPrix();
//    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println(" format : " + fromat);
    }
}
