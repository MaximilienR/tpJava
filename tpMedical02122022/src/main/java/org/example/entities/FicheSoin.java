package org.example.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class FicheSoin {

    @Id
    @GeneratedValue
    private  int numeroFiche;


    private  String agentCreacteur;
    private  String  addresseCreateur;

    @Temporal(TemporalType.DATE)
    private  Date dateCreation;


    public FicheSoin(){
        //constructor vide
    }

    public  FicheSoin(String agentCreacteur, String addresseCreateur,Date dateCreation){
        this.agentCreacteur=agentCreacteur;
        this.addresseCreateur=addresseCreateur;
        this.dateCreation=dateCreation;
    }

    public int getNumeroFiche() {
        return numeroFiche;
    }

    public void setNumeroFiche(int numeroFiche) {
        this.numeroFiche = numeroFiche;
    }

    public String getAgentCreacteur() {
        return agentCreacteur;
    }

    public void setAgentCreacteur(String agentCreacteur) {
        this.agentCreacteur = agentCreacteur;
    }

    public String getAddresseCreateur() {
        return addresseCreateur;
    }

    public void setAddresseCreateur(String addresseCreateur) {
        this.addresseCreateur = addresseCreateur;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
