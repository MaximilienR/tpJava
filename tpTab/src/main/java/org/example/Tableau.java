package org.example;

public class Tableau {
    public static void getArray() {
        int maxVal = Integer.MAX_VALUE;
        int minVal = Integer.MIN_VALUE;

        int [] note={10,10,10,10,10,0,0,0,0,0};
        System.out.println(note[1]);
        for (int init =0 ;init<note.length;init++){
            System.out.println(note[init]);
        }
        int somme = 0;
        for(int i = 0; i < note.length; i++){
            somme += note[i];
        }
        float moyenne = (float) somme / note.length;

        for(int i = 0; i < note.length; i++){
            if(note[i] < maxVal)
                maxVal = note[i];
            if(note[i] > minVal)
                minVal = note[i];
        }

        System.out.println("la moyen est de "+moyenne);
        System.out.println("le plus petit est de " + maxVal);

}};