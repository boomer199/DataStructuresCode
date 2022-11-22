/**
   HighLow class
*/
import java.util.ArrayList;
import java.util.Arrays;

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
         if(array.get(i).compareTo(maxValue)== 1){
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
         if(array.get(i).compareTo(minValue)== -1){
            minValue = array.get(i);
         }
      }
      return minValue;
   }


   public static <T extends Comparable<T>> int binarySearch(T[] list, int l, int r, T key){
      if (r>=l) {
            Arrays.sort(list); //TODO: WHEN SORT METHOD IS MADE THEN CHANGE WITH SORT!!!!

            int mid = l + (r - l)/2;
         
            // If the element is present at the
            // middle itself
            if (list[mid].compareTo(key) == 0){
               return mid;
            }
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (list[mid].compareTo(key) == 1){
               return binarySearch(list, l, mid-1, key);
            }
            // Else the element can only be present
            // in right subarray
            return binarySearch(list, mid+1, r, key);
        }
  
        // We reach here when element is not present
        //  in array
      return -1;
   }



}
