package org.example;

import org.example.CompteEpargne;
import org.example.Compte;
import org.example.ComptePayant;
import org.example.CompteSimple;
public class Main {
    public static void main(String[]args){
        Compte compte1=new Compte(001,1200.94);
        System.out.println("votre compte est le numéro"+ " "+compte1.code + " " + "et le montant de votre compte est de "+ " "+compte1.solde);
        CompteSimple compt2=new CompteSimple(111,12.1)
    }
}
