package org.example;

public class Ingredient {
    String nom_aliment,etat;
    int quantite;
    String unite;

    public  Ingredient(String nom_aliment,String etat,int quantite,String unite){
        this.nom_aliment=nom_aliment;
        this.etat=etat; //enum ?
        this.quantite=quantite;
        this.unite =unite;//enum ?
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "nom_aliment='" + nom_aliment + '\'' +
                ", etat='" + etat + '\'' +
                ", quantite=" + quantite +
                ", unite='" + unite + '\'' +
                '}';
    }

    public  Ingredient(){
        //vide
    }
    //get set

    public String getNom_aliment() {
        return nom_aliment;
    }

    public void setNom_aliment(String nom_aliment) {
        this.nom_aliment = nom_aliment;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }


}
