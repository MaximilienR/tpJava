package org.example.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "inscrit")
public class Inscrit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_i;

    @Column(length = 30)
    private String nom_i;

    @Column(length = 30)
    private String prenom_i;

    private Date date_naissance_i;

    @Column(length = 50)
    private String rue_i;

    @Column(length = 50)
    private String ville_i;

    @Column(length = 5)
    private String cp_i;

    @Column(length = 15)
    private String tel_i;

    @Column(length = 15)
    private String tel_portable_i;

    @Column(length = 100)
    private String email_i;

    @OneToMany(mappedBy = "inscrit",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Emprunt> empruntList;

    public Long getId_i() {
        return id_i;
    }

    public void setId_i(Long id_i) {
        this.id_i = id_i;
    }

    public String getNom_i() {
        return nom_i;
    }

    public void setNom_i(String nom_i) {
        this.nom_i = nom_i;
    }

    public String getPrenom_i() {
        return prenom_i;
    }

    public void setPrenom_i(String prenom_i) {
        this.prenom_i = prenom_i;
    }

    public Date getDate_naissance_i() {
        return date_naissance_i;
    }

    public void setDate_naissance_i(Date date_naissance_i) {
        this.date_naissance_i = date_naissance_i;
    }

    public String getRue_i() {
        return rue_i;
    }

    public void setRue_i(String rue_i) {
        this.rue_i = rue_i;
    }

    public String getVille_i() {
        return ville_i;
    }

    public void setVille_i(String ville_i) {
        this.ville_i = ville_i;
    }

    public String getCp_i() {
        return cp_i;
    }

    public void setCp_i(String cp_i) {
        this.cp_i = cp_i;
    }

    public String getTel_i() {
        return tel_i;
    }

    public void setTel_i(String tel_i) {
        this.tel_i = tel_i;
    }

    public String getTel_portable_i() {
        return tel_portable_i;
    }

    public void setTel_portable_i(String tel_portable_i) {
        this.tel_portable_i = tel_portable_i;
    }

    public String getEmail_i() {
        return email_i;
    }

    public void setEmail_i(String email_i) {
        this.email_i = email_i;
    }

    public List<Emprunt> getEmpruntList() {
        return empruntList;
    }

    public void setEmpruntList(List<Emprunt> empruntList) {
        this.empruntList = empruntList;
    }

    public Inscrit(Long id_i, String nom_i, String prenom_i, Date date_naissance_i, String rue_i, String ville_i, String cp_i, String tel_i, String tel_portable_i, String email_i, List<Emprunt> empruntList) {
        this.id_i = id_i;
        this.nom_i = nom_i;
        this.prenom_i = prenom_i;
        this.date_naissance_i = date_naissance_i;
        this.rue_i = rue_i;
        this.ville_i = ville_i;
        this.cp_i = cp_i;
        this.tel_i = tel_i;
        this.tel_portable_i = tel_portable_i;
        this.email_i = email_i;
        this.empruntList = empruntList;

    }

    public Inscrit(String nom_i, String prenom_i, Date date_naissance_i, String rue_i, String ville_i, String cp_i, String tel_i, String tel_portable_i, String email_i, List<Emprunt> empruntList) {
        this.nom_i = nom_i;
        this.prenom_i = prenom_i;
        this.date_naissance_i = date_naissance_i;
        this.rue_i = rue_i;
        this.ville_i = ville_i;
        this.cp_i = cp_i;
        this.tel_i = tel_i;
        this.tel_portable_i = tel_portable_i;
        this.email_i = email_i;
        this.empruntList = empruntList;
    }

    public Inscrit() {
    }
}
