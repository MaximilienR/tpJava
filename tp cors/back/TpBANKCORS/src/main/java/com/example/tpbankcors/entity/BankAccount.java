package com.example.tpbankcors.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bank_account")
@Data
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private double balance;
    @Temporal(TemporalType.DATE)
    private Date created_at;
    private String status;
    private double over_draft;
    private double interest_rate;




    //mes constructor
    public BankAccount() {
        //vide
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "bankAccount")
    private List<AccountOperation> accountOperationList;

}
