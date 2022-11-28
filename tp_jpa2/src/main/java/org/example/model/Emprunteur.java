package org.example.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/*Martin mystere est un emprunteur
qui est né le 17/02/1980,
qui habite au 78 rue de la Lys,Croix, 78123
avec une adresse mail :m.mystere@gmail.comet
joignable au 0787654389.*/


@Entity
@Table(name = "")
public class Emprunteur implements Serializable {
    //
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num_emprunteur", nullable = false)
    private int numEmprunteur;
    //nullable false == ne peut pas etre nul en bdd
    @Column(name = "prenom_emprunteur", nullable = false)
    private String prenomEmprunteur;

    @Column(name = "date_naissancence", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Column(name = "addresse", nullable = false)
    private String addresse;

    @Column(name = "mail", nullable = false)
    private String mail;

    @Column(name = "telephone", nullable = false)
    private String telephone;


    //construtor vide

    public Emprunteur() {

    }

    public int getNumEmprunteur() {
        return numEmprunteur;
    }

    public void setNumEmprunteur(int numEmprunteur) {
        this.numEmprunteur = numEmprunteur;
    }

    public String getPrenomEmprunteur() {
        return prenomEmprunteur;
    }

    public void setPrenomEmprunteur(String prenomEmprunteur) {
        this.prenomEmprunteur = prenomEmprunteur;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

