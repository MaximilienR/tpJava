package org.example.domain;
import java.io.Serializable;

public class Car implements  Serializable{

    private int idCar;

    private  String name;

    private int year;

    private int chevaux;

    private  double price;

    public Car(String name, int price, int puissance) {
    }

    public Car(int idCar, String name) {
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getChevaux() {
        return chevaux;
    }

    public void setChevaux(int chevaux) {
        this.chevaux = chevaux;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(int idCar, String name, int year, int chevaux, double price) {
        this.idCar = idCar;
        this.name = name;
        this.year = year;
        this.chevaux = chevaux;
        this.price = price;
    }

    public Car(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar=" + idCar +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", chevaux=" + chevaux +
                ", price=" + price +
                '}';
    }
}
