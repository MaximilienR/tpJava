package org.example;

import java.util.Scanner;

public class Pyramide {
    public static void getPrint(){

            int random = 4;
            for (int i = 0; i < random; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i = random-1; i >=1; --i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print("* ");
                }
                System.out.println();
            }

    }
}
