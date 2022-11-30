package org.example;

import org.example.entities.Produit;
import org.example.services.ProduitService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Exercice 1

        // Creation des produits
/*
        ProduitService ps = new ProduitService();
        ps.create(new Produit("TOSHIBA","zzaa123",new Date("2016/01/08"), 6000,555));
        ps.create(new Produit("HP","EER678",new Date("2016/02/09"), 2000,444));
        ps.create(new Produit("SONY VAIO","AQWZSX",new Date("2016/09/23"), 6000,333));
        ps.create(new Produit("DELL","AZERTY",new Date("2016/02/12"), 6000,222));
        ps.create(new Produit("SONY","qsdERT",new Date("2016/02/02"), 6000,111));

        // informations produit id = 2
        Produit p = ps.findById(2);
        System.out.println(p.getId()+ " , "+p.getMarque()+" , "+p.getReference());

        // supprimer le produit dont id = 3
            ps.delete(ps.findById(3));

        // Modifier les informations du produit dont id =1
        p = ps.findById(1);
        if(p != null) {
            p.setMarque("HP");
            p.setReference("MMMMMPPPP");
            p.setDateAchat(new Date("2015/09/08"));
            p.setPrix(50000);
            ps.update(p);
        }



        /*2
        String madate = "08/08/2022";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(madate);
        System.out.println(date);

        ProduitService ps = new ProduitService();
        List<Produit> produits = ps.findAll();
        for(Produit pr :  produits) {
            System.out.println(pr.getId());
        }

        double minPrice = 40000;
        List<Produit> produitspascher = null;
        try {
            produitspascher = ps.filterByPrice(minPrice);
            for(Produit pr :  produitspascher) {
                System.out.println(pr.getPrix());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String madate1 = "01/01/2016";
        String madate2 = "01/01/2017";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(madate1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(madate2);
        List<Produit> produitspardate = null;
        try {
            produitspardate = ps.filterByDate(date1, date2);
            for(Produit pr :  produitspardate) {
                System.out.println(pr.getId());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        


        // Exercise 3


        ProduitService ps = new ProduitService();

        Scanner sc = new Scanner(System.in);
         System.out.println("Entrer la premier date sous Format dd/MM/yyyy");
        String madate1 = sc.next();
       System.out.println("Entrer la deuxième date sous Format dd/MM/yyyy");
        String madate2 = sc.next();

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(madate1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(madate2);

        List<Produit> produitsDate = null;
        try{
            produitsDate = ps.filterByDate(date1,date2);
            for(Produit pr : produitsDate){
                System.out.println(pr.getId()+" "+pr.getMarque());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        //pour le stock inferieur lu au clavier

        System.out.println("Entrer le nombre de stock supérieur");
        int stock1 =sc.nextInt();
        List<Produit> produitStock = null;

        try{
            produitStock =ps.filterByStock(stock1);
            for (Produit pr: produitStock){
                System.out.println(pr.getId()+" "+pr.getReference()+" "+ pr.getStock());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        /* ex 4 Afficher la valeur du stock du produits de la marque apple

        //affichage
        Querry<Integer> querryStock = session.createQuery("select some (product)")
        List<Produit> produitsVal = null;
        try{
            produitsVal = ps.filterByDate(date1,date2);
            for(Produit pr : produitsVal){
                System.out.println(pr.getId()+" "+pr.getMarque());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        //calculer

        /

        //recupere
        Query<Produit> query=session.createQuery("from Produit where marque in : Samsung,apple,oppo,huwai");
        query.setParameter("noms",noms);

        List<Produit>personnes=query.list();

        for (Produit p : produits){
            System.out.println(p.getNom());
        }


        //supprimer
        Double delete_query="DELETE Product where marque='sumsung'"
        query.setParameter("marque","Sumsung");
        session.getTransaction().commit();
        session.close();
        System.out.println(success);
    }


    }
}
*/

        //////////////////debut exo
        StandardServiceRegistry registre =new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        NativeQuery query= session.createSQLQuery("select Reference from Personne WHERE Reference >=4");
        System.out.println();
        //////////////////fin exo



        new  Ihm().start();
        }}

