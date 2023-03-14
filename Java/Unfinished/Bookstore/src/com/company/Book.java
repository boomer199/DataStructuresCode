package com.company;

public class Book {
    public String title;
    public String author;
    public String ISBN;
    public double price;
    public int quantity;
    public Book previous;
    public Book next;

    public Book(String title, String author, String ISBN, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.quantity = quantity;
    }
}

