package com.example.tptodojava.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

//Une todo est caractérisée par (id, titre, description, date, etat)
@Entity
@Table(name = "todo")
@Data
public class Todo {
    @Id
    private int id;
    private  String titre;

    private  String description;

    private Date date;

    private  boolean etat;

}
