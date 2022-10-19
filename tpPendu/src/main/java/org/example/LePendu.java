package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LePendu {
    public static void Main(){
        //tableau de mot
        String[] Tabmot =   { "voiture", "chat", "maison","ordinateur" };
       //afficher les mots dans un tableau
        //System.out.println(Tabmot[1]);
        /*for(String i:Tabmot){
            System.out.println(i);
        }*/

        int x = 10;
        x += 12;
        final int y = x/4;
        x = x + y;
        System.out.println("x =" + x);
        System.out.println("y =" +y);
        int MotRandom =(int)Math.floor(Math.random()*Tabmot.length);
        System.out.println(MotRandom);
        // String motChache =(Math.random()*Tabmot ;
        //System.out.println(motChache);
        System.out.println("Le mot à trouver :"+MotRandom);

        System.out.println("il vous reste");
        Scanner scan = new Scanner(System.in);
        System.out.println("veuillez entrer une lettre ");
        String lettreUser=scan.next();
        System.out.println(lettreUser);

    }
}
