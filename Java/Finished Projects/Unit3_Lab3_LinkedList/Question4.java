import java.util.LinkedList;
import java.util.ListIterator;

public class Question4 {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Peter");
        names.add("Paul");
        names.add("Mary");

        Question4.AddAnds(names);

        System.out.println(names);
    }

    public static void AddAnds(LinkedList<String> names) {
        ListIterator<String> iter = names.listIterator();
        iter.next();
        while (iter.hasNext()) {
            String name = iter.next();
            if (name.equals("and")) {
                break;
            } else {
                iter.previous();
                iter.add("and");
                iter.next();
            }
        }
    }
}