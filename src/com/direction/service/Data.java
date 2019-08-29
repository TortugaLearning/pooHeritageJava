package com.direction.service;

import com.direction.entity.Enseignant;
import com.direction.entity.EtudiantEchange;
import com.direction.entity.EtudiantRegulier;
import com.direction.entity.Secretaire;
import  com.direction.service.EnseignantService;
import  com.direction.service.EtudiantRegulierService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Data {

    EnseignantService enseignantService = new EnseignantService();
    EtudiantEchangeService etudiantEchangeService = new EtudiantEchangeService();
    EtudiantRegulierService etudiantRegulierService = new EtudiantRegulierService();
    SecretairesService secretairesService = new SecretairesService();

    public void printAnneeMoyen() {
        float totalAnnees = 0;

        for (Enseignant enseignant : this.enseignantService.getEnseignants()) {
            totalAnnees += enseignant.getAnnee();
        }

        for (Secretaire secretaire : this.secretairesService.getSecretaires()) {
            totalAnnees += secretaire.getAnnee();
        }

        for (EtudiantEchange etudiantEchange : this.etudiantEchangeService.getEtudiantEchanges()) {
            totalAnnees += etudiantEchange.getAnnee();
        }

        for (EtudiantRegulier etudiantRegulier : this.etudiantRegulierService.getEtudiantReguliers()) {
            totalAnnees += etudiantRegulier.getAnnee();
        }

        float anneeMoyen = totalAnnees / (this.enseignantService.getEnseignants().size() + this.secretairesService.getSecretaires().size() + this.etudiantEchangeService.getEtudiantEchanges().size() + this.etudiantRegulierService.getEtudiantReguliers().size());

        float dureeMoyenne = Calendar.getInstance().get(Calendar.YEAR) - anneeMoyen;

        System.out.println(String.format("Ils sont à l'EPFL depuis en moyenne : %f ans", dureeMoyenne));
    }

  public void printInfos() {
        for (Enseignant enseignant : this.enseignantService.getEnseignants()) {
            enseignant.afficher();

            Utils.newLine();
        }

        for (Secretaire secretaire : this.secretairesService.getSecretaires()) {
            secretaire.afficher();

            Utils.newLine();
        }

        for (EtudiantEchange etudiantEchange : this.etudiantEchangeService.getEtudiantEchanges()) {
            etudiantEchange.afficher();

            Utils.newLine();
        }

        for (EtudiantRegulier etudiantRegulier : this.etudiantRegulierService.getEtudiantReguliers()) {
            etudiantRegulier.afficher();

            Utils.newLine();
        }
    }

   public void printTotal() {
        Integer total = this.enseignantService.getEnseignants().size() + this.secretairesService.getSecretaires().size() + this.etudiantEchangeService.getEtudiantEchanges().size() + this.etudiantRegulierService.getEtudiantReguliers().size();

        Integer totalEtudiants = this.etudiantEchangeService.getEtudiantEchanges().size() + this.etudiantRegulierService.getEtudiantReguliers().size();

        System.out.println(String.format("Parmi les %d EPFLiens, %d sont des etudiants.", total, totalEtudiants));
    }


}
