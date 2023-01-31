package Question7;

import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        // 1. Create a LinkedList that stores Peter, Paul, and Mary.
        LinkedList<String> names = new LinkedList<>(Arrays.asList("Peter", "Paul", "Mary"));
        // 2. Call the method named removeLast for removing and returning the last element of the linked list.
        String removed = removeLast(names);
        // 3. Print the element that is removed.
        System.out.println("Removed element: " + removed);
        // 4. Print the Linked List (original and after removal).
        System.out.println("Linked List after removal: " + names);
        
        // 5. Create a new LinkedList that stores A, B, C, D, E.
        LinkedList<String> letters = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        // 6. Remove the last element from this list.
        removed = removeLast(letters);
        // 7. Print the element that is removed.
        System.out.println("Removed element: " + removed);
        // 8. Print the Linked List (original and after removal).
        System.out.println("Linked List after removal: " + letters);
        
        // 9. Create a new LinkedList that stores "Java".
        LinkedList<String> words = new LinkedList<>(Arrays.asList("Java"));
        // 10. Remove the last element from this list.
        removed = removeLast(words);
        // 11. Print the element that is removed.
        System.out.println("Removed element: " + removed);
        // 12. Print the Linked List (original and after removal).
        System.out.println("Linked List after removal: " + words);
    }

    public static String removeLast(LinkedList<String> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            String last = list.getLast();
            list.removeLast();
            return last;
        }
    }
}
