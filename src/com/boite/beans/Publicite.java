package com.boite.beans;

public class Publicite extends Carton {
    private String fromat;


    public Publicite(double grammes, String expedition, String adresse, String format) {
        super(grammes, expedition, adresse);
        this.fromat = format;
    }


}
