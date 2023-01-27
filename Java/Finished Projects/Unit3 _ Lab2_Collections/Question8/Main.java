import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Double> randomDouble = () -> random.nextDouble();
        System.out.println(randomDouble.get());
    }
}