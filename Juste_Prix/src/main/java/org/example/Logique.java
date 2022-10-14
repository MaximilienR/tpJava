package org.example;

import java.util.Scanner;

public class Logique {
    public static void getPrint(){
        //je crée un nombre aléatoire
        int NbrRandom = (int) (Math.random() * 100);
        System.out.println(NbrRandom);
        //je demande un nombre à l'utilisateur
        Scanner scan = new Scanner(System.in);
        System.out.println("veuillez entrer un nombre");
        int NbrUser =scan.nextInt();
        //System.out.println(NbrUser);
        //je traitre les différents cas possibile

        //si nombre juste fin programe
        if (NbrUser==NbrRandom){
            System.out.println("bravo vous avez trouvé le juste prix");
        //tant que nombre différent je fais une des deux solution suivante
        }else while (NbrUser!=NbrRandom){
            //je demande à l'utilisateur un nombre plus grand
            if (NbrUser<NbrRandom){
                System.out.println("veuillez entrer un nombre plus grand");
                int Nbr =scan.nextInt();
                //NbrUser==Nbr;

                //break;
                //je demande un nombre plus petit
            }else if (NbrUser>NbrRandom){
                System.out.println("veuillez entrer un nombre plus petit");
                int Nbr =scan.nextInt();

            }
        }
    }
}
       //pb : il prends en compte le nouveau chiffre ??
