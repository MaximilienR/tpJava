package org.example;

public class Technicien extends Employe{
    private  int grade ;
    private int prime =0;

    //mon constructeur
    public Technicien(String nom, int age, double salaire,int grade) {
        super(nom, age, salaire);
        this.grade=grade;

    }

    public int getGrade() {
        return grade;
    }



    public void setGrade(int grade) {
        this.grade = grade;
        if (grade==1){
            prime=prime+100;

        }else if (grade==2){
            prime=prime+200;
        }else if (grade==3){
            prime=prime+300;
        }
    }
    public void calculeSalaire(){

      int total = (int) (this.salaire+prime);
        System.out.println("le salaire est de " +prime);
    };

}
