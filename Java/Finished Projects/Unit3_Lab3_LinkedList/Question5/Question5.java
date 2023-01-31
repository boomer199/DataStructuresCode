package Question5;

import java.util.*;

public class Question5 {
  public static void main(String[] args) {
    LinkedList<String> names = new LinkedList<>();
    names.add("Peter");
    names.add("Paul");
    names.add("Mary");
    
    System.out.println("Removed element: " + Lists.removeFirst(names));
    System.out.println("List after removal: " + names);

    LinkedList<String> letters = new LinkedList<>();
    letters.add("A");
    letters.add("B");
    letters.add("C");
    letters.add("D");
    letters.add("E");
    
    System.out.println("Removed element: " + Lists.removeFirst(letters));
    System.out.println("List after removal: " + letters);
  }
}
