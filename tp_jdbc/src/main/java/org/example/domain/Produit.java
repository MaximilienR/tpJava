package org.example.domain;

import java.io.Serializable;

public class Produit implements Serializable {

    private Integer idProduct;
    private String name;
    private Float price;
    private Integer quantity;
    private String description;

    public Produit(){

    }
    private  Produit(String name,Float price,Integer quantity,String description){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.description=description;

    }

    public Produit(int id_prod) {
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
}
