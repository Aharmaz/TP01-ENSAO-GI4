package com.ensa.gi4.controller;

import com.ensa.gi4.dao.ListesMateriels;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;


@Component
public class GestionMaterielController {

    @Autowired
    private ListesMateriels li;


    @Autowired
    private GestionMaterielService gestionMaterielService;

    public void listerMateriel() {
        gestionMaterielService.listerMateriel();
    }

    public void afficherMenu() {
        System.out.println("1- pour lister le matériel, entrer 1");
        System.out.println("2- pour ajouter un nouveau matériel, entrer 2");
        System.out.println("0- pour sortir de l'application, entrer 0");
        System.out.println("3- pour supprimer un materiel, entrer 3");
        System.out.println("4- pour modifier un materiel, entrer 4");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        if ("0".equals(next)) {
            sortirDeLApplication();
        } else if ("1".equals(next)) {
            listerMateriel();
        } else if ("2".equals(next)) {

            String name;
            Integer id;
            name = scanner.next();
            id = scanner.nextInt();
            Materiel mat = new Livre(id, name);
            gestionMaterielService.ajouterNouveauMateriel(mat);
        } else if ("3".equals(next)) {


            int id;

            id = scanner.nextInt();
            gestionMaterielService.supprimerMateriel(id);

        } else if ("4".equals(next)) {


            String name;
            Integer id;
            name = scanner.next();
            id = scanner.nextInt();

            gestionMaterielService.modifierMateriel(id, name);

        } else {
            System.out.println("choix invalide");
        }
    }

    private void sortirDeLApplication() {
        System.exit(0);
    }

    public void setGestionMaterielService(GestionMaterielService gestionMaterielService) {
        // injection par accesseur
        this.gestionMaterielService = gestionMaterielService;
    }
}
