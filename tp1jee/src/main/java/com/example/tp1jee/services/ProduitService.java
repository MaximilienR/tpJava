package com.example.tp1jee.services;
import com.example.tp1jee.entities.Produit;
import com.example.tp1jee.models.*;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;

public class ProduitService {
    private  StandardServiceRegistry registre;
    private  SessionFactory sessionFactory;
    private  Session session;

    public ProduitService(){
        registre = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new  MetadataSources(registre).buildMetadate().buildSessionFactory();
        session=sessionFactory.openSession();
    }
    public  List<Produit>findAll(){
        session.beginTransaction();
        Query<Produit>produitQuery=session.createQuery("from Produit");
        session.getTransaction().commit();
        return  produitQuery.list();
    }

    public Produit findById(int id){
        Produit produit = null;
        session.begionTransaction();
        produit = (produit) session.get(Produit.class, id);
        session.getTransaction().commit();
        return  produit;
    }
}
