package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Request {
public  static  void  getPrint(){
    Scanner scan = new Scanner(System.in);
    System.out.println("veuillez entrer  mot ");
    String mot = scan.next();
    System.out.println(mot);
    System.out.println("veuillez saisir un second mot");
    String mot2 = scan.next();
    System.out.println(mot2);
    Arrays.sort(mot);
    Arrays.sort(mot2);
    if (mot.length()==mot2.length())System.out.println("ce mot est un anagramme");
   else System.out.println("ceci n'est pas un anagramme");


}
}
