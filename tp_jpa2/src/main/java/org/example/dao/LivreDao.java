package org.example.dao;

import org.example.Entity.Livre;

public interface LivreDao {

    Livre insertLivre ();

    Livre afficheLivre (int idLivre);

    void  deleteClient(Livre livre);

}
