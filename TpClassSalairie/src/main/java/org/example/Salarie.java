package org.example;

public class Salarie {

    private int matricule;
    private int id=0;
    public static int count;
    private String categorie;
    private  String service;
    private String nom;
    private double salaire;

    public Salarie(int id,int matricule, String categorie, String service, String nom,double salaire) {
        this.id=++count;
        this.matricule = matricule;
        this.categorie = categorie;
        this.service =service;
        this.nom = nom;
        this.salaire = salaire;
    }



    public  void afficherSalaire() {
        System.out.println("le salaire de "+this.salaire);
    }

};

