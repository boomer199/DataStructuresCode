import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

// pretty much a normal queue but the head pointer can shift once dequeue is called
public class everettv_circular_queue {

    
    private int size, front, rear; //Variable declaration
    
    
    private ArrayList<Integer> circular_queue = new ArrayList<Integer>(); //Declaring Integer array list
    
    everettv_circular_queue(int queue_size){
        this.size = queue_size;
        this.front = this.rear = -1;
    }
    
    public void enQueue(int queue_data) //Insertion Function
    {
        if((front == 0 && rear == size - 1) ||
        (rear == (front - 1) % (size - 1))) // Condition if queue is full
        {
            System.out.print("Queue Full!");
        }
    
        else if(front == -1) // Condition for empty queue.
        {
            front = 0;
            rear = 0;
            circular_queue.add(rear, queue_data);
        }
        else if(rear == size - 1 && front != 0)
        {
            rear = 0;
            circular_queue.set(rear, queue_data);
        }
        else
        {
            rear = (rear + 1);
            // Adding a new element if
            if(front <= rear)
            {
                circular_queue.add(rear, queue_data);
            }
            // Else updating old value
            else
            {
                circular_queue.set(rear, queue_data);
            }
        }
    }
    
    public int deQueue() //Dequeue Function
    {
        int temp;
    
        if(front == -1) //Checking for empty queue
        {
            System.out.print("Queue Empty!");
            return -1;
        }
    
        temp = circular_queue.get(front);
    
        if(front == rear) // For only one element
        {
            front = -1;
            rear = -1;
        }
    
        else if(front == size - 1)
        {
            front = 0;
        }
        else
        {
            front = front + 1;
        }
        return temp; // Returns dequeued element
    }
    
    
    public void displayQueue() // Display the elements of queue
    {
        if(front == -1) // Check for empty queue
        {
            System.out.print("Queue is Empty");
            return;
        }
        System.out.println("   ");
        System.out.println("   "); 
        System.out.println("   ");
        System.out.println("********************************PRINTED CIRCULAR-QUEUE********************************");

    
        if(rear >= front) //if rear has not crossed the size limit 
        {
            for(int i = front; i <= rear; i++) //print elements using loop
            {
                System.out.print(circular_queue.get(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    
        else
        {
            for(int i = front; i < size; i++)
            {
                System.out.print(circular_queue.get(i));
                System.out.print(" ");
            }
            for(int i = 0; i <= rear; i++) // Loop for printing elements from 0th index till rear position
            {
                System.out.print(circular_queue.get(i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    // Driver code
    public static void main(String[] args)
    {

        System.out.println("How Many Terms Would You Like Added To The CircularQueue:");
        Scanner sc= new Scanner(System.in);
        int queueLength=sc.nextInt() +1;
        int[] arr = randNums(queueLength);
        everettv_circular_queue queue = new everettv_circular_queue(queueLength); // Initialising new object of CircularQueue class.
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
