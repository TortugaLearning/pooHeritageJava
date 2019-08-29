package com.direction.service;

import com.direction.entity.EtudiantEchange;

import java.util.ArrayList;
import java.util.List;

public class EtudiantEchangeService {
    private List<EtudiantEchange> etudiantEchanges;

    public EtudiantEchangeService() {
        this.etudiantEchanges = new ArrayList<>();

        this.fillEtudiantEchangesService();
    }
    private void fillEtudiantEchangesService() {
        EtudiantEchange etudiantEchange = new EtudiantEchange("Bjorn Borgue", 2012, "Informatique", "KTH");

        this.etudiantEchanges.add(etudiantEchange);
    }

    public List<EtudiantEchange> getEtudiantEchanges() {
        return etudiantEchanges;
    }

}
