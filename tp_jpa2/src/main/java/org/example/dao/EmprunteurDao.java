package org.example.dao;

import org.example.model.Emprunteur;
import  java.util.Date;


/*Martin mystere est un emprunteur
qui est né le 17/02/1980,
qui habite au 78 rue de la Lys,Croix, 78123
avec une adresse mail :m.mystere@gmail.comet
joignable au 0787654389.*/

public interface EmprunteurDao {


    Emprunteur addEmprunteur(String nom,String prenom, Date date, String Telephone);
    Emprunteur searchEmprunteur(int idEmprunteur );
    void deleteEmprunteur(Emprunteur emprunteur);
}
