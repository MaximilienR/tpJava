package com.example.tpspringbootangularmongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Employe {
 

    private  String firstname;

    private  String lastname;

    private Date startDate;

    private  double salary;

}
