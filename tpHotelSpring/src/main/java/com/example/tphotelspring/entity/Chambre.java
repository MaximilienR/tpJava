package com.example.tphotelspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Chambre {
    @Id
    private  int numeroChambre;
    private  boolean statut;
    private  double tarif ;

    private  int capacite;

}
