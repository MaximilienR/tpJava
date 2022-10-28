package org.example;

public class Trader {
    public final String name;
    private final String city;

    public Trader(String n,String c){
        this.name=n;
        this.city=c;
    }

    public Trader() {

    }

    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
