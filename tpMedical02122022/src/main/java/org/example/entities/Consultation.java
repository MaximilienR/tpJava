package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Consultation")
public class Consultation {
    @GeneratedValue

    private Date dateConsultation;

}
