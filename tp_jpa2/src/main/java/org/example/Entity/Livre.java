package org.example.Entity;

import javax.persistence.*;
import java.io.Serializable;

/*Livre : La vie c’est cool : 2009
:  Un livre sur la vie.
 Elle est trop cool :
  Littérature : 5exemplaires : Edtion Editis.*/

@Entity
@Table(name = "")
public class Livre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="num_exemplaire", nullable = false )
    private int numExemplaire;

    @Column(name="titre_livre", nullable = false )
    private  int titreLivresse;
    @Column(name = "category", nullable = false)
    private String category;
    @Column(name = "Edition",nullable = false)
    private String edition;




    public  Livre(){

    }

    public int getNumExemplaire() {
        return numExemplaire;
    }

    public void setNumExemplaire(int numExemplaire) {
        this.numExemplaire = numExemplaire;
    }

    public int getTitreLivresse() {
        return titreLivresse;
    }

    public void setTitreLivresse(int titreLivresse) {
        this.titreLivresse = titreLivresse;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }


}
