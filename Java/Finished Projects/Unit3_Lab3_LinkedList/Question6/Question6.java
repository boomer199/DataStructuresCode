package Question6;

import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        //1. Create a LinkedList that stores Peter, Paul and Mary.
        LinkedList<String> names = new LinkedList<>(Arrays.asList("Peter", "Paul", "Mary"));

        System.out.println("Original List: " + names);

        //2. Call the method named removeSecond for removing and returning the second element of a linked list
        Object removed = Lists.removeSecond(names);

        //3. Print the Element that is removed
        System.out.println("Removed: " + removed);

        //4. Print the Linked List (original and after removal)
        System.out.println("After Removal: " + names);

        //5. Create a new LinkedList that would store A B C D E
        LinkedList<String> letters = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));

        System.out.println("Original List: " + letters);

        //6. Remove the removeSecond from this list
        removed = Lists.removeSecond(letters);

        //7. Print the element that is removed.
        System.out.println("Removed: " + removed);

        //8. Print the LinkedList (original and after removal)
        System.out.println("After Removal: " + letters);

        //5. Create a new LinkedList that would store "Java"
        LinkedList<String> words = new LinkedList<>(Arrays.asList("Java"));

        System.out.println("Original List: " + words);

        //6. Remove the removeSecond from this list
        removed = Lists.removeSecond(words);

        //7. Print the element that is removed.
        System.out.println("Removed: " + removed);

        //8. Print the LinkedList (original and after removal)
        System.out.println("Linked List: " + words);
    }
}
