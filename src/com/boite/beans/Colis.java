package com.boite.beans;


public class Colis extends Carton {
    private double litres;


    public Colis(double grammes, String expedition, String adresse, double litres) {
        super(grammes, expedition, adresse);
        this.litres = litres;
    }



    public double getLitres() {
        return litres;
    }

    public void setLitres(double litres) {
        this.litres = litres;
    }


}
