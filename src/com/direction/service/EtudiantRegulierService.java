package com.direction.service;

import com.direction.entity.EtudiantRegulier;

import java.util.ArrayList;
import java.util.List;

public class EtudiantRegulierService {
    private List<EtudiantRegulier> etudiantReguliers;

    public EtudiantRegulierService() {
        this.etudiantReguliers = new ArrayList<>();

        this.filletudiantRegulierService();
    }

    private void filletudiantRegulierService() {
        EtudiantRegulier etudiantRegulier1 = new EtudiantRegulier("Gaston Peutimide", 2013, "ssc", 6.0);
        EtudiantRegulier etudiantRegulier2 = new EtudiantRegulier("Yvan Rattrapeur", 2011, "ssc", 2.5);

        this.etudiantReguliers.add(etudiantRegulier1);
        this.etudiantReguliers.add(etudiantRegulier2);
    }

    public List<EtudiantRegulier> getEtudiantReguliers() {
        return etudiantReguliers;
    }
}
