/**
   HighLow class
*/
import java.util.ArrayList;

public class HighLow<T extends Comparable<T>>{
   private ArrayList<T> array = new ArrayList<T>();
   
   /**
      Constructor
      @param values An array of values.
      @throws IllegalArgumentException if values is null or
              contains no elements.
   */
   public HighLow(T[] values) throws Exception{
      if (values == null || values.length == 0){
         throw new Exception("IllegalArgumentException");
      } 
      for (int i = 0; i < values.length; i++){
         array.add(values[i]);
      }
   }
   /**
      getHighest method
      @return The highest value in the array.
   */
   public T getHighest(){
      T maxValue = array.get(0);
      for(int i = 0; i < array.size(); i++){
         if(array.get(i).compareTo(maxValue) == 1){
            maxValue = array.get(i);
         }
      }
      return maxValue;
   }

   /**
      getLowest method
      @return The lowest value in the array.
   */
   public T getLowest(){
      T minValue = array.get(0);
      for(int i = 0; i < array.size(); i++){
         if(array.get(i).compareTo(minValue) == -1){
            minValue = array.get(i);
         }
      }
      return minValue;
   }
}
