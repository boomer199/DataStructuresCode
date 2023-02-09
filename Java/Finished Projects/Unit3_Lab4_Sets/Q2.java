import java.util.*;

public class Q2 {
    public static void main(String[] args) {
                // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("London");
        hashSet.add("Paris");
        hashSet.add("New York");
        hashSet.add("San Francisco");
        hashSet.add("Beijing");

        System.out.println("HashSet:");
        for (String city : hashSet) {
            System.out.println(city);
        }

        // Create a LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("London");
        linkedHashSet.add("Paris");
        linkedHashSet.add("New York");
        linkedHashSet.add("San Francisco");
        linkedHashSet.add("Beijing");

        System.out.println("\nLinkedHashSet:");
        for (String city : linkedHashSet) {
            System.out.println(city);
        }

        // Create a TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("London");
        treeSet.add("Paris");
        treeSet.add("New York");
        treeSet.add("San Francisco");
        treeSet.add("Beijing");

        System.out.println("\nTreeSet:");
        for (String city : treeSet) {
            System.out.println(city);
        }

        //Note that in a HashSet, the order of elements is not guaranteed to be the same as they were inserted. 
        //In a LinkedHashSet, the elements are stored in the order they were 
        //inserted, and in a TreeSet, the elements are stored in sorted order.

    }
}
