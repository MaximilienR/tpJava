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
                case "2":
                    CreerConsultation();
                case "6":
                AfficherdossierPatient();
                break;
                case  "7":
                    RechercherConsultation();
                    break;
            }
        } while (!choice.equals("0"));
    }


    /////////////////MENU/////////////////////////////

    public void menu(){
        System.out.println("----------MENU-----------");
        System.out.println("0 -- QUITTER LE PROGRAMME");
        System.out.println("1-- Ajouter un patient ");
        System.out.println("2-- Crééer une consultation ");
        System.out.println("3--Afficher  dossier medical du patient");
        System.out.println("4--recherher une consultation par date et patient");
    }

    private  void AjouterPatient(){

        System.out.println("veuillez saisir le nom du patient");
        String nomPatient =scanner.nextLine();
        //System.out.println("le nom du patient est "+ " "+nomPatient);
        System.out.println("veuillez saisir le prenom du patient");
        String prenomPatient = scanner.nextLine();
        //System.out.println("le prenom du patient est " + " " +prenomPatient);
        System.out.println("veuillez saisir l'adresse du patient");
        String addressePatient=scanner.nextLine();
        //System.out.println("l'addresse du patient est "+ " "+addressePatient);
        System.out.println("veuillez saisir votre numero de telephone portable");
        int numTel = scanner.nextInt();
        //System.out.println("votre num est donc" + " " +"0"+numTel);
        System.out.println("veuillez saisir m si vous êtes un homme ou f si vous êtes une femme");
        char sexe = scanner.next().charAt(0);
        // System.out.println("vous etes donc de sexe  "+" "+ sexe);
      //  System.out.println("donc si j'ai bien compris vous vous applez "+" "+nomPatient+" "+prenomPatient+" "+" vous êtes de sexe"+ " " + sexe+ "vous habitez à l'addresse :"+ " "+addressePatient+ " " + "votre numero de telephone est le "+ " "+ "0"+ numTel);
        System.out.println("donc si j'ai bien compris vous vous applez :"+" "+nomPatient+" "+prenomPatient);
        System.out.println("vous êtes de sexe :  "+sexe);
        System.out.println("vous habitez à l'addresse :"+addressePatient);
        System.out.println("enfin votre numero de telephone est le : "+ " "+"0"+numTel);
    }
    /*prenom,nom,date,sexe,addresse,numTel*/
    private void  AfficherdossierPatient(){
        System.out.println("veuillez saisir votre numero de dossier");
        int numDossier =scanner.nextInt();
        System.out.println("vous avez entré le num "+ numDossier);
    };

    private void RechercherConsultation(){
        System.out.println("jusque la tout va bien ");
    }

    private void CreerConsultation(){
        System.out.println("1:Creer une fiche de consultation");
        System.out.println("2:Ajouter une prescription");
        System.out.println("3:Ajouter une operation Analyse");
        System.out.println("4: Créer une fiche de paiement");
    }

   /*
    Test choix du sexe
   private  void test(){
        System.out.println("etes vous : ");

        System.out.println("A : un homme ");
        System.out.println("B : une femme ");
        String sexe =scanner.nextLine();
        System.out.println("vous êtes donc "+sexe );
    }*/


}
