import java.util.Queue;   // Imported this one, I coded my own in everettv_queue.java
import java.util.Scanner;
import java.util.LinkedList;

// LOGIC FOR WHY THIS WORKS:
// The best way I thought of doing this is a palindrome checker, but if the imput string has an odd number of .length() it cannot be true
class everettv_q6 {
    // I used a linked list so i could easily sort backwards without using an array
    public static void main(String[] args) {
    	System.out.print("Enter any string to be checked:");
        Scanner in =new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();
        
        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString) &&  inputString.length()%2 == 0){
            System.out.println("The input String has the same first and back half");
        }
        else{
            System.out.println("The input String does not have the same first and back half");
        }
    }
}