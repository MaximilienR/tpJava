package com.example.tp_dto_spring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "post")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;
    private  String content;
    private  String description;
    private  String title;

    //@OneToMany

  }
