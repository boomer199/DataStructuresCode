package infixtopostfixprogram;

// import java.util.everettvilliger;

/**
 * @author everett v
 */
class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;
//--------------------------------------------------------------

    public StackX(int s) // constructor
    {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }
//--------------------------------------------------------------

    public void push(char j) // put item on top of stack
    {
        this.stackArray[++top] = entry;
    }
//--------------------------------------------------------------

    public char pop() // take item from top of stack
    {
        if(this.isStackEmpty()){
        	System.out.println("Error");
        }
        return this.stackArray[top--];
    }
//--------------------------------------------------------------

    public char peek() // peek at top of stack
    {
        return stackArray[top];
    }
//--------------------------------------------------------------

    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
//-------------------------------------------------------------

    public int size() // return size
    {
        return top + 1;
    }
//--------------------------------------------------------------

    public char peekN(int n) // return item at index n
    {
        return stackArray[n];
    }
//--------------------------------------------------------------

    public void displayStack(String s) { //never used but was required to code so here
        System.out.println("Status of elements in stack:");
        for(int i = 0; i < stackArray.length; i++){
            System.out.println("|"+ stackArray[i] +"|");
        }
    }
//--------------------------------------------------------------
} 