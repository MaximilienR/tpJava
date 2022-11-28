package org.example.entity.oneToMany;
import javax.persistence.*;

@Entity
@Table
public class Agence {

    private  int id;

    private String adresse;

    public Agence(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId(){return id;}
    public void setId(int id){this.id=id;}

    @ManyToMany
    @JoinColumn()
    public
}

