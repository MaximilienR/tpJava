package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void getPrint(){
        Scanner scan = new Scanner(System.in);
        System.out.println("veuillez saisir un mot");
        String mot =scan.next();
        System.out.println(mot);
        System.out.println("veuillez saisir un second mot");
        String mot2 =scan.next();
        System.out.println(mot2);
        String reversedmot = "";

        for (int i = 0; i < mot.length(); i++) {
            reversedmot = mot  ;
        }
        if (mot==reversedmot)
            System.out.println("ceci est un truc ");
        else
            System.out.println("ceci n est pas un truc");;

    }
}
