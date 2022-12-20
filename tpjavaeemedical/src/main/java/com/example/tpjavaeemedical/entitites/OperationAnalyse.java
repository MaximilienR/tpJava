package com.example.tpjavaeemedical.entitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "operation_analyse")
public class OperationAnalyse {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String description;
 @Column(name = "date_operation")
 private Date dateOperation;
 private String resultat;
}