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
        String note = scan.next();
            System.out.println(i);
            for(i = 0; i < note.length; i++){
                if(note[i] < minVal)
                    minVal = note[i];
                if(note[i] > maxVal)
                    maxVal = note[i];
            }
    }
}}