public class CircularLinkedList {

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Constructor
    public CircularLinkedList() {
        head = null;
        size = 0;
    }

    // Function to check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Function to get the size of the list
    public int getSize() {
        return size;
    }

    // Function to insert a node at the beginning of the list
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            head = newNode;
        }
        size++;
    }

    // Function to insert a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    // Function to insert a node at a specific position in the list
    public void insertAtPosition(int data, int position) {
        if (position < 1 || position > getSize() + 1) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            insertAtStart(data);
        } else {
            Node current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    // Function to delete the first node of the list
    public void deleteAtStart() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = head.next;
        head = head.next;
        size--;
    }

    // Function to delete the last node of the list
    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        Node prev = null;
        while (current.next != head) {
            prev = current;
            current = current.next;
        }
        prev.next = head;
        size--;
    }

        // Function to delete a node at a specific position in the list
        public void deleteAtPosition(int position) {
            if (isEmpty()) {
                System.out.println("List is empty");
                return;
            }
            if (position < 1 || position > getSize()) {
                System.out.println("Invalid position");
                return;
            }
            if (position == 1) {
                deleteAtStart();
            } else {
                Node current = head;
                Node prev = null;
                for (int i = 1; i < position; i++) {
                    prev = current;
                    current = current.next;
                }
                prev.next = current.next;
                size--;
            }
        }
    
        // Function to traverse the list and print the data of each node
        public void traverseList() {
            if (isEmpty()) {
                System.out.println("List is empty");
                return;
            }
            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    
        // Main method to test the implementation
        public static void main(String[] args) {
            CircularLinkedList list = new CircularLinkedList();
            list.insertAtStart(5);
            list.insertAtEnd(10);
            list.insertAtPosition(7, 2);
            list.traverseList(); // Expected output: 5 7 10
            list.deleteAtPosition(2);
            list.traverseList(); // Expected output: 5 10
            System.out.println("Size of the list: " + list.getSize()); // Expected output: 2
        }
    }
    