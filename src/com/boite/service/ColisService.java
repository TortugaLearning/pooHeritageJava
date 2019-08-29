package com.boite.service;

import com.boite.entityError.Colis;

import java.util.ArrayList;
import java.util.List;


public class ColisService {
    private List<Colis> colisServices;

    public  ColisService() {
        this.colisServices = new ArrayList<>();

        this.fillColisServices();
    }


    public void fillColisServices() {
        Colis colis = new Colis(5000.0, "oui", "Grand rue 18, 1950 Sion", 25.0, 0, 30);
        Colis colisInvalide = new Colis(3000.0, "oui", "Chemin des fleurs 48, 2800 Delemont", 0, 0, 70);

        this.colisServices.add(colis);
        this.colisServices.add(colisInvalide);
    }

    public void setColisServices(List<Colis> colisServices) {
        this.colisServices = colisServices;
    }

    public List<Colis> getColisServices() {
        return  colisServices;
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
