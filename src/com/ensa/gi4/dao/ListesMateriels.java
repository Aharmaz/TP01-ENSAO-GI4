package com.ensa.gi4.dao;

import com.ensa.gi4.modele.Chaise;
import com.ensa.gi4.modele.Livre;
import com.ensa.gi4.modele.Materiel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListesMateriels {


    public ArrayList<Materiel> li = new ArrayList<>();

    public ListesMateriels() {

        li.add(new Livre(1, "LIVRE 1"));
        li.add(new Livre(2, "LIVRE 2"));
        li.add(new Livre(3, "LIVRE 3"));

        li.add(new Chaise(1, "CHAISE france"));
        li.add(new Chaise(2, "CHAISE usa"));
        li.add(new Chaise(3, "CHAISE allemagne"));


    }

    public ListesMateriels(String s) {
    }


    public ArrayList<Materiel> getLi() {
        return li;
    }






}
