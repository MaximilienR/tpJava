package com.example.tp_ecf_android.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "product")
public class Product {
    @PrimaryKey(autoGenerate=true)
    private  int id;

    @NonNull
    private String title;

    @NonNull
    private  double price;

    @NonNull
    private  String description;
    @NonNull
    private String category;
    @NonNull
    private  String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    @NonNull
    public String getCategory() {
        return category;
    }

    public void setCategory(@NonNull String category) {
        this.category = category;
    }

    @NonNull
    public String getImage() {
        return image;
    }

    public void setImage(@NonNull String image) {
        this.image = image;
    }

    public  Product(@NonNull String title,double price,String description){
        this.title=title;
        this.price=price;
        this.description=description;
        
    }
}
