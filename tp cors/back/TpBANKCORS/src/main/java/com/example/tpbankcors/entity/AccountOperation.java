package com.example.tpbankcors.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Entity
@Data
public class AccountOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private  Double amount;
    private  String description;

    private Date operation_date;

    private  long bank_account_id;
}
