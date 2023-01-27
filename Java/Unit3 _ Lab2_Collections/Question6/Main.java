import java.util.*;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> product = (x, y) -> x * y;
        int result = product.apply(5, 10);
        System.out.println(result); // prints 50
    }
}