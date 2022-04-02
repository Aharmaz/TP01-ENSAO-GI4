package com.ensa.gi4.service.api;

import com.ensa.gi4.modele.Materiel;

import java.awt.*;

public interface GestionMaterielService {



    
    void init();
    void listerMateriel();
    void ajouterNouveauMateriel(Materiel materiel);
    void supprimerMateriel(int id);
    void modifierMateriel (int id, String name);
    void rechercherMateriel (Materiel materiel);
}
