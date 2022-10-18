package org.example;


    public class Epargne extends Compte{

        public Epargne(int code, float solde,float tauxInteret) {
            super(code, solde);
            System.out.println("je suis un taux d'interet");
        }
    }
