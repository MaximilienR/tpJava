package org.example.domain;

import org.example.dao.CarsDao;
import org.example.dao.DAOCars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    //menu
    public  static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enregistrer la voiture ");
        System.out.println("2. Lister touts les voitures");
        System.out.println("3. Supprimer la voiture");
        System.out.println("4. Changer de voiture");
        System.out.println("5. Inscrire une personne ");
        System.out.println("6. Lister toutes les personnes");
        System.out.println("7. Supprimer la perssone");
        System.out.println("8. Changer de persibbe");
        System.out.println("9. Faire la vente ");
        System.out.println("10 Afficher les ventes de voiture");
        System.out.println("11. Afficher la liste des ventes d'un véhicule pour une personne ");
        System.out.println("12. Quitter");
    }

    //creer un produit
    public  static void add_car(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("veuillez saisir le nom de votre voiture");
            String name = scanner.nextLine();
            name +=scanner.nextLine();
            System.out.println("veuillez saisir l'anne  de votre voiture");
            int price = scanner.nextInt();
            System.out.println("veuillez saisir la puissance de votre voiture");
            int puissance = scanner.nextInt();
            System.out.println("veuillez saisir le prix de votre voiture ");
            CarsDao carsDao = new CarsDao(name,price,puissance);
            Integer cars = cars.add(cars);
             if(cars>0){
                 System.out.println("la voiture a bien était ajouter ");
             }else{
                 System.out.println("une erreur c'est produite");
                 add_car();
             }
        }catch (InputMismatchException e){
            System.out.println("une erreur c'est produite ");
        }
    }
    //delete

    public  static  void delete_car(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("veuillez saisir l'id du produit que vous souhaitez supprimer ");
            Integer id = scanner.nextInt();
            DAOCars daoCars= new DAOCars();
            Car car = DAOCars.getCar(id);
            if(car==null){
                System.out.println("aucun resultat trouvé");
                delete_car();
            }else {
                Integer resultat = DAOCars.delete(car);
                if (resultat>0){
                    System.out.println("votre produit a bien était supprimer");
                }else {
                    System.out.println("une erreur est survenu ");
                }
            }

    }catch (InputMismatchException exception){
            System.out.println("ceci n'est pas un nombre");
            delete_car();
        }
    }

    public static void main(){
        Integer menu=0;

        do{
            Scanner scanner = new Scanner(System.in);
            menu();
            try {
                menu=scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("ceci n'est pas un nombre");
                main();
            }

            switch (menu) {
                case 1:
                    System.out.println("vous allez être rediriger vers la page enregistrement ");
                    break;
                case 2:
                    System.out.println("vous allez être rediriger vers la liste des voitures");
                    break;
                case 3:
                    System.out.println("vous allez être rediriger vers la suppression");
                    break;
                case 4:
                    System.out.println("vous allez être rediriger vers le changement ...");
                    break;
                case 5:
                    System.out.println("vous allez être rediriger vers l'inscription ");
                    break;
                case 6:
                    System.out.println("vous allez être rediriger vers la liste des personnes");
                    break;
                case 7:
                    System.out.println("vous allez être rediriger vers la suppression de personnes ");
                    break;
                case 8:
                    System.out.println("vous allez être rediriger vers la suppression de personne");
                    break;
                case 9:
                    System.out.println("vous allez être rediriger vers la vente ");
                    break;
                case 10:
                    System.out.println("afficher la vente des voitures");
                    break;
                case 11:
                    System.out.println("quitter");
                    break;
            }

        }while (menu !=11);
    }
}
