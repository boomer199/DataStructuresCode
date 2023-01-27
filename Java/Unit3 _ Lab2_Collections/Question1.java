import java.util.*;


public class Question1 {
  
    public static void main(String[] args) {
        System.out.println("Working with a List");
        workWith(new ArrayList<>());
        System.out.println("Working with a Set");
        workWith(new HashSet<>());
    }

    public static void workWith(Collection<String> collection) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the collection, separated by spaces: (Example is Harry Sally Fred Wilma Harry)");
        String[] elements = scanner.nextLine().split(" ");
      
        collection.addAll(Arrays.asList(elements));
        System.out.println("Here are the elements entered:");
        System.out.println(collection);
        System.out.println("Removing Harry and Tom:");
        System.out.println(collection.remove("Harry") + " " + collection.remove("Tom"));
        System.out.println("Looking for Harry and Sally:");
        System.out.println(collection.contains("Harry") + " " + collection.contains("Sally"));
        System.out.println("Here are the elements in the collection after processing:");
        System.out.println(collection);
    }
}
