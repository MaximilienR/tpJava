package org.example;

public class Main {
    public static void main(String[] args) {
      Chaise c1= new Chaise(4,"rouge","bois");
      Chaise c2= new Chaise(2, "verte","plastique");
      Chaise c3 = new Chaise(1,"transparant","plexiglace");
        System.out.println("--------Affichage d'un nouvel objet ---------");
        System.out.println("je suis un chaise avec  "+c1.NbrPied + " " + "pied"+" " + "de couleur "+c1.Couleur +" " + "en"+ " " +c1.Matiere);
        System.out.println("--------Affichage d'un nouvel objet ---------");
        System.out.println("je suis un chaise avec   "+ " "+c2.NbrPied + " "+"pied" +" " + "de couleur "+c2.Couleur+" " +"en" +" "+c2.Matiere) ;
        System.out.println("--------Affichage d'un nouvel objet ---------");
        System.out.println("je suis un chaise avec   "+ " "+c3.NbrPied + " "+"pied" +" " + "de couleur "+c3.Couleur+" " +"en" +" "+c3.Matiere) ;


    }
}