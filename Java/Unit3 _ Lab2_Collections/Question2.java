import java.util.*;

public class Question2 {
    public static void copyNotPresent(List<String> source, List<String> target) {
        for (String element : source) {
            if (!target.contains(element)) {
                target.add(element);
            }
        }
    }
    public static void main (String [] args){
        List<String> source = new ArrayList<>();
        source.add("A");
        source.add("B");
        source.add("C");
        source.add("D");
        source.add("E");

        List<String> target = new ArrayList<>();
        target.add("C");
        target.add("F");
        target.add("G");
        target.add("A");

        copyNotPresent(source, target);

        for (String element : target) {
            System.out.print(element);
        }
    }
}
