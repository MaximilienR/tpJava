package org.example;

import java.util.Scanner;

public class word {
    public static  void getPrint(){
        Scanner scan = new Scanner(System.in);
        System.out.println("veuillez saisir un mot");
        String mot =scan.next();
        System.out.println(mot);
        System.out.println("veuillez saisir une letre");
        String lettre = scan.next();

        int stock = mot.length();
        int count[]= new  int[0];
        for (int i = 0; i < stock; i++)
            count[mot.charAt(i)]++;




        System.out.println("la lettre " + lettre +" " + "apparait" + count+ "fois" );


    }
}
