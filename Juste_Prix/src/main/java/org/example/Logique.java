package org.example;

import java.util.Scanner;

public class Logique {
    public static void getPrint(){
        int NbrRandom = (int) (Math.random() * 100);
        System.out.println(NbrRandom);

        Scanner scan = new Scanner(System.in);
        System.out.println("veuillez entrer un nombre");
        int NbrUser =scan.nextInt();
        System.out.println(NbrUser);

        if (NbrUser==NbrRandom){
            System.out.println("bravo vous avez trouvé le juste prix");
        }else while (NbrUser!=NbrRandom){
            if (NbrUser<NbrRandom){
                System.out.println("veuillez entrer un nombre plus grand");
                int Nbr =scan.nextInt();
                break;
            }else if (NbrUser>NbrRandom){
                System.out.println("veuillez entrer un nombre plus petit");
                int Nbr =scan.nextInt();
                break;

            }
        }
    }
}
       /* while (NbrUser!=NbrRandom)
        { if (NbrUser<NbrRandom){
            System.out.println("veuillez entrer un nombre plus grand");

            while (NbrUser<NbrRandom){
             //   int NbrUser =scan.nextInt();
            }break;
        }else if (NbrUser>NbrRandom){
            System.out.println("veuillez entre un nombre pls petit");
            break;
        }else System.out.println(
                "bravo vous avez trouver le juste prix "
        );
        }

        }

}*/
