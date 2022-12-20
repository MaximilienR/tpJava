package com.example.tp2spring.services;

import com.example.tp2spring.entitites.Produit;
import com.example.tp2spring.interfaces.IDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import javax.xml.stream.events.Comment;
import java.util.Date;
import java.util.List;

public class ProduitService implements IDAO<Produit> {

    private StandardServiceRegistry registre;

    private SessionFactory sessionFactory;

    private Session session;

    public ProduitService(){
        registre = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();
    }

    @Override
    public boolean create(Produit o) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Produit o) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean delete(Produit o) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Produit findById(int id) {
        Produit produit = null;
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        produit = (Produit)session.get(Produit.class, id);
        session.getTransaction().commit();
        return produit;
    }

    @Override
    public List<Produit> findAll() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query<Produit> produitQuery= session.createQuery("from Produit");
        session.getTransaction().commit();
        return produitQuery.list();
    }

    @Override
    public List<Produit> filterByPrice(double min) throws Exception {
        if(min >= 0) {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query<Produit> produitQuery = session.createQuery("from Produit where prix >= :min");
            produitQuery.setParameter("min",min);
            session.getTransaction().commit();
            return produitQuery.list();
        }
        throw new Exception("error value");
    }
    //suivre ligne 90
    @Override
    public List<Produit> filterByDate(Date min, Date max) throws Exception {
        if(min.before(max)){
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query<Produit> produitQuery = session.createQuery("from Produit where dateAchat >= :min and dateAchat <= :max");
            produitQuery.setParameter("min",min);
            produitQuery.setParameter("max",max);
            session.getTransaction().commit();
            return produitQuery.list();
        }
        throw new Exception("error date");
    }

    public double valeurStockParMarque(String marque) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query<Double> query = session.createQuery("select sum(prix) from Produit where marque =:marque");
        query.setParameter("marque",marque);
        return quniqueResult();
    }

    public double moyenne() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query<Double> query = session.createQuery("select avg(prix) from Produit");
        return querery.uy.uniqueResult();
    }

    public List<Produit> filterByMarques(List<String> marques) throws Exception {
        if(marques.size() > 0) {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Query<Produit> produitQuery= session.createQuery("from Produit where marque in :marques");
            produitQuery.setParameter("marques",marques);
            session.getTransaction().commit();
            return produitQuery.list();

        }
        throw new Exception("aucune marque");
    }

    public boolean deleteByMarque(String marque) {
        session = sessionFactory.openSession();
        Query query = session.createQuery("delete Produit where marque = :marque");
        query.setParameter("marque",marque);
        session.getTransaction().begin();
        int success = query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return success > 0;
    }

    // Ajouter une Image

    public boolean addNewImage(Image image, int id){
        boolean result = false;
        Produit produit = this.findById(id);
        session.getTransaction().begin();
        if(produit != null) {
            image.setProduit(produit);
            session.save(image);
            result = true;
        }
        session.getTransaction().commit();
        return result;
    }

    // Ajouter un commentaire
    public boolean addNewComment(Comment comment, int id){
        boolean result = false;
        Produit produit = this.findById(id);
        session.getTransaction().begin();
        if(produit != null) {
            comment.setProduit(produit);
            session.save(comment);
            result = true;
        }
        session.getTransaction().commit();
        return result;
    }

    // Recuperer un produit par note
    public List<Produit> getProduitsParNoteMin(int note){
        session = sessionFactory.openSession();
        Query<Produit> produitQuery= session.createQuery("select distinct produit from Comment where note >=:note");
        produitQuery.setParameter("note",note);
        return produitQuery.list();
    }




}
