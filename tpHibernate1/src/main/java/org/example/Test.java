package org.example;

import com.mysql.cj.Session;
import org.example.entities.Produit;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
    public static void main(String [] args){

        private SessionFactory sessionFactory;
        public ProduitService() {
            registry = new StandardServiceRegistryBuilder();
            SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }
        Session session= (Session) sessionFactory.openSession();

        //creation des produit product
        Produit produit1 = new Produit();
        produit1.setReference("souris");
        produit1.setDateAchat(10-12-2020);
        produit1.setPrix(15.99);
        produit1.setStock(100);

        Produit produit2 = new Produit();
        produit2.setReference("ordinateur");
        produit2.setDateAchat(16-10-2022);
        produit2.setPrix(399.99);
        produit2.setStock(5);

//
        produit2.setReference("pc portable");
        session.update(produit2);

    //supprimer
        session.delete(produit1);
        session.getTransaction().commit;
        session.close();
        sessionFactory.close();

    }
}
