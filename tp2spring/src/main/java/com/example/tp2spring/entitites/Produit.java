package com.example.tp2spring.entitites;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Produit {

    @Id
    @GeneratedValue
    private int id;

    private String marque;

    private String reference;

    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    private double prix;

    private int stock;


    public Produit(){

    }

    public Produit(String marque, String reference, Date dateAchat, double prix, int stock) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @OneToMany(mappedBy = "produit")
    private List<Image> images=new ArrayList<>();
    @OneToMany(mappedBy = "produit")
    private  List<Commentaire>commentaires;
    public  void ajouterCommentire(Commentaire c){
        commentaires.add(c);
    }
    //correction ex5
    /*@OneToMany(mappeBy="produit")
    private List<Image>image
    @OneToMany(mappeBy="produit")
    provate List<Comment> comments

    public Produit(String marque, String reference, Date dateAchaat, double prix){
    this.marque=marque
    this.refeence=reference
    this.dateAchat=dateAchat;
    this.prix=prix

    publoc List<Image> getImages() {return images;}

    public void setImage(List<Image>images ) {this.images=image }
    * */
}
