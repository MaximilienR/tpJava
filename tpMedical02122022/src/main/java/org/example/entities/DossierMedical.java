package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class DossierMedical {
    @Id
    @GeneratedValue
    private int numeroDossier;

    private Date dateCreation;
    private  String CodeAcccess;


    public DossierMedical(){
        //constructor vide
    }
}
