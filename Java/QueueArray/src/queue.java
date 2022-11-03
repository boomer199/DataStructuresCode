import java.util.Scanner;


class Queue {
    int rear;
    int head;
    int size;
    int capacity;
    int queueArr[];


    public Queue(int capacity) {
        this.capacity = capacity;
        head = this.size = 0;
        rear = capacity -1;
        queueArr = new int[this.capacity];
    }

    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    public void enqueue(int val) {
        if (isFull(this))  { return; }
        this.rear = (this.rear + 1) % this.capacity;
        this.queueArr[this.rear] = val;
        this.size = this.size + 1;
        System.out.println(val + " added to queue");
    }

    public int dequeue() {
        if (isEmpty(this)) { return Integer.MIN_VALUE;} 
        int item = this.queueArr[this.head];
        this.head = (this.head + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }


    public int front() {
        if (isEmpty(this)) { return Integer.MIN_VALUE; }
        return this.queueArr[this.front];
    }
 
    // Method to get rear of queue
    public int rear() {
        if (isEmpty(this)) { return Integer.MIN_VALUE; }
        return this.queueArr[this.rear];
    }
}

// driver
class Main {
    static String input;
    int InputVal = 10;
    static int arrToPush[];
    public static void main (String args[]){
        Queue queue = new Queue(1000);
        System.out.print("Enter Number of Nums to be Added to Queue: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        if (parseInt(input) > 0){
            inputVal = parseInt(input);
        }
        arrToPush = new int [inputVal];


    }

    private int randomNums(int numOfR){
        for(i = 0; i <= numOfR; i++){
            int temp = Math.round(Math.random()*100);
        }
    }
}