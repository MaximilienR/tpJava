package org.example;


public class Salarie {


    private String matricule;
    private String nom;
    private String categorie;
    private String service;
    private double salaire;
    private static double totalSalaire = 0;
    private static int compteur = 0;


    public Salarie(String matricule, String nom, String categorie, String service, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.categorie = categorie;
        this.service = service;
        this.salaire = salaire;
        totalSalaire += salaire;
        compteur++;
    }



    public Salarie(){

    }


    public void AfficherSalaire()
    {
        System.out.printf("Le salaire de %s est de d% euros",this.nom, this.salaire);
    }

    public static void ResetCompteur(int valeur)
    {
        valeur = 0;
        compteur = valeur;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public static double getTotalSalaire() {
        return totalSalaire;
    }

    public static void setTotalSalaire(double totalSalaire) {
        Salarie.totalSalaire = totalSalaire;
    }

    public static int getCompteur() {
        return compteur;
    }

    public static void setCompteur(int compteur) {
        Salarie.compteur = compteur;
    }
}
