import java.util.*;

public class Main {
    public static void main(String[] args) {
        IntUnaryOperator incrementByTen = (input) -> input + 10;
        int result = incrementByTen.apply(5);
        System.out.println(result); // prints 15
    }
}