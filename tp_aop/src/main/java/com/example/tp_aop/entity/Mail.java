package com.example.tp_aop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Mail {


    private  String head;
    private  String content;
    private  String destinataire;
    @Id
    private Long id;

}
