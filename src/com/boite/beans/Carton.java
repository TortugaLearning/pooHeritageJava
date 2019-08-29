package com.boite.beans;

public class Carton {
    private double grammes;
    private String expedition;
    private String adresse;

    public Carton(double grammes, String expedition, String adresse) {
        this.grammes = grammes;
        this.expedition =expedition;
        this.adresse = adresse;
    }

    public double getGrammes() {
        return grammes;
    }

    public void setGrammes(double grammes) {
        this.grammes = grammes;
    }

    public String getExpedition() {
        return expedition;
    }

    public void setExpedition(String expedition) {
        this.expedition = expedition;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
