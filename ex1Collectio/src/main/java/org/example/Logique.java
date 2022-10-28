package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Logique {
    public static void main() {
        //ordre naturel : methode 1
        ArrayList<Integer> tab = new ArrayList<>();

        tab.add(2);
        tab.add(9);
        tab.add(7);
        tab.add(1);
        Collections.sort(tab);
        System.out.println(tab);

        //ordre inverse
        ArrayList<Integer> tab2 = new ArrayList<>();

        tab2.add(26);
        tab2.add(16);
        tab2.add(8);
        tab2.add(34);

        ListIterator listIterator=tab2.listIterator();
        System.out.println("je passe par la ");
        Collections.reverse(listIterator);

         while (listIterator.hasPrevious()){
            System.out.println("je passe dans le code");
            System.out.println(listIterator.previous());
        }


      /*  ListIterator list=tab.listIterator();
        while (list.hasNext()){
            System.out.println(list.previous());
        }
        while(list.hasPrevious()){
            System.out.println(list.next());
        }
    }

    /*List<Integer>liste3=new ArrayList<>(Arrays.asList(2,9,0,67,45,32,1));

        Collections.sort(liste3);

        for (Integer i:liste3){
            System.out.println(i);
        }*/


    }
};