package org.example;

import org.example.entities.Produit;
import org.example.services.ProduitService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ihm {
    private ProduitService produitService;
    private Scanner scanner ;

    public Ihm(){
        produitService= new ProduitService();
        scanner = new Scanner(System.in);

    }
    //fonction qui permet de demarer
    public  void  start(){
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    valeurParMarque();
                    break;
                case "2":
                    moyenne();
                    break;
                case "3":
                    produitsMarques();
                    break;
                case "4":
                    deleteParMarque();
                    break;
            }
        }while (!choice.equals("0"));
    }
    private void menu(){
        System.out.println("--------------------MENU-----------------------------");
        System.out.println("0 --Quitter le programme ");
        System.out.println("1 --Afficher la valeur du stock par marque");
        System.out.println("2 --prix moyen des produits");
        System.out.println("3 --produits de plusieurs marque");
        System.out.println("4 --supprimer par marque");

    }

    /////////////////////////////////menu
    private  void valeurParMarque(){
        System.out.println("Merci de saisir la marque : ");
        String marque = scanner.nextLine();
        try {
            System.out.println("la veleur du stock est de : "+ " "+ produitService.valeurStockParMarque(marque)+"€");
        }
        catch (Exception ex){
            System.out.println("la valeur est de 0");
        }
    }
    private  void  moyenne(){

        try {
            System.out.println("la moyen est de : "+ " "+ produitService.moyenne()+"€");
        }
        catch (Exception ex){
            System.out.println("erreur de calcule moyenne");
        }

    }
    private  void produitsMarques(){
        List<String> marques=new ArrayList<>();
        marques.add("samsung");
        marques.add("apple");
        List<Produit> produits=null;
        try {
            produits=produitService.filterByMarques(marques);
            for (Produit pr : produits){
                System.out.println(pr.getId());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    private  void deleteParMarque(){
        System.out.println("merci de saisir la mafrue ");
        String marque = scanner.nextLine();
        try {
            produitService.deleteByMarque(marque);
            System.out.println("suppression ok");
        }catch (Exception ex){
            System.out.println("erreur de suppression ");
        }
    }

    private void menu2(){
        System.out.println("--------------------MENU-----------------------------");
        System.out.println("0 --Quitter le programme ");
        System.out.println("1 --Ajouter une image à une produit");
        System.out.println("2 --Ajouter un commentaire à un produit");
        System.out.println("3 --Afficher les produits supperieur à 4");

    }
    private  void addImage(){
        System.out.println("veuillez selectionner une image  ");
        String UrlImg = scanner.nextLine();
        try {
            System.out.println("");
        }
        catch (Exception ex){
            System.out.println("une erreur est survenu");
        }
    }
    private  void addCommentaire(){
        System.out.println("veuillez saisir votre meesage ");

    }
}
