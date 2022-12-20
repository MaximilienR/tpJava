package com.example.tpjavaeemedical.entitites;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;

@Data
public class FicheSoins {
    @Id
    private  int id;
    private Date dateCreation;
    private  String agentCreateur;
    private  String addresseCreateur;

    @OneToMany()
    private  FicheSoins ficheSoins

}
