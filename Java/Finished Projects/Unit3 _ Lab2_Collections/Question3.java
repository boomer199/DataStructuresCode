import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static int removeElements(List<String> a, List<String> b) {
        int count = 0;
        List<String> removedElements = new ArrayList<>();
        for (String element : a) {
            if (b.contains(element)) {
                removedElements.add(element);
                b.remove(element);
                count++;
            }
        }
        System.out.println("Number of elements removed: " + count);
        System.out.println("Name of elements removed: " + removedElements);
        return count;
    }
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("C");
        a.add("F");
        a.add("E");

        List<String> b = new ArrayList<>();
        b.add("A");
        b.add("B");
        b.add("C");
        b.add("D");
        b.add("E");

        System.out.println("Collection a before removal: " + a);
        System.out.println("Collection b before removal: " + b);
        int count = removeElements(a, b);
        System.out.println("Collection b after removal: " + b);
    }
}
