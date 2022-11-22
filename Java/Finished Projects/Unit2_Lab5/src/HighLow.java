/**
   HighLow class
*/
import java.util.*;

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

   public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
      ArrayList<T> newList = new ArrayList<T>();
  
        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }

        int j = list.size() - newList.size();
        for(int k = 0; k < j; k++){
           list.remove(k);
        }
        for (int i = 0; i < newList.size(); i++){
           list.set(i, newList.get(i));
        }
        // return the new list
        return list;
   }




   public static <T> void shuffle(ArrayList<T> list){
      System.out.println("");
      System.out.println("Before shuffling Arraylist:");
      Iterator itr = list.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println("");
  
        Random r1 = new Random();
  
        for (int i = list.size() - 1; i >= 1; i--) {
            // swapping current index value
            // with random index value
            Collections.swap(list, i, r1.nextInt(i + 1));
        }

        System.out.println("");
        System.out.println("After shuffling Arraylist:");
  
        itr = list.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
   }


   public <T extends Comparable<T>> void sort(ArrayList<T> list) {
      int count = list.size();
      T temp;
      for (int i = 0; i < count; i++) {
        for (int j = i + 1; j < count; j++) {
          if (list.get(i).compareTo(list.get(j)) > 0) {
            temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
          }
        }
      }
   }


   public static <T extends Comparable<T>> int binarySearch(T[] list, int l, int r, T key) {
      if (r>=l) {
            Arrays.sort(list);

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

   public ArrayList<T> getArray(){
      return array;
   }

   public void arraylistToString(){
      for(int i = 0; i < array.size(); i++){
         System.out.print(array.get(i) + ", ");
      }
   }

}
