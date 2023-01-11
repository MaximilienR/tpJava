package com.example.tp_dto_spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comment")
public class Comments {



@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
