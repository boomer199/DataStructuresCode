package Question7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<List<Integer>> printList = (lst) -> {
            for (Integer i : lst) {
                System.out.println(i);
            }
        };

        printList.accept(list);
    }
}