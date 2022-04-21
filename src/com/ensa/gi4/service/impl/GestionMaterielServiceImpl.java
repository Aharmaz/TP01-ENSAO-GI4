package com.ensa.gi4.service.impl;

import com.ensa.gi4.dao.ListesMateriels;
import com.ensa.gi4.dao.MaterielDAO;
import com.ensa.gi4.dao.MaterielDAOImpl;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component()
public class GestionMaterielServiceImpl implements GestionMaterielService {


    @Autowired
    public MaterielDAO materielDAO;

    GestionMaterielServiceImpl(MaterielDAO materielDAO) {
        this.materielDAO = materielDAO;

    }
    public GestionMaterielServiceImpl() {
        
    }

    // bd goes here
    @Override
    public void init() {
        System.out.println("inititialisation du service");
    }

    @Override
    public void listerMateriel() {

        materielDAO.listerMaterielDAO();

    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {

        materielDAO.ajouterMaterielDAO(materiel);

    }

    public void supprimerMateriel (int id) {

        materielDAO.supprimerMaterielDAO(id);

    }

    @Override
    public void modifierMateriel (int id, String name) {

        materielDAO.modifierMaterielDAO(id, name);

    }


    public void rechercherMateriel (Materiel materiel) {

        materielDAO.rechercheParIdDAO(materiel.getId());

    }


}
