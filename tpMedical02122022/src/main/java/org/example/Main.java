package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args)
    {

         //  StandardServiceRegistry registry= new StandardServiceRegistryBuilder().configure().build();
        //SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        //Session session = sessionFactory.openSession();

   new  Ihm().start();
    }
}