package com.example.microserviceproduit.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Produit {
    @Id
    private String id;
    private  String name;
    private int price;
    private int stock;

}
