package org.example;

import java.util.Scanner;

public class Compteur {
    public  static void getSaisie(){
        Scanner scan = new Scanner(System.in);
        System.out.println("veuillez saisir une phrase");
        String phrase =scan.nextLine();
        System.out.println(phrase);
        String[] total= phrase.split("\\s+");
        System.out.println("votre phrase contient"+ " "+ total.length+ " "+ " " +"mot" );



    }
}
