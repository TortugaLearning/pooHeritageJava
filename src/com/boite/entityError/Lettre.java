package com.boite.entityError;

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

//   @Override
//    public void affranchir(){
//        if(fromat == "A3") {
//            setPrix( 2.50 + (1.0 * (getGrammes() % 100)));
//        } else if (fromat == "A4"){
//            setPrix(3.50 + (1.0 * (getGrammes() % 100)));
//        }
//        if(getExpedition() == "oui"){
//            setPrix(getPrix() *2);
//        }
//       total();
//    }
//    @Override
//    public void afficher() {
//        System.out.println("Lettre");
//        super.afficher();
//        System.out.println(" format : " + fromat);
//    }
}
