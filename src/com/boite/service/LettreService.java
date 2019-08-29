package com.boite.service;

import com.boite.entityError.Lettre;

import java.util.ArrayList;
import java.util.List;

public class LettreService {
    private List<Lettre> lettresServices;


    public LettreService() {

        this.lettresServices = new ArrayList<>();

        this.fillLettresServices();
    }

    private void fillLettresServices() {
        Lettre lettre = new Lettre(200.0, "oui", "Chemin des Acacias 28, 1009 Pully",0, 0,"A3");
        Lettre lettreInvalide = new Lettre(800.0, "non", "",0, 0 ,"A4");

        this.lettresServices.add(lettre);
        this.lettresServices.add(lettreInvalide);
    }

    public List<Lettre> getLettresServices() {
        return lettresServices;
    }

    public void setLettresServices(List<Lettre> lettresServices) {
        this.lettresServices = lettresServices;
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
