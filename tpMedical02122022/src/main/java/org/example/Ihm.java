package org.example;

import java.util.Scanner;

public class Ihm {

    private Scanner scanner;

    public  Ihm(){
        scanner = new Scanner(System.in);
    }

    public  void start() {
        String choice;
        do {
            menu();
            choice=scanner.nextLine();
        } while (!choice.equals("0"));
    }


    /////////////////MENU/////////////////////////////

    public void menu(){
        System.out.println("----------MENU-----------");
        System.out.println("0 -- QUITTER LE PROGRAMME");
        System.out.println();
    }
}
