package org.example.logique;

import org.example.entity.manyToMany.Client;
import org.example.entity.manyToMany.Compte;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Logique {
    private  static EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque_bdd");

    public static void main(){

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Client client = new Client("1","Random","Smith",10.12.20;

        Compte compte1=new Compte();

        client.addCompte(compte1);

        em.persist(client);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
