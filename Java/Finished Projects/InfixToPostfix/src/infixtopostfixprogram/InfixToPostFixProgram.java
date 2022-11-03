package infixtopostfixprogram;

import java.io.IOException;
import java.util.Scanner;
// import java.util.everettvilliger;

/**
 * @author everett v
 */
public class InfixToPostFixProgram {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input;

        while (true) {
            System.out.print("Enter infix: ");
            input = getString(); // read a string from keyboard
            if (input.equals("")) {
                break;
            }
            InFix t = new InFix(input);
            System.out.println(t.infixToPostfix(input));
            break;
        } 
        
    } 
    
//--------------------------------------------------------------

    public static String getString(){
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine(); 
            return s;
        } 
    }
}


////////////////////////////////////////////////////////////////



