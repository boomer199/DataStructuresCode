package com.company;

public class DoublyLinkedListNode {
    //data held by the node
    private Object data;
    //prev node in linked list
    private DoublyLinkedListNode previous;
    //next node in linked list
    private DoublyLinkedListNode next;


    /**
     * Constructor -- makes a new node
     * @param data data that the node will hold
     */
    public DoublyLinkedListNode(Object data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    /**
     * getter for the data of the node
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * sets data for the node
     * @param data what the data is being set to
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * getter for the prev node
     * @return prev node
     */
    public DoublyLinkedListNode getPrevious() {
        return previous;
    }

    /**
     * setter for prev node pointer
     * @param previous value for prev node pointer
     */
    public void setPrevious(DoublyLinkedListNode previous) {
        this.previous = previous;
    }

    /**
     * getter for the next node
     * @return next node
     */
    public DoublyLinkedListNode getNext() {
        return next;
    }

    /**
     * setter for next node pointer
     * @param previous value for next node pointer
     */
    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }
}
