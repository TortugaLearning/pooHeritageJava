package com.boite.service;

import com.boite.entityError.Publiciteerror;

import java.util.ArrayList;
import java.util.List;

public class PubliciteService {
    private List<Publiciteerror> publicitesServices;

    public PubliciteService() {

        this.publicitesServices = new ArrayList<>();

        this.fillPublicitesService();
    }

    public void fillPublicitesService() {
        Publiciteerror publicite = new Publiciteerror(1500.0, "oui", "Les Moilles  13A, 1913 Saillon",15.0, 0);
        Publiciteerror publiciteInvalide = new Publiciteerror(1500.0, "non", "", 0, 0);

        this.publicitesServices.add(publicite);
        this.publicitesServices.add(publiciteInvalide);
    }

    public List<Publiciteerror> getPublicitesServices() {
        return publicitesServices;
    }

    public void setPublicitesServices(List<Publiciteerror> publicitesServices) {
        this.publicitesServices = publicitesServices;
    }

    //    @Override
//    public void affranchir(){
//        System.out.println("Publicite");
//        super.afficher();
//        setPrix(5.0 *  ((getGrammes() % 100)));
//        total();
//    }
}
