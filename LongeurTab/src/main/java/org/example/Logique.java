package org.example;

import java.util.Scanner;

public class Logique {
public static void getPrint(){
    Scanner scan = new Scanner(System.in);
    System.out.println("veuillez entrer  la longueur du tableau souhaité ");
    String size = scan.next();
    System.out.println(size);

    int i;
    for(i=0; i<size.length(); i++){
         System.out.println(size.length());
     }

   /* for (int i=0; i<5;i++) {
        System.out.println("Clap your hands!");
    }*/
    int a = (int) (Math.random() * 100);
    System.out.println(a);

}
}
