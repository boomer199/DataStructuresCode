package Question5;

import java.util.LinkedList;

public class Lists {
  public static Object removeFirst(LinkedList<String> names) {
    if (names.isEmpty()) {
      return null;
    } else {
      return names.removeFirst();
    }
  }
}
