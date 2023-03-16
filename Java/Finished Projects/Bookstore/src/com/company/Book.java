package com.company;

public class Book {
    // Title of book
    public String title;
    // author of book
    public String author;
    // ISBN of book
    public String ISBN;
    // price of book
    public double price;
    // number of books
    public int quantity;
    // prev book in linkedlist
    public Book previous;
    // next book in linkedlist
    public Book next;

    /**
     * Makes a new book node
     * @param title of book
     * @param author of book
     * @param ISBN of book
     * @param price of book
     * @param quantity of books
     */ 
    public Book(String title, String author, String ISBN, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
        this.quantity = quantity;
    }
}

