package org.example;

import java.util.ArrayList;
import java.util.List;

public class Plat {
    String nom;
     List<Ingredient> listIngredient = new ArrayList<>();


    public Plat(String nom,List <Ingredient>liste ){
        this.nom=nom;
        this.listIngredient=liste;
    }
    public Plat(){
        //vide
    }

    @Override
    public String toString() {
        return "Plat{" +
                "nom='" + nom + '\'' +
                ", listIngredient=" + listIngredient +
                '}';
    }
}
