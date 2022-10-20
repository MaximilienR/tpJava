package org.example;

public class Account {
    private int id ;
    private double  [] transaction;



    public void Account(int id,double transaction){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void receiveMoney(Account){

    }

    @Override
    public String toString(){
        return
                "id"+id;
    }
}

