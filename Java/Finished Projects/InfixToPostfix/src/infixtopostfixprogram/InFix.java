package infixtopostfixprogram;

import java.util.ArrayList;
import java.util.Stack;
// import java.util.everettvilliger;

/**
 * @author everett v
 */
class InFix {
    private StackX theStack;
    private String input;
//--------------------------------------------------------------

    public InFix(String in) // constructor
    {
        this.input = in;
        int stackSize = this.input.length();
        this.theStack = new StackX(stackSize);
    }

// precedence check    
    public static int Prec(char ecv) {
            switch (ecv) {
            case '+':
            case '-': // this is a test
                return 1;
        
            case '*':
            case '/':
                return 2;
        
            case '^':
                return 3;
            }
            return -1;
    }

    static String infixToPostfix(String exp) {

        String result = new String("");

        Stack < Character > stack = new Stack < > ();
    
        for (int i = 0; i < exp.length(); ++i) {
          char c = exp.charAt(i);
    

          if (Character.isLetterOrDigit(c))
            result += c;

          else if (c == '(')
            stack.push(c);
    
          else if (c == ')') {
            while (!stack.isEmpty() &&
              stack.peek() != '(')
              result += stack.pop();
    
            stack.pop();
          } else {
            while (!stack.isEmpty() && Prec(c) <=
              Prec(stack.peek())) {
    
              result += stack.pop();
            }
            stack.push(c);
          }
    
        }
    

        while (!stack.isEmpty()) {
          if (stack.peek() == '(')
            return "Invalid Expression";
          result += stack.pop();
        }
        return result;
      }
}
