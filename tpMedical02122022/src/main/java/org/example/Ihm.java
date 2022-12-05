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
                case "1":
                    AjouterPatient();
                    break;
                case "6":
                AfficherdossierPatient();
            }
        } while (!choice.equals("0"));
    }


    /////////////////MENU/////////////////////////////

    public void menu(){
        System.out.println("----------MENU-----------");
        System.out.println("0 -- QUITTER LE PROGRAMME");
        System.out.println("1-- Ajouter un ptient ");
        System.out.println("6--Afficher  dossier medical du patient");
        System.out.println("7--recherher une consultation par date et patient");
    }

    private  void AjouterPatient(){
        System.out.println("ceci est un test");
    }
    private void  AfficherdossierPatient(){
        System.out.println("veuillez saisir votre numero de dossier");
    }


}
