package com.example.tpjavaeemedical.models;

import java.util.Date;

//nss, prenom string,nom string,deteN date,sexe,addresse string,num tel int
public class Patient {
    private String nss;
    private String nom;
    private String prenom;

    private Date dateNaissance;

    private  Character sexe;

    private int telephone;

    public Patient(){
        //constructor vide
    }

    public  Patient(String nss,String nom,String prenom,Date dateNaissance, Character sexe, int telephone){
                this.nss=nss;
                this.nom=nom;
                this.prenom=prenom;
                this.dateNaissance=dateNaissance;
                this.sexe=sexe;
                this.telephone=telephone;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Character getSexe() {
        return sexe;
    }

    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
