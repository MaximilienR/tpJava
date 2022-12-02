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
            switch (choice){
                case "6":
                AfficherdossierPatient();
            }
        } while (!choice.equals("0"));
    }


    /////////////////MENU/////////////////////////////

    public void menu(){
        System.out.println("----------MENU-----------");
        System.out.println("0 -- QUITTER LE PROGRAMME");
        System.out.println("6--Afficher  dossier medical du patient");
    }

    private void  AfficherdossierPatient(){
        System.out.println("veuillez saisir votre numero de dossier");
    }

}
