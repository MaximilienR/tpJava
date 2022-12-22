package com.example.tphotelspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String nom;
    private  String prenom;
    private  String telephone;

    public  Client(String nom,String prenom,String telephone){
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setTelephone(telephone);
    }

}
