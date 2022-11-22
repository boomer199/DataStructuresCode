import java.util.Arrays;

/**
   This program demonstrates the HighLow class.
*/

public class HighLowTest
{
   public static void main(String[] args) throws Exception {
      // Create an array of Integer values.
      Integer[] numbers = { new Integer(44),
                            new Integer(77),
                            new Integer(11),
                            new Integer(99),
                            new Integer(55),
                            new Integer(22)
                          };
      
      // Create a HighLow object.
      HighLow<Integer> highLow = new HighLow<>(numbers);
      
      // Display the highest value in the array.
      System.out.println("");
      System.out.println("");
      System.out.println("The highest value is " + highLow.getHighest());
      System.out.println("");
      System.out.println("");


      // Display the lowest value in the array.
      System.out.println("");
      System.out.println("");
      System.out.println("The lowest value is " + highLow.getLowest());
      System.out.println("");
      System.out.println("");



      //Declaring variables for binary search
      int r = numbers.length;
      int y = 99;
      if(highLow.binarySearch(numbers, 0, r - 1, y) != -1){
         System.out.println("");
         System.out.println("");
         System.out.println(y + " is in the array at index " + highLow.binarySearch(numbers, 0, r - 1, 99));
         System.out.println("");
         System.out.println("");
      } else {
         System.out.println(y + " is not in the array.");
      }
   }


}