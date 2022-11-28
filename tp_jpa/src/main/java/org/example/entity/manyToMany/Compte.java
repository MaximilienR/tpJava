package org.example.entity.manyToMany;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "compte")
public class Compte {

    @Id
    @GeneratedValue
    private int id;

    private String Libelle;
    private  String Iban;
    private  Double Solde;
    private  String Agence;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable()
    private List<Client>clients=new ArrayList<>();

    public void addClient(Client client){
        clients.add(client);
        client.getComptes().add(this);
    }

}
