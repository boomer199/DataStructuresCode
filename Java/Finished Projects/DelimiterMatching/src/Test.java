import java.io.Console;

public class Test {
    private int stackSize;
    private char[] stackArray;
    private int top;
 
    /**
     * constructor to initialize stack
     * @param size
     */
    public Test(int size) {
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
 
    public boolean isDelimiterMatching(String inputExpr) throws Exception {        
        for (int j = 0; j < inputExpr.length(); j++) {
            char ch = inputExpr.charAt(j);
            switch (ch) {
            case '{':
            case '[':
            case '(':
                    push(ch);
                    break;
            case '}':
            case ']':
            case ')':
                    if (!isStackEmpty()) {
                        char stackContent = pop();
                        if ((ch == '}' && stackContent != '{') 
                                || (ch == ']' && stackContent != '[')
                                || (ch == ')' && stackContent != '(')){
                            System.out.println("Mismatch found: " + ch + " at " + j);
                            return false;
                        }
                    } else {
                        System.out.println("Mismatch found: " + ch + " at " + j);
                        return false;
                    }
                    break;
            default: break;
            }
        }
        if (!isStackEmpty()){
            System.out.println("Error");
            return false;
        }
        return true;
    }
 
    public String reverseWord(String word) throws Exception{        
        StringBuilder sb = new StringBuilder();
        int size = word.length();
        for(int i=0;i<size;i++){
            push(word.charAt(i));
        }
        while(!isStackEmpty()){
            sb.append(pop());
        }
        return sb.toString();
    }
 
	public static void main(String args[]){
		try {
			String expression = "{(a+b)*(c+d)}";
            System.out.println("");
            System.out.println("");
            System.out.println("Expression: " + expression);
            System.out.println("");
            System.out.println("");
			Test test = new Test(expression.length());
            System.out.println("");
            System.out.println("");
			System.out.println("Right expression: " + test.isDelimiterMatching(expression));
            System.out.println("");
            System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
