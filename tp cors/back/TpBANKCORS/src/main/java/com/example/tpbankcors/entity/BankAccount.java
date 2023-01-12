package com.example.tpbankcors.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "bank_account")
@Data
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;
    private  double balance;
    private Date created_at;
    private String status;
    private double over_draft;
    private double interest_rate;

    private BigInteger customer_id;


    //mes constructor
    public BankAccount() {
        //vide
    }

    @ManyToOne
    private  Customer customer;
}
