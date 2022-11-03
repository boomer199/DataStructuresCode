import java.util.Scanner;

class StackForBackwards {
    private int stackSize;
    private char[] stackArray;
    private int top;
    
    /**
     * constructor to initialize stack
     * @param size
     */
    public StackForBackwards(int size) {
        this.stackSize = size;
        this.stackArray = new char[stackSize];
        this.top = -1;
    }
    /**
     * Adds something to top of stack
     * @param entry character 
     */
    public void push(char entry) {
        this.stackArray[++top] = entry;
    }
    
    public char pop(){
        if(this.isStackEmpty()){
            System.out.println("Error");
        }
        return this.stackArray[top--];
    }
    

    public int peek() {
        return stackArray[top];
    }
    
    /**
     * Returns true if the stack is empty
     * @return
     */
    public boolean isStackEmpty() {
        return (top == -1);
    }
    
    /**
     * Returns true if the stack is full
     * @return
     */
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
     
}

class PalindromeChecker {

    public static void main(String[] args) {

    	System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        StackForBackwards stack = new StackForBackwards(inputString.length());

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isStackEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }
}