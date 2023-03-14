package com.company;

public class Main {
    public static void main(String[] args) {
        // Create a new DoublyLinkedList object
        DoublyLinkedList list = new DoublyLinkedList();
    
        // Add nodes to the list
        list.addFirst("Apple");
        list.addLast("Banana");
        list.addLast("Cherry");
        list.addFirst("Date");
    
        // Display the contents of the list in forward order
        System.out.println("Contents of the list in forward order:");
        list.displayForward();
    
        // Display the contents of the list in reverse order
        System.out.println("\nContents of the list in reverse order:");
        list.displayBackward();
    
        // Remove nodes from the list
        list.removeFirst();
        list.removeLast();
        list.delete("Banana");
    
        // Display the contents of the list in forward order
        System.out.println("\nContents of the list in forward order after using the removeFirst, removeLast, and remove methods:");
        list.displayForward();
    
        // Insert a new node after the first node with the key "Apple"
        list.insertAfter("Apple", "Elderberry");
    
        // Display the contents of the list in forward order
        System.out.println("\nContents of the list in forward order after using insertAfter(Elderberry):");
        list.displayForward();
    
        // Display the string representation of the list
        System.out.println("\nString representation of the list:");
        System.out.println(list.toString());
    }
    
}
