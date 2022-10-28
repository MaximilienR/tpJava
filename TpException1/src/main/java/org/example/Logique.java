package org.example;

import java.util.Scanner;

    public class Logique {
    public static void getPrint() {
        int total;

        Integer a = null;
        Integer b = null;
        Integer c = null;
        try {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("veuillez saisir un  nombre");
                a = scanner.nextInt();
                System.out.println(a);

                System.out.println("veuillez saisir un  second nombre");
                b = scanner.nextInt();
                System.out.println(b);
                c = a + b;
            } catch (NumberFormatException e) {
            System.out.println("ceci n'est pas un nombre entier");
            }
            try {
                int number =a+b;

                }catch (Exception e){
                System.out.println("je ne peux pas convertir ce caractère veuillez saisir un chiffre");
            }
        //nombre negatif
            try {
                //
            }catch (Exception e){
                System.out.println("je ne veux que des nombre positif");
            }
        }
        finally {
            System.out.println(a+b);
            System.out.println("fin programe");

        }


    }
}
