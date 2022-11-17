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
      System.out.println("The highest value is " +
                          highLow.getHighest());

      // Display the lowest value in the array.
      System.out.println("The lowest value is " +
                          highLow.getLowest());
                          
   }
}