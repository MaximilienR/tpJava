package org.example.impl;

import org.example.dao.EmprunteurDao;
import org.example.model.Emprunteur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class EmprunteurDaoImp implements EmprunteurDao {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("BiblioMananger");

    private EntityManager em = emf.createEntityManager();

    public void  start(){
        em.getTransaction().begin();
        System.out.println("persistance en cours ");
    }
        //ajouter un emprunteur
    public Emprunteur addEmprunteur(String prenom_emprunteur, Date data_naissancence ){
        Emprunteur emprunteur = new Emprunteur();
        emprunteur.setPrenomEmprunteur(prenom_emprunteur);
        emprunteur.setDateNaissance(data_naissancence);
        em.merge(emprunteur);
        return  emprunteur;
    }


  /*  @Override
    public Emprunteur addEmprunteur(String nom, String prenom, Date date, String Telephone) {
        return null;
    }*/

    public  Emprunteur searchEmprunteur(int idEmprunteur ){
        return  em.find(Emprunteur.class,idEmprunteur);
    }



    public void deleteEmprunteur(Emprunteur emprunteur) {em.detach(emprunteur);}

    public void  random(){
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
/*
    @Override
    public Emprunteur addEmprunteur(String nom, String prenom, Date date, String Telephone) {
        return null;
    }

    @Override
    public Emprunteur searchEmprunteur() {
        return null;
    }

*/

}
