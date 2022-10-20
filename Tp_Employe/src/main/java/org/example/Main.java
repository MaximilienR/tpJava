package org.example;

public class Main {
    public static void main(String[] args) {
        Employe employeRandom = new Employe("Smith",33,1200.99);
        employeRandom.afficher();
       Technicien technicienRandom = new Technicien("smith2",50,1200.99,2);
        technicienRandom.afficher();
        //System.out.println(technicienRandom);
        //technicienRandom.calculeSalaire();
     }
}