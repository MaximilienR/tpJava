package org.example.entity.manyToMany;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client")

public class Client {
    private int id ;

    private String nom;
    private  String prenom;
    private Date date_de_naissance;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "")
    private List<Compte>comptes= new ArrayList<>();
    private List<Compte>clients= new ArrayList<>();

    public List<Client> getClients(){
        return  clients;
    }
    public Client(int id, String nom, String prenom, Date date_de_naissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
    }

    public void Compte(){

    }

    public void addCompte(Compte compte){
        comptes.add(compte);
        compte.getCompts().add(this);

    }

}
