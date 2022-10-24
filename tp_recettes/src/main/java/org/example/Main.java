package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Plat choucroute= new Plat("Choucroute",recetteChoucroute());
        System.out.println(recetteChoucroute());

    }

    protected static List<Ingredient> recetteChoucroute() {
        ArrayList<Ingredient>ListeIngredient=new ArrayList<>();

        Ingredient Choucroute= new Ingredient("chou","Cuit",500,"G");
        Ingredient Lard =new Ingredient("lard","cuit et entier",150,"G");
        Ingredient Saucisse=new Ingredient("saucisse","cuit et entier",2,"G");
        ListeIngredient.add(Choucroute);
        ListeIngredient.add(Lard);
        ListeIngredient.add(Saucisse);
        System.out.println(ListeIngredient);
        System.out.println(Choucroute);
        return ListeIngredient;
    }

}