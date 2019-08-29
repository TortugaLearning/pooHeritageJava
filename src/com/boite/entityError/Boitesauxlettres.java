package com.boite.entityError;

public class Boitesauxlettres {
    private double grammes;
    private String expedition;
    private String adresse;
    private double prix;
    private double totalprix;

    public Boitesauxlettres(double grammes, String expedition, String adresse, double prix, double totalprix){
        this.grammes = grammes;
        this.expedition =expedition;
        this.adresse = adresse;
        this.prix = prix;
        this.totalprix = totalprix;

    }

//    public String getExpedition() {
//        return expedition;
//    }
//
//    public void setExpedition(String expedition) {
//        this.expedition = expedition;
//    }
//
//    public double getGrammes() {
//        return grammes;
//    }
//
//    public void setGrammes(int grammes) {
//        this.grammes = grammes;
//    }
//
//
//    public String getAddress() {
//        return adresse;
//    }
//
//    public void setAddress(String adresse) {
//        this.adresse = adresse;
//    }
//
//    public double getPrix() {
//        return prix;
//    }
//
//    public void setPrix(double prix) {
//        this.prix = prix;
//    }
//
//
//    public double getTotalprix() {
//        return totalprix;
//    }
//
//    public void setTotalprix(double totalprix) {
//        this.totalprix = totalprix;
//    }
//
//    public void affranchir(){
//        setPrix( 2.50 + (1.0 * (getGrammes() % 100)));
//    }
//
//    public void total() {
//        setTotalprix(getTotalprix() + getPrix());
//    }
//
//    public void afficher() {
//        if((adresse.length()<=0)||(expedition == "non")){
//            System.out.println("courrier invalide");
//        }
//        System.out.println(" grammes : " + grammes);
//        System.out.println(" expedition : " + expedition);
//        System.out.println(" adresse : " + adresse);
//    }
}
