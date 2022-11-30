package org.example.interfaces;

import org.example.entities.Produit;

import java.util.Date;
import java.util.List;

public interface IDAO<T> {

    boolean create(T o);

    boolean update(T o);

    boolean delete(T o);

    T findById(int id);

    //Exercice 2
    List<T> findAll();

    List<T> filterByPrice(double min) throws Exception;

    List<T> filterByDate(Date min, Date max) throws Exception;

}
