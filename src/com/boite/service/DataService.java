package com.boite.service;

import com.boite.entityError.Colis;
import com.boite.entityError.Lettre;
import com.boite.entityError.Publiciteerror;

public class DataService {


    LettreService lettreService = new LettreService();
    PubliciteService publiciteService = new PubliciteService();
    ColisService colisService = new ColisService();


    public void printInfos() {

        for (Lettre lettre : this.lettreService.getLettresServices()) {
            lettre.afficher();

            UtilsService.newLine();
        }


        for (Publiciteerror publicite : this.publiciteService.getPublicitesServices()) {
            publicite.afficher();

            UtilsService.newLine();
        }

        for (Colis colis : this.colisService.getColisServices()) {
            colis.afficher();

            UtilsService.newLine();
        }

    }

}
