package com.example.tp_ecf_android.utils;

import android.content.Context;

import androidx.room.Database;
import com.example.tp_ecf_android.dao.ProductDao;
import com.example.tp_ecf_android.entity.Product;

import java.util.concurrent.Executors;

/*@Database(entities = {Product.class}, version = 2)
public abstract class ContextDataBase extends RoomDatabase {

    public abstract  ProductDao productDao();

    private static ContextDataBase instance=null;

    public stactic ContextDataBaseExecutor= Executors.newFixedThreadPool(3);

    public  static ContextDataBase getInstance(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context.getApplicationContext(),ContextDataBase.class,"formation_database")
        }
    }

}
*/