package com.example.tpbankcors.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class AccountOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //remplacer long
    private BigInteger id;
    private Double amount;
    private String description;

    @Temporal(TemporalType.DATE)
    private Date operation_date;

    private long bank_account_id;

    @ManyToOne
    @JoinColumn(name = "Customer")
     private BankAccount bankAccount;
}
