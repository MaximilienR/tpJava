package com.example.tptodojava.tools;

import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.HibernateException;
public class HibernateUtil {

    private static final SessionFactory sessionFactory=buildSessionFactory();

    private  static  SessionFactory buildSessionFactory(){
        try {
            return new  Configuation().configure("static/hibernate.cfg.xml").buildSessionFactory();
        }catch (HibernateException e){
            throw e;
        }
    }
    public static SessionFactory getSessionFactory(){return sessionFactory;}
}
