package Question8;

import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        // Create three LinkedLists
        List<String> words1 = new LinkedList<>(Arrays.asList("He", "was", "ever", "dusting", "his", "old","lexicons", "and", "grammars"));
        List<String> words2 = new LinkedList<>(Arrays.asList("dos", "tres", "cuatro", "uno"));
        List<String> words3 = new LinkedList<>(Arrays.asList("any", "one"));

        // Print original LinkedLists
        System.out.println("Original List 1: " + words1);
        System.out.println("Original List 2: " + words2);
        System.out.println("Original List 3: " + words3);

        // Call the removeStringsWithLengthLessThanFour method
        Lists.removeStringsWithLengthLessThanFour(words1);
        Lists.removeStringsWithLengthLessThanFour(words2);
        Lists.removeStringsWithLengthLessThanFour(words3);

        // Print LinkedLists after removing strings with length less than four
        System.out.println("\nList 1 after removing strings with length less than four: " + words1);
        System.out.println("List 2 after removing strings with length less than four: " + words2);
        System.out.println("List 3 after removing strings with length less than four: " + words3);
    }
}
