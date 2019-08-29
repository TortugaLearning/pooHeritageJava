package com.direction.service;

import com.direction.entity.Secretaire;

import java.util.ArrayList;
import java.util.List;

public class SecretairesService {
    private List<Secretaire> secretaires;

    public SecretairesService() {
        this.secretaires = new ArrayList<>();

        this.fillSecretairesService();
    }

    private void fillSecretairesService() {
        Secretaire secretaire = new Secretaire("Sophie Scribona", 2005, "LMT", 5000);

        this.secretaires.add(secretaire);
    }
    public List<Secretaire> getSecretaires() {
        return secretaires;
    }
}
