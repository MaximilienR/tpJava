package org.example.dao;

import  org.example.domain.Produit;
import java.util.List;
public interface IDeoProduit {

    Produit getProduit(Integer id);
    List<Produit>getAllProduit();

    //supprimer un produit
    void deleteProduit(Produit produit);

    void update(Produit produit);


    void updateProduit(Produit produit);
}
