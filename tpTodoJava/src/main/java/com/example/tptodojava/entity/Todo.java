package com.example.tptodojava.entity;

import lombok.Data;

import java.util.Date;

//Une todo est caractérisée par (id, titre, description, date, etat)
public class Todo {
    private int id;
    private  String titre;

    private  String description;

    private Date date;

    private  boolean etat;

}
