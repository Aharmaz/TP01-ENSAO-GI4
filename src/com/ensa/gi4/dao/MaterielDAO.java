package com.ensa.gi4.dao;

import com.ensa.gi4.modele.Materiel;

public interface MaterielDAO {

    void listerMaterielDAO();
    Materiel rechercheParIdDAO(Integer id);
    void ajouterMaterielDAO(Materiel materiel);
    void supprimerMaterielDAO(Integer id);
    void modifierMaterielDAO(Integer id, String name);

}
