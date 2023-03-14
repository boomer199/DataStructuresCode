package com.company;

public class DoublyLinkedList {
    private Book head;
    private Book tail;

    public void addBook(String title, String author, String ISBN, double price, int quantity) {
        Book book = new Book(title, author, ISBN, price, quantity);
        if (head == null) {
            head = book;
            tail = book;
        } else {
            tail.next = book;
            book.previous = tail;
            tail = book;
        }
    }

    public void removeBook(String ISBN) {
        Book book = searchBook(ISBN);
        if (book != null) {
            if (book.previous == null) {
                head = book.next;
            } else {
                book.previous.next = book.next;
            }
            if (book.next == null) {
                tail = book.previous;
            } else {
                book.next.previous = book.previous;
            }
        }
    }

    public void updatePrice(String ISBN, double price) {
        Book book = searchBook(ISBN);
        if (book != null) {
            book.price = price;
        }
    }

    public void updateQuantity(String ISBN, int quantity) {
        Book book = searchBook(ISBN);
        if (book != null) {
            book.quantity = quantity;
        }
    }

    public Book searchBook(String ISBN) {
        Book current = head;
        while (current != null) {
            if (current.ISBN.equals(ISBN)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void displayInventory() {
        Book current = head;
        while (current != null) {
            System.out.println("Title: " + current.title);
            System.out.println("Author: " + current.author);
            System.out.println("ISBN: " + current.ISBN);
            System.out.println("Price: " + current.price);
            System.out.println("Quantity: " + current.quantity);
            System.out.println();
            current = current.next;
        }
    }

    public void displayInventoryReverse() {
        Book current = tail;
        while (current != null) {
            System.out.println("Title: " + current.title);
            System.out.println("Author: " + current.author);
            System.out.println("ISBN: " + current.ISBN);
            System.out.println("Price: " + current.price);
            System.out.println("Quantity: " + current.quantity);
            System.out.println();
            current = current.previous;
        }
    }
}