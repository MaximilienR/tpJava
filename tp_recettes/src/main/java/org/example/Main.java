package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Plat choucroute= new Plat("Choucroute",recetteChoucroute());
        System.out.println(recetteChoucroute());

    }
    public static void plat2(String[] args){
        Plat soupe=new Plat("soupe",recetteSoupe());
        System.out.println(recetteSoupe());
    }

    protected static List<Ingredient> recetteChoucroute() {
        ArrayList<Ingredient>ListeIngredient=new ArrayList<>();

        Ingredient Choucroute= new Ingredient("chou","Cuit",500,"G");
        Ingredient Lard =new Ingredient("lard","cuit et entier",150,"G");
        Ingredient Saucisse=new Ingredient("saucisse","cuit et entier",2,"G");
        ListeIngredient.add(Choucroute);
        ListeIngredient.add(Lard);
        ListeIngredient.add(Saucisse);
     //   System.out.println(ListeIngredient);
        //System.out.println(Choucroute);
       // System.out.println(Lard);
       // System.out.println(Saucisse);

        return ListeIngredient;
    }
    protected static List<Ingredient>recetteSoupe(){
        ArrayList<Ingredient>ListeIngredient= new ArrayList<>();
        Ingredient  Tomate = new Ingredient("tomate","cuit",1,"KG");
        Ingredient  Oignon = new Ingredient("Oignion","cru",30,"G");
        Ingredient  Eau = new Ingredient("eau","cuit",3,"l");
        Ingredient Creme = new Ingredient("creme fraiche","cru",30,"g");
        ListeIngredient.add(Tomate);
        ListeIngredient.add(Oignon);
        ListeIngredient.add(Eau);
        ListeIngredient.add(Creme);
        return  ListeIngredient;

        /*if (recetteSoupe()==recetteChoucroute()) {
            System.out.println("contient les memes incredient");
        } else {
            System.out.println("ceci ne contient pas les même ingredients");
        }*/

    }



}