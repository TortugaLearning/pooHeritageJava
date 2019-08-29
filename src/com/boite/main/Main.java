package com.boite.main;

import com.boite.service.DataService;
import com.boite.service.UtilsService;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();

        dataService.printInfos();

        UtilsService.newLine();


//        Lettre lettre = new Lettre(200.0, "oui", "Chemin des Acacias 28, 1009 Pully", "A3");
//        Lettre lettreInvalide = new Lettre(800.0, "non", "", "A4");
//        Publicite publicite = new Publicite(1500.0, "oui", "Les Moilles  13A, 1913 Saillon");
//        Publicite publiciteInvalide = new Publicite(1500.0, "non", "");
//        Colis colis = new Colis(5000.0, "oui", "Grand rue 18, 1950 Sion", 30.0);
//        Colis colisInvalide = new Colis(3000.0, "oui", "Chemin des fleurs 48, 2800 Delemont", 70.0);


//        System.out.println("Le montant total d'affranchissement est de");
//        System.out.println("lettre");
//        lettre.afficher();
//        System.out.println("lettre");
//        lettreInvalide.afficher();
//        System.out.println("Publicité");
//        publicite.afficher();
//        System.out.println("Publicité");
//        publiciteInvalide.afficher();
//        System.out.println("Colis");
//        colis.afficher();
//        System.out.println("Colis");
//        colisInvalide.afficher();
    }
}
