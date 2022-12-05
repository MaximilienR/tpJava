package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Prescription {

    @GeneratedValue
    private  String designation;
    private  String indication;

    public Prescription(){
        //constructeur vide
    }

    public Prescription(String designation,String periode,String indication){

        this.designation=designation;

    }
}
