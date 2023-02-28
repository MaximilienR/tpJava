package com.example.tp_ecf_android.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.tp_ecf_android.entity.Product;

@Dao
public interface ProductDao {

    @Query("SELECT * FROM product where id=:id")
    LiveData<Product>findByid(int id);
}

