package com.company;

public class DoublyLinkedList {
    // head node of doubly linked list
    private DoublyLinkedListNode head;
    // tail node of doubly linked list
    private DoublyLinkedListNode tail;


    /**
     * Adds data to the front of the linked list
     * @param data thing to be added
     */
    public void addFirst(Object data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
    }

    /**
     * Adds data to the end of linkedlist
     * @param data thing to be added
     */
    public void addLast(Object data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * removes first object from linked list
     * @return null if there is no head
     * @return the object that was removed if an object was sucsessfully removed
     */
    public Object removeFirst() {
        if (head == null) {
            return null;
        }
        Object data = head.getData();
        head = head.getNext();
        if (head == null) {
            tail = null;
        } else {
            head.setPrevious(null);
        }
        return data;
    }

     /**
     * removes last object from linked list
     * @return null if there is no head
     * @return the object that was removed if an object was sucsessfully removed
     */
    public Object removeLast() {
        if (tail == null) {
            return null;
        }
        Object data = tail.getData();
        tail = tail.getPrevious();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        return data;
    }

    /**
     * Inserts new data into the list after a object that is already in the list
     * @param key object that is already in the list that data will be added after
     * @param data object to be added after key
     */
    public void insertAfter(Object key, Object data) {
        DoublyLinkedListNode current = head;
        while (current != null && !current.getData().equals(key)) {
            current = current.getNext();
        }
        if (current == null) {
            return;
        }
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        newNode.setNext(current.getNext());
        newNode.setPrevious(current);
        if (current.getNext() != null) {
            current.getNext().setPrevious(newNode);
        } else {
            tail = newNode;
        }
        current.setNext(newNode);
    }

    /**
     * Deletes a specified element from the linked list
     * @param key object to be deleted
     */
    public void delete(Object key) {
        DoublyLinkedListNode current = head;
        while (current != null && !current.getData().equals(key)) {
            current = current.getNext();
        }
        if (current == null) {
            return;
        }
        if (current.getPrevious() != null) {
            current.getPrevious().setNext(current.getNext());
        } else {
            head = current.getNext();
        }
        if (current.getNext() != null) {
            current.getNext().setPrevious(current.getPrevious());
        } else {
            tail = current.getPrevious();
        }
    }

    /**
     * Prints the list in forwards order
     */
    public void displayForward() {
        DoublyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    /**
     * Prints the list in backwards order
     */
    public void displayBackward() {
        DoublyLinkedListNode current = tail;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPrevious();
        }
        System.out.println();
    }

    @Override
    /**
     * Prints the list in string format with "--->" in-between each element
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyLinkedListNode current = head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(" ---> ");
            }
            current = current.getNext();
        }
        return sb.toString();
    }
}
