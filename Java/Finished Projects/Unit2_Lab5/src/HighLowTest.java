import java.util.Arrays;

/**
   This program demonstrates the HighLow class.
*/

public class HighLowTest
{
   public static void main(String[] args) throws Exception {
      // Create an array of Integer values.
      Integer[] numbers = { new Integer(44),
                            new Integer(99),
                            new Integer(77),
                            new Integer(11),
                            new Integer(99),
                            new Integer(55),
                            new Integer(11),
                            new Integer(22)
                          };
      // 2d array!!!
      Integer[][] numbers2 = { {new Integer(44),
                                new Integer(100),
                                new Integer(77)},
                               {new Integer(11),
                                new Integer(99),
                                new Integer(55)},
                               {new Integer(55),
                                new Integer(11),
                                new Integer(22)},
                             };


      // Create a HighLow object.
      HighLow<Integer> highLow = new HighLow<>(numbers);

      // Display the highest value in the array.
      System.out.println("");
      System.out.println("The highest value is " + highLow.getHighest());
      System.out.println("");


      // Display the lowest value in the array.
      System.out.println("");
      System.out.println("The lowest value is " + highLow.getLowest());
      System.out.println("");

      System.out.println("");
      System.out.println("The highest value in the 2d array is (numbers2): " + highLow.max(numbers2));
      System.out.println("");


      // Removes Duplicates in the arraylist
      System.out.println("");
      System.out.println("Array before removing duplicates: ");
      highLow.arraylistToString();
      System.out.println("");
      System.out.println("");
      System.out.println("Array after removing duplicates: ");
      highLow.removeDuplicates(highLow.getArray());
      highLow.arraylistToString();
      System.out.println("");

      // DISPLAYS SORTED AND UNSORTED ARRAYLIST
      System.out.println("");
      System.out.println("Unsorted Array: ");
      highLow.arraylistToString();
      highLow.sort(highLow.getArray());
      System.out.println("");
      System.out.println("");
      System.out.println("Sorted Array: ");
      highLow.arraylistToString();
      System.out.println("");

      // Shuffles Arraylist
      highLow.shuffle(highLow.getArray());


      System.out.println("");
      System.out.println("");
      System.out.println("LINEAR SEARCH TO SEE IF A VALUE IS IN THE ARRAY: ");
      int c = 22;
      if(highLow.linearSearch(numbers, 22) != -1){
         System.out.println("");
         System.out.println("");
         System.out.println(c + " is in the array");
         System.out.println("");
      } else {
         System.out.println("");
         System.out.println(c + " is not in the array");
      }

      //Declaring variables for binary search
      int r = numbers.length;
      int y = 22; // NUM TO CHECK IF IN ARRAY OR NOT
      if(highLow.binarySearch(numbers, 0, r - 1, y) != -1){
         System.out.println("");
         System.out.println("");
         System.out.println("BINARY SEARCH TO SEE IF A NUM IS IN THE ARRAY: ");
         System.out.println("");
         System.out.println(y + " is in the array");
         System.out.println("");
      } else {
         System.out.println(y + " is not in the array.");
      }
   }


}