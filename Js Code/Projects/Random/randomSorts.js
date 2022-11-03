
//Declaring Variables
let points = [];
const readline = require('readline')
let numTerms = 0;
let maxTerm = 0;

clearArr();

const inq = readline.createInterface({
    input:process.stdin,
    output:process.stdout
})
inq.question("How many terms in array to be sorted:", numTerm  => {
    numTerms = numTerm
    inq.question("What do you want max term in array to be:", maxTermTemp  => {
        maxTerm = maxTermTemp
        makeArr(numTerms, maxTerm);
        chooseSortType();
    })
})


function clearArr(){
    points = [];
}

function makeArr(terms, maxTerm){
    
    for(let i = 0; i <= terms; i++){
        let temp = Math.round(Math.random()*maxTerm)
        points.push(temp)
    }
    console.log("Unsorted Array: " + points)
}



function selectionSort(inputArr) { 
    let n = inputArr.length;
        
    for(let i = 0; i < n; i++) {
        // Finding the smallest number in the subarray
        let min = i;
        for(let j = i+1; j < n; j++){
            if(inputArr[j] < inputArr[min]) {
                min=j; 
            }
         }
         if (min != i) {
             // Swapping the elements
             let tmp = inputArr[i]; 
             inputArr[i] = inputArr[min];
             inputArr[min] = tmp;      
        }
    }
    return inputArr;
}
 

 


function bubbleSort(arr){
    for(let i = 0; i < arr.length; i++){
        for(let j = 0; j <(arr.length - i - 1); j++){
            if(arr[j] > arr[j+1]){
        
                let temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j+1] = temp
              }
        }
    }

    return arr;
}




function insertionSort(arr) {
    let n = arr.length;
        for (let i = 1; i < n; i++) {
            let temp = arr[i];
            let j = i-1; 
            while ((j > -1) && (temp < arr[j])) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    return arr;
}




/* //TODO: MERGE SORT
class Merge{
    
    mergeSort(){

    }
    
    merge(arr, left, right){
    
    }
}
*/

function swap(arr, leftIndex, rightIndex){
    let temp = arr[leftIndex];
    arr[leftIndex] = arr[rightIndex];
    arr[rightIndex] = temp;
}

function partition(arr, left, right) {
    let pivot   = arr[Math.floor((right + left) / 2)], //middle element
        i       = left, //left pointer
        j       = right; //right pointer
    while (i <= j) {
        while (arr[i] < pivot) {
            i++;
        }
        while (arr[j] > pivot) {
            j--;
        }i
        if (i <= j) {
            swap(arr, i, j); //sawpping two elements
            i++;
            j--;
        }
    }
    return i;
}

function quickSort(arr, left, right) {
    let index;
    if (arr.length > 1) {
        index = partition(arr, left, right); //index returned from partition
        if (left < index - 1) { //more elements on the left side of the pivot
            quickSort(arr, left, index - 1);
        }
        if (index < right) { //more elements on the right side of the pivot
            quickSort(arr, index, right);
        }
    }
    return arr;
}





function chooseSortType(){
    
    console.log("Press 1 for Selection Sort")
    console.log("Press 2 for Bubble Sort")
    console.log("Press 3 for Insertion Sort")
    console.log("Press 4 for Merge Sort (Work in Progress)")
    console.log("Press 5 for Quick Sort")
    
      
      inq.question("Which sort do you want to use?", num => {
            if(`${num}` == 1){
                let n = 5;
                console.log("Selection Sort: " + selectionSort(points))

            }
            if(`${num}` == 2){
                console.log("Bubble Sort: " + bubbleSort(points))

            }
            if(`${num}` == 3){
                console.log("Insertion Sort: " + insertionSort(points))

            }
            if(`${num}` == 4){
                console.log('Work in progress -- Does not work')

            }
            if(`${num}` == 5){
                let sortedArray = quickSort(points, 0, points.length - 1);
                console.log("Quick Sort: " + sortedArray);

            }

      });
      
      inq.on("close", function() {
        console.log("It was sorted");
        process.exit(0);
      });

}
