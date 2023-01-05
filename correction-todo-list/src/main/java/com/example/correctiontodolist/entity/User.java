package com.example.correctiontodolist.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  String pseudo;
    private  String mail;
    private  String password;

    public User(){

    }
    public User(String pseudo,String mail,String  password){
        this.setPseudo(pseudo);
        this.setMail(mail);
        this.setPassword(password);
    }
}
