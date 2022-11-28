package org.example;

import org.example.dao.IDeoProduit;
import org.example.dao.ProduitDao;
import org.example.domain.Produit;
import org.example.utils.ConnexionBdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        IDeoProduit iDeoProduit=new ProduitDao();
        String url="jdbc:mysql://localhost:3306/";
        String userName="root";
        String password="";

       try{
             Connection connection = ConnexionBdd.getMySQLConnection();

            if(connection != null)
                System.out.println("Connexion ok");
            else
                System.out.println("Connexion echoué");

    } catch (SQLException e) {
           throw new RuntimeException(e);
       }

            Produit produit= iDeoProduit.getProduit(1);
            System.out.println(produit);

           List<Produit> produitList = iDeoProduit.getAllProduit();
           produitList.forEach(System.out::println);
       }
    };