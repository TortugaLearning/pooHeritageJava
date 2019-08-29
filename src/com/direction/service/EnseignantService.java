package com.direction.service;

import com.direction.entity.Enseignant;

import java.util.ArrayList;
import java.util.List;

public class EnseignantService {
    private List<Enseignant> enseignants;

    public EnseignantService() {
        this.enseignants = new ArrayList<>();

        this.fillEnseignants();
    }

    public void fillEnseignants() {
        Enseignant enseignant = new Enseignant("Mathieu Matheu", 1998, 10000, "LMEP", "Physique");

        this.enseignants.add(enseignant);
    }

    public List<Enseignant> getEnseignants() {
        return enseignants;
    }
}
