import java.util.Scanner;
import java.io.Console;
import java.util.*;


class Queue {
    int rear;
    int head;
    int size;
    int capacity;
    int queueArr[];


    public Queue(int capacity) {
        this.capacity = capacity;
        head = this.size = 0;
        rear = 0;
        queueArr = new int[this.capacity];
    }

    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    public void enqueue(int val) {
        if (isFull(this)){ return; }
        this.rear = (this.rear + 1); 
        this.queueArr[this.rear] = val;
        this.size = this.size + 1;
        System.out.println(val + " added to queue");
    }

    public int dequeue() {
        if (isEmpty(this)) { return Integer.MIN_VALUE;} 
        int item = this.queueArr[this.head];
        this.head = this.head + 1;
        this.size = this.size - 1;
        return item;
    }


    public int front() {
        if (isEmpty(this)) { return Integer.MIN_VALUE; }
        return this.queueArr[this.head];
    }
 
    // Method to get rear of queue
    public int rear() {
        if (isEmpty(this)) { return Integer.MIN_VALUE; }
        return this.queueArr[this.rear];
    }


    /**
     * Prints full queue given initial array used to make queue
     * @param queue
     */
    public void printQueue() {
        System.out.println("   ");
        System.out.println("   "); 
        System.out.println("   ");
        System.out.println("********************************PRINTED QUEUE********************************");
        for(int i = head; i <= rear; i++) {
            System.out.print(queueArr[i]+ ", ");
        }
    }
}


// driver
class Main {
    public static void main (String args[]){
        System.out.println("How Many Terms Would You Like Added To The Queue:");
        Scanner sc= new Scanner(System.in);
        int queueLength=sc.nextInt() +1;
        int[] arr = randNums(queueLength);
        Queue queue = new Queue(queueLength);
        for(int i = 0; i < queueLength-1; i++){
            queue.enqueue(arr[i]);
        }
        queue.printQueue();

        // Test dequeue
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        //queue.dequeue();
        //queue.dequeue();

        queue.printQueue();
    }
        
    public static int[] randNums(int queueLength){
        int number;
        int[] arr = new int[queueLength];
        Random rand = new Random();
        for (number = 0; number < arr.length; number++) {
            arr[number] = rand.nextInt(1000);
        }
        return arr;
    }       
}