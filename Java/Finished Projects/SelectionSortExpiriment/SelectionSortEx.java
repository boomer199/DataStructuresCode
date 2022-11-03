import java.util.Arrays;

/**
 *
 * @author praga
 */
public class SelectionSortEx {
    final static int SIZE = 100000; // The length of arrays that will be sorted.

    private static String randomString() {
        int length = 5 + (int)(21*Math.random());
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = (char)('A' + (int)(26*Math.random()));
            str.append(ch);
        }
        return str.toString();
    }
    
    /**
     * Creates an array of random real numbers.  The items in the array
     * are random numbers in the range 0.0 to 1.0.
     * @param count The length of the array that is created.
     */
    private static double[] randomNumbers(int count) {
      //Code for randomw double numbers goes here
    double[] rtn = new double[count];
    for(int i = 0; i < count; i++){
        rtn[i] = Math.random();
    }
    return rtn;
    }
    
    /**
     * Creates an array of random strings. The items in the
     * array are created by calling the function randomString();
     * @param count the size of the array that is created
     */
    private static String[] randomStrings(int count) {
     //code for random srtings goes here
    String[] rtn = new String[count];
    for(int i = 0; i < count; i++){
        rtn[i] = randomString();
    }    
    return rtn;
    }
    
    /**
     * Sort an array of real numbers using the selection sort algorithm.
     */
            
    public static void main(String[] args) {
        
        long startTime;
        long endTime;  

        double[] numberList1;  // An array of random numbers.
        double[] numberList2;  // A copy of numberList1.
        
        String[] stringList1;  // An array of random strings.
        String[] stringList2;  // A copy of stringList1.
        
        /* TESTING
        System.out.println("quik: ");
        numberList1 = randomNumbers(10);
        quickSort(numberList1, 0, numberList1.length -1);
        for(double n : numberList1){
            System.out.println("   " + n);
        }
        */

        /* Make sure the selection sort methods are correct.  The outputs
           should be correctly sorted. */
        
        System.out.println("First, test that selection sort works on doubles.");
        System.out.println("The 10 output numbers should be in increasing order.");
        numberList1 = randomNumbers(10);
        selectionSort(numberList1);
        for (double n : numberList1)
            System.out.println( "   " + n );
        System.out.println();
        
        System.out.println("Next, test that selection sort works on strings.");
        System.out.println("The 10 output strings should be in alphabetical order.");
        System.out.println("(Also tests that random strings are made correctly.");
        stringList1 = randomStrings(10);
        selectionSort(stringList1, stringList1.length);
        for (String str : stringList1)
            System.out.println( "   " + str );
        System.out.println();
        
        System.out.println();
        System.out.println("Times for sorting arrays of size " + SIZE + ":");
        System.out.println();
        
        /* Create the arrays. */
        
        numberList1 = randomNumbers(SIZE);
        numberList2 = Arrays.copyOf(numberList1, SIZE);
        stringList1 = randomStrings(SIZE);
        stringList2 = Arrays.copyOf(stringList1, SIZE);
        
        /* Do the sorts and output the times. */
        startTime = System.currentTimeMillis();
        selectionSort(numberList1);
        endTime = System.currentTimeMillis();
        //
        System.out.printf("Milliseconds to sort " + SIZE + " numbers with selectionSort: " + (endTime - startTime));
        System.out.println();
        
        startTime = System.currentTimeMillis();
        Arrays.sort(numberList2);
        endTime = System.currentTimeMillis();
        //
        System.out.printf("Milliseconds to sort " + SIZE + " numbers with Arrays.sort(): " + (endTime - startTime));
        System.out.println();
        
        startTime = System.currentTimeMillis();
        selectionSort(stringList1, stringList1.length);
        endTime = System.currentTimeMillis();
        System.out.printf("Milliseconds to sort " + SIZE + " strings with selectionSort: " + (endTime - startTime));
        System.out.println();
        
        startTime = System.currentTimeMillis();
        Arrays.sort(stringList2);
        endTime = System.currentTimeMillis();
        System.out.printf("Milliseconds to sort " + SIZE + " strings with Arrays.sort(): " + (endTime - startTime) );
        System.out.println();
        System.out.println();
        
        
    }

    

    /**
     * 
     * 
     * 
     * 
     * 
     *  SORTS
     * 
     * 
     * 
     * 
     * 
     */


    /**
     * Sorts array using selectionSort
    * @param numbers array of doubles
    */
    private static void selectionSort(double[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) { 
            int index = i;  
            for (int j = i + 1; j < numbers.length; j++){  
                if (numbers[j] < numbers[index]){  
                    index = j; //searching for lowest index  
                }  
            }  
            double smallerNumber = numbers[index];   
            numbers[index] = numbers[i];  
            numbers[i] = smallerNumber;  //swap algorithm
        }  
    }
            
    /**
     * Sort an array of strings using the selection sort algorithm.
     * @param inputArr array of strings
     */
    static void selectionSort(String arr[],int n)
{
    // One by one move boundary of unsorted subarray
    for(int i = 0; i < n - 1; i++)
    {
     
        // Find the minimum element in unsorted array
        int min_index = i;
        String minStr = arr[i];
        for(int j = i + 1; j < n; j++)
        {
             
            /*compareTo() will return a -ve value,
            if string1 (arr[j]) is smaller than string2 (minStr)*/
            // If arr[j] is smaller than minStr
         
            if(arr[j].compareTo(minStr) < 0)
            {
                // Make arr[j] as minStr and update min_idx
                minStr = arr[j];
                min_index = j;
            }
        }
 
    // Swapping the minimum element
    // found with the first element.
    if(min_index != i)
    {
        String temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;
    }
    }
}
    
    
}
   