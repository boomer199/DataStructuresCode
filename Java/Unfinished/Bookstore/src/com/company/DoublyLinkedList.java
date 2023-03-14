package com.company;

public class DoublyLinkedList {
    // head of linkedlist
    private Book head;
    // tail of linkedlist
    private Book tail;

    /**
     * Adds a book to doubly linked list
     * @param title of book 
     * @param author of book
     * @param ISBN of book
     * @param price of book
     * @param quantity of bools
     */
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

    /**
     * removes book from linked list given isbn 
     * @param ISBN of book
     */
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

    /**
     * Updates price of book given ISBN
     * @param ISBN of book changed
     * @param price new price of book
     */
    public void updatePrice(String ISBN, double price) {
        Book book = searchBook(ISBN);
        if (book != null) {
            book.price = price;
        }
    }

    /**
     * Updates quantity of books given isbn
     * @param ISBN of book
     * @param quantity new quantity of book
     */
    public void updateQuantity(String ISBN, int quantity) {
        Book book = searchBook(ISBN);
        if (book != null) {
            book.quantity = quantity;
        }
    }

    /**
     * Searches for a book in the linked list given isbn
     * @param ISBN of book
     * @return null if the book isnt found
     * @return the book if it is found
     */
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

    /**
     * Displays all books in the linkedlists 
     */
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

    /**
     * Displays all books in inventory in reverse
     */
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