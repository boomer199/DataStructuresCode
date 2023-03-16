package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new DoublyLinkedList object
        DoublyLinkedList inventory = new DoublyLinkedList();
        // Add some books to the inventory
        inventory.addBook("The Great Gatsby", "F. Scott Fitzgerald", "9780141182636", 9.99, 10);
        inventory.addBook("To Kill a Mockingbird", "Harper Lee", "9780446310789", 8.99, 15);
        inventory.addBook("1984", "George Orwell", "9780451524935", 7.99, 12);
        
        // Display the inventory
        System.out.println("Inventory in forward order:");
        inventory.displayInventory();
        System.out.println("");

        // Display the inventory in reverse order
        System.out.println("Inventory in reverse order:");
        inventory.displayInventoryReverse();
        System.out.println("");

        // Search for a book by ISBN
        System.out.println("");

        System.out.println("Search for book with ISBN 9780141182636:");
        Book book = inventory.searchBook("9780141182636");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
        System.out.println("");

        // Update the price of a book
        System.out.println("");

        System.out.println("Update the price of 1984 to 8.49:");
        inventory.updatePrice("9780451524935", 8.49);
        book = inventory.searchBook("9780451524935");
        System.out.println(book);
        
        System.out.println("");

        // Update the quantity of a book
        System.out.println("");

        System.out.println("Update the quantity of To Kill a Mockingbird to 20:");
        inventory.updateQuantity("9780446310789", 20);
        book = inventory.searchBook("9780446310789");
        System.out.println(book);
        System.out.println("");

        
        // Remove a book from the inventory
        System.out.println("");

        System.out.println("Remove The Great Gatsby from the inventory:");
        System.out.println("");
        inventory.removeBook("9780141182636");
        inventory.displayInventory();
        

    }
}
