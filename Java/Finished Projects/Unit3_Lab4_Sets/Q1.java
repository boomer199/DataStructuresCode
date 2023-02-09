import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        // Step 1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        // Step 2
        System.out.println("Original List: " + numbers);
        
        // Step 3
        boolean addResult = numbers.add(4);
        System.out.println("Add 4: " + addResult);
        
        // Step 4
        Collection<Integer> moreNumbers = new ArrayList<>();
        
        // Step 5
        moreNumbers.add(5);
        moreNumbers.add(6);
        
        // Step 6
        boolean addAllResult = numbers.addAll(moreNumbers);
        System.out.println("Add all elements from moreNumbers: " + addAllResult);
        System.out.println("After adding all elements from moreNumbers: " + numbers);
        

        // Step 7
        System.out.println("All Numbers: " + numbers);
        
        // Step 8
        numbers.clear();
        
        //Step 9
        System.out.println("After clearing the list: " + numbers);
        
        // Step 10
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        // Step 11
        System.out.println("Contains 2: " + numbers.contains(2));
        System.out.println("Contains 4: " + numbers.contains(4));
        
        // Step 12
        Collection<Integer> checkNumbers = new ArrayList<>();
        checkNumbers.add(2);
        checkNumbers.add(3);
        
        // Step 13
        System.out.println("Contains all elements from checkNumbers: " + numbers.containsAll(checkNumbers));
        
        // Step 14
        List<Integer> numbersCopy = new ArrayList<>(numbers);
        System.out.println("numbers.equals(numbersCopy): " + numbers.equals(numbersCopy));
        System.out.println("numbers hash code: " + numbers.hashCode());
        System.out.println("numbersCopy hash code: " + numbersCopy.hashCode());
        
        // Step 15
        System.out.println("Is numbers list empty: " + numbers.isEmpty());
        
        // Step 16
        boolean removeResult = numbers.remove(new Integer(2));
        System.out.println("Remove 2: " + removeResult);
        System.out.println("After removing 2: " + numbers);
        
        // Step 17
        List<Integer> removeNumbers = new ArrayList<>();
        removeNumbers.add(1);
        removeNumbers.add(2);
        removeNumbers.add(3);
        

        // Step 18: Remove all the numbers mentioned in removeNumbers from "numbers". Print numbers.
        numbers.removeAll(removeNumbers);
        System.out.println("After removing all elements from removeNumbers: " + numbers);
    }
}

