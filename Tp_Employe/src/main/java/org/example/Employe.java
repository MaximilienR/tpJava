package org.example;

public class Employe {
    private String nom;
    private int age;
    private double salaire;

    public Employe(String nom,int age,double salaire) {
        this.nom=nom;
        this.age=age;
        this.salaire=salaire;
    }
    public void afficher(){
        System.out.println(this.nom +" " +this.age+"an "+" "+this.salaire+"€");
    }
    public void calculeSalire(){

    }

}