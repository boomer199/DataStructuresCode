import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Q4 {
  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();
    cities.add("London");
    cities.add("Paris");
    cities.add("New York");
    cities.add("San Francisco");
    cities.add("Beijing");
    cities.add("New York");

    SortedSet<String> sortedCities = new TreeSet<>(cities);
    System.out.println("Sorted set: " + sortedCities);

    System.out.println("First Element: " + sortedCities.first());
    System.out.println("Last Element : " + sortedCities.last());

    System.out.println("Elements before New York : " + sortedCities.headSet("New York"));
    System.out.println("Elements after New York including New York : " + sortedCities.tailSet("New York"));

    NavigableSet<String> navigableSet = (NavigableSet<String>) sortedCities;
    System.out.println("Largest element less than P : " + navigableSet.lower("P"));
    System.out.println("Smallest element greater than P : " + navigableSet.higher("P"));
    System.out.println("Largest element less than or equal to P : " + navigableSet.floor("P"));
    System.out.println("Smallest element greater than or equal to P : " + navigableSet.ceiling("P"));

    System.out.println("First Element Removed :" + sortedCities.first());
    sortedCities.remove(sortedCities.first());
    System.out.println("Last Element Removed :" + sortedCities.last());
    sortedCities.remove(sortedCities.last());
    
    System.out.println("New set: " + sortedCities);
  }
}
