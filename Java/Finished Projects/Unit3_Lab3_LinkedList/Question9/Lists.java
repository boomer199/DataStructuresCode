package Question9;

import java.util.LinkedList;
import java.util.ListIterator;

public class Lists {
  public static void printSkipper(LinkedList<String> words) {
    ListIterator<String> iter = words.listIterator();
    int i = 0;
    while (iter.hasNext()) {
      String word = iter.next();
      if (i % 2 == 0) {
        System.out.print(word + " ");
      }
      i++;
    }
    System.out.println();
  }
}