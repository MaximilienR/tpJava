package org.example.impl;
import org.example.dao.LivreDao;
import org.example.Entity.Livre;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LivreDAOImp  implements  LivreDao{

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Livre");

    private  EntityManagerFactory em=emf.createEntityManager();



    public void  deleteLivre(Livre livre){em.remove(livre);}

    public  Livre  searchLivre(int idLivre){return  em.find(Livre.class, idLivre);}

    public  void  random(){
        em.close();
        emf.close();
    }


    /*@Override
    public Livre insertLivre() {
        return null;
    }

    @Override
    public Livre afficheLivre(int idLivre) {
        return null;
    }

    @Override
    public void deleteClient(Livre livre) {

    }
*/


}
