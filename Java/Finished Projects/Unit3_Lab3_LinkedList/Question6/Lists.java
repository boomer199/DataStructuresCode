package Question6;

import java.util.*;

public class Lists {
    public static Object removeSecond(LinkedList list) {
        if (list.size() < 2) {
            return null;
        }
        Iterator it = list.iterator();
        it.next();
        Object removed = it.next();
        it.remove();
        return removed;
    }
}
