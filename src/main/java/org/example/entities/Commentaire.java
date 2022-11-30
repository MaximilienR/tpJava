package org.example.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="commentaire")
public class Commentaire {
    @Id
    @GeneratedValue
    private  int id;

    private String  contenu;
    private  int note;

    @Temporal(TemporalType.DATE)
    private Date dateCommentaire;

    public  Commentaire(){

    }

    public Commentaire(String contenu,Date dateCommentaire,int note){
        this.contenu= contenu;
        this.dateCommentaire=dateCommentaire;
        this.note=note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Date getDateCommentaire() {
        return dateCommentaire;
    }

    public void setDateCommentaire(Date dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }



}
