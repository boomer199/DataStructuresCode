import java.util.*;


public class Main {
    public static void main(String[] args) {
        StringFunction toUpper = (input) -> input.toUpperCase();
        String input = "Hello World";
        System.out.println("Before: " + input);
        String result = toUpper.apply(input);
        System.out.println("After: " + result); // prints "HELLO WORLD"
    }
}

