import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

// pretty much a normal queue but the head pointer can shift once dequeue is called
public class everettv_circular_queue {
    private int size, front, rear; //Variable declaration
    private ArrayList<Integer> queue = new ArrayList<Integer>(); //Declaring Integer array list
    
    everettv_circular_queue(int queue_size){
        this.size = queue_size;
        this.front = this.rear = -1;
    }
    
    public int deQueue() {
        int t;
        if(front == -1) { // check if empty
            System.out.print("Queue Empty!");
            return -1;
        }
        t = queue.get(front); // it is an arraylist that I am using, so this works, if it was a linkedList I could not do this
    
        if(front == rear) { // 1 element queue?
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
        return t; // Returns dequeued element
    }
    
    public void enQueue(int e) {
        if((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1))) { // queue is full condition
            System.out.print("Queue is full");
        }
        else if(front == -1) { // queue is empty
            front = 0;
            rear = 0;
            queue.add(rear, e);
        }
        else if(rear == size - 1 && front != 0) {
            rear = 0;
            queue.set(rear, e);
        } else { 
            rear = (rear + 1);
            if(front <= rear) { // adds new element if front <= rear 
                queue.add(rear, e);
            } else {
                queue.set(rear, e);
            }
        }
    }

    public void displayQueue() {
        System.out.println("   ");
        System.out.println("   "); 
        System.out.println("   ");
        System.out.println("********************************PRINTED CIRCULAR-QUEUE********************************");

    
        if(rear >= front) { //if rear has not crossed the size limit 
            for(int i = front; i <= rear; i++) {
                System.out.print(queue.get(i));
                System.out.println();
            }
            System.out.println();
        } else {
            for(int i = front; i < size; i++) {
                System.out.print(queue.get(i));
                System.out.println();
            }
            for(int i = 0; i <= rear; i++) {
                System.out.print(queue.get(i));
                System.out.println();
            }
            System.out.println();
        }
    }
    
    // Driver code
    public static void main(String[] args){
        System.out.println("How Many Terms Would You Like Added To The CircularQueue:");
        Scanner sc = new Scanner(System.in);
        int queueLength=sc.nextInt() +1;
        int[] arr = randNums(queueLength);
        everettv_circular_queue queue = new everettv_circular_queue(queueLength); // Initialising new object of my circularqueue class.
        
        
        for(int i = 0; i < queueLength-1; i++){
            queue.enQueue(arr[i]);
        }
        queue.displayQueue();
        
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.displayQueue();

        queue.enQueue(123);
        queue.enQueue(124);

        queue.displayQueue();

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
