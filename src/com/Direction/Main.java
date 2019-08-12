package com.Direction;

import com.Direction.entity.Enseignant;
import com.Direction.entity.Etudiantechange;
import com.Direction.entity.Etudiantregulier;
import com.Direction.entity.Secretaire;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Enseignant enseignant = new Enseignant("Mathieu Matheu", 1998, 10000, "LMEP", "Physique");
        Etudiantregulier etudiantregulier= new Etudiantregulier("Gaston Peutimide", 2013, "ssc", 6.0);
        Etudiantregulier etudiantregulier1 = new Etudiantregulier("Yvan Rattrapeur", 2011, "ssc", 2.5);
        Etudiantechange etudiantechangeinstance = new Etudiantechange("Bjorn Borgue", 2012, "Informatique", "KTH");
        Secretaire secretaireinstance = new Secretaire("Sophie Scribona", 2005, "LMT", 5000);

        ArrayList<Enseignant> listprof = new ArrayList<>(12);
        listprof.add(enseignant);
        ArrayList<Etudiantregulier> etudiantreguliers = new ArrayList<>(12);
        etudiantreguliers.add(etudiantregulier);
        etudiantreguliers.add(etudiantregulier1);
        ArrayList<Etudiantechange> etudiantechange= new ArrayList<>(1);
        etudiantechange.add(etudiantechangeinstance);
        ArrayList<Secretaire> secretaire = new ArrayList<>(1);
        secretaire.add(secretaireinstance);

        int total = listprof.size() + etudiantechange.size() + etudiantreguliers.size() + etudiantechange.size();
        int totaletudiant = etudiantechange.size() + etudiantreguliers.size();
        int anneetoday = Calendar.getInstance().get(Calendar.YEAR);
       // int annee0 = 0;
       // int moyen = annee0/total;
        System.out.println("Parmi les " + total +  " EPFLiens, " + totaletudiant +" sont des etudiants.");
        System.out.println("Ils sont à l'EPFL depuis en moyenne" + "ans");
        System.out.println("Liste des EPFLiens :");
        System.out.println("Etudiant regulier :");
        etudiantregulier.afficher();
        System.out.println("Etudiant regulier :");
        etudiantregulier1.afficher();
        System.out.println("Etudiant echange :");
        etudiantechangeinstance.afficher();
        System.out.println("Enseignant :");
        enseignant.afficher();
        System.out.println("Secretaire :");
        secretaireinstance.afficher();

    }
}
