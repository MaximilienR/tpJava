package com.example.tphotelspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
//cela permet de pas avoir a redefinir manuellement le constructor
@NoArgsConstructor
@Table(name = "chambre")
public class Chambre {
    @Id

    private  int numeroChambre;
    private  boolean statut;
    private  double tarif ;

    private  int capacite;

    @ManyToMany
    @JoinColumn(name = "hotel_id")
    private  Hotel hotel;
    @JoinColumn(name = "chambre_id")

    @OneToOne
    private  Client client;
}
