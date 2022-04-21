package com.ensa.gi4.dao;

import com.ensa.gi4.controller.GestionMaterielController;
import com.ensa.gi4.modele.Materiel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class MaterielDAOImpl implements MaterielDAO {

    // ApplicationContext context = new ClassPathXmlApplicationContext("/beans/app-context.xml");

    @Autowired
    public ListesMateriels lis;


    public MaterielDAOImpl() {

    }

    @Override
    public void listerMaterielDAO() {
        ArrayList<Materiel> l = lis.getLi();
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i).getName());
        }
    }

    @Override
    public Materiel rechercheParIdDAO(Integer id) {
        return null;
    }

    @Override
    public void ajouterMaterielDAO(Materiel materiel) {

        lis.li.add(materiel);
    }

    @Override
    public void supprimerMaterielDAO(Integer id) {
        for (int i = 0; i < lis.li.size(); i++) {
            if (lis.li.get(i).getId() == id) {
                lis.li.remove(i);
            }
        }
    }

    @Override
    public void modifierMaterielDAO(Integer id, String name) {
        for (int i = 0; i < lis.li.size(); i++) {
            if (lis.li.get(i).getId() == id) {
                lis.li.get(i).setName(name);
            }
        }
    }
}
