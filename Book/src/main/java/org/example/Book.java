package org.example;

public class Book {
    private int id;
    private  String title;


    private int publishingAnnee;
    int amountOfPages ;
    double priceBook   ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishingAnnee() {
        return publishingAnnee;
    }

    public void setPublishingAnnee(int publishingAnnee) {
        this.publishingAnnee = publishingAnnee;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public double getPriceBook() {
        return priceBook;
    }

    public void setPriceBook(double priceBook) {
        this.priceBook = priceBook;
    }

    public Book(int id, String title, int publishingAnneee, int amountOfPages, double priceBook){
        this.id = id;
        this.title=title;
        this.publishingAnnee=publishingAnneee;
        this.amountOfPages=amountOfPages;
        this.priceBook=priceBook;

    }

    public Book(){
        //vide
    }


}
