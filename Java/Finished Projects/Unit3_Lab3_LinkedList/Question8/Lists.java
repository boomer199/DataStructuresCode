package Question8;

import java.util.*;

public class Lists {
    public static void removeStringsWithLengthLessThanFour(List<String> words) {
        Iterator<String> iter = words.iterator();
        while (iter.hasNext()) {
            String word = iter.next();
            if (word.length() < 4) {
                iter.remove();
            }
        }
    }
}
