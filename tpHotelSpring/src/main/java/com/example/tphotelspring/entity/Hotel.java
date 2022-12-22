package com.example.tphotelspring.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;


@Data
public class Hotel {
    //nom, liste chambres, liste réservations, liste clients)
private String nom;
private  List<Chambre>chambreList;
private List<Reservation>reservationList;
private List<Client>clientList;
}
