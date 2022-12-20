package com.example.tp2spring.entitites;

import jakarta.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  String url;
    @ManyToOne
    @JoinColumn(name ="idProduit");
    public  Image(){

    }

    public  Image(){
        this.url=
    }
    public  Image(String url){
        this.url=url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
