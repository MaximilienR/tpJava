package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min ;
        int max  ;

        Scanner scan = new Scanner(System.in);
        System.out.println("veuillez entre les 3 note");
        int i;
        for (i=0; i<3; i++){
        Integer note = scan.nextInt();
            System.out.println(i);
            for(i = 0; i < note.; i++){
                if(note[i] < min)
                    min = note[i];
                if(note[i] > max)
                    max = note[i];
            }
    }
}}