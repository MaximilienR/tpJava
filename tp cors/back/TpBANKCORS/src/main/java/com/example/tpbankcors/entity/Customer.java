package com.example.tpbankcors.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "email")
    private  String email;

    @Column(name = "name")
    private  String name;

    @OneToMany
    List<BankAccount>bankAccounts;
}
