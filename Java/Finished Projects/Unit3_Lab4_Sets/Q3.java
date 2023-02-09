import java.util.TreeSet;
import java.util.Iterator;

public class Q3 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        // 1. Does the set contain 20?
        System.out.println("Contains 20: " + set.contains(20));

        // 2. Does it contain 50?
        System.out.println("Contains 50: " + set.contains(50));

        // 3. Is the set empty?
        System.out.println("Is the set empty? " + set.isEmpty());

        // 4. Print the original set
        System.out.println("Original set: " + set);

        // 5. Print the set after removing 30
        set.remove(30);
        System.out.println("After removing 30: " + set);

        // 6. Print the size of the set
        System.out.println("Size of the set: " + set.size());

        // 7. Print the first element of the set
        System.out.println("First element of the set: " + set.first());

        // 8. Print the last element of the set
        System.out.println("Last element of the set: " + set.last());

        // 9. Print the elements greater than or equal to first element and less than the last element
        System.out.println("Elements greater than or equal to first element and less than the last element: " + set.subSet(set.first(), set.last()));

        // 10. Print the elements that are less than 30.
        System.out.println("Elements less than 30: " + set.headSet(30));

        // 11. Print the elements that are greater than or equal to 20.
        System.out.println("Elements greater than or equal to 20: " + set.tailSet(20));

        // 12. Clear the set and print the set after that.
        set.clear();
        System.out.println("After clearing the set: " + set);
    }
}
