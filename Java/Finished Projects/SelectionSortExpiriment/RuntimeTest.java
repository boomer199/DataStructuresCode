import java.util.Arrays;

public class RuntimeTest {
    
    private static long ssTime(double[] arr){
        long startTime = System.currentTimeMillis();
        selectionSort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    private static long bbTime(double[] arr){
        long startTime = System.currentTimeMillis();
        bubbleSort(arr);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    private static long msTime(double[] arr){
        long startTime = System.currentTimeMillis();
        mergeSort(arr, 0, arr.length -1);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    private static long qsTime(double[] arr){
        long startTime = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    
    public static void main(String[] args) { 

        double[] numberList;  // An array of random numbers.

        numberList = randomNumbers(50000);
        double[] numberList501 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList502 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList503 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList504 = Arrays.copyOf(numberList, numberList.length);
        numberList = randomNumbers(100000);
        double[] numberList101 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList102 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList103 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList104 = Arrays.copyOf(numberList, numberList.length);
        numberList = randomNumbers(150000);
        double[] numberList151 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList152 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList153 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList154 = Arrays.copyOf(numberList, numberList.length);
        numberList = randomNumbers(200000);
        double[] numberList201 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList202 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList203 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList204 = Arrays.copyOf(numberList, numberList.length);
        numberList = randomNumbers(250000);
        double[] numberList251 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList252 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList253 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList254 = Arrays.copyOf(numberList, numberList.length);
        numberList = randomNumbers(300000);
        double[] numberList301 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList302 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList303 = Arrays.copyOf(numberList, numberList.length);
        double[] numberList304 = Arrays.copyOf(numberList, numberList.length);


        System.out.println("Array Size | Selection Sort | Bubble Sort | Merge Sort | Quick Sort");
        System.out.println("   50,000  | " + ssTime(numberList501)   + " | " + bbTime(numberList502)   + " | " + msTime(numberList503)   + " | " + qsTime(numberList504)   + " ");
        System.out.println("  100,000  | " + ssTime(numberList101)   + " | " + bbTime(numberList102)   + " | " + msTime(numberList103)   + " | " + qsTime(numberList104)   + " ");
        System.out.println("  150,000  | " + ssTime(numberList151)   + " | " + bbTime(numberList152)   + " | " + msTime(numberList153)   + " | " + qsTime(numberList154)   + " ");
        System.out.println("  200,000  | " + ssTime(numberList201)   + " | " + bbTime(numberList202)   + " | " + msTime(numberList203)   + " | " + qsTime(numberList204)   + " ");
        System.out.println("  250,000  | " + ssTime(numberList251)   + " | " + bbTime(numberList252)   + " | " + msTime(numberList253)   + " | " + qsTime(numberList254)   + " ");
        System.out.println("  300,000  | " + ssTime(numberList301)   + " | " + bbTime(numberList302)   + " | " + msTime(numberList303)   + " | " + qsTime(numberList304)   + " ");

    }

    /**
     * Makes random doubles form 0-1
     * @param count how many doubles
     * @return the array of doubles
     */
    private static double[] randomNumbers(int count) {
        //Code for random double numbers goes here
      double[] rtn = new double[count];
      for(int i = 0; i < count; i++){
          rtn[i] = Math.random();
      }
      return rtn;
      }


    /**
     * Sorts array using bubblesort
     * @param numbers array of doubles
     */
    private static void bubbleSort(double[] numbers){
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < (numbers.length - i - 1); j++){
                if(numbers[j] > numbers[j+1]){
                    double temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }



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
     * sorts array using quicksort
     * @param arr array to be sorted 
     * @param left leftmost index of array (i.e. 0)
     * @param right rightmost index of array (i.e. arr.length - 1)
     * @return 
     */


     
    private static double[] quickSort(double[] arr, int left, int right){
        int index; 
        if (arr.length > 1){
            index = partition(arr, left, right);
            if(left < index - 1){
                quickSort(arr, left, (index - 1));
            }
            if(index < right) {
                quickSort(arr, index, right);
            }
        }
        return arr;
    }

    /**
     * sorts array using quicksort
     * @param arr array to be sorted
     * @param left leftmost index of array (i.e. 0)
     * @param right rightmost index of array (i.e. arr.length - 1)
     * @return where partition is made
     */
    private static int partition(double[] arr, int left, int right){
        double pivot = arr[Math.floorDiv((left + right), 2)];
        int i = left;
        int j = right;
        while (i <= j){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }
            if(i <= j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i; 
    }

    private static void swap(double[] arr, int leftIndex, int rightIndex){
        double temp = arr[leftIndex];   
        arr[leftIndex] = arr[rightIndex];  
        arr[rightIndex] = temp;
    }


    private static void mergeSort(double[] array, int low, int high) {
        if (high <= low) return;
    
        int mid = (low+high)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);
    }

    
    private static void merge(double[] array, int low, int mid, int high) {
        // Creating temporary subarrays
        double leftArray[] = new double[mid - low + 1];
        double rightArray[] = new double[high - mid];
    
        // Copying our subarrays into temporaries
        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = array[low + i];
        for (int i = 0; i < rightArray.length; i++)
            rightArray[i] = array[mid + i + 1];
    
        // Iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;
    
        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                   array[i] = leftArray[leftIndex];
                   leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
