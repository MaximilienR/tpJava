package org.example;

public class Student extends Person {
    public static void GoToClasses(){

        System.out.println("I'm going to class ");
    }
    public static void  DisplayAge(){
        System.out.println("My age is"+Person.SetAge(););
    }
}
