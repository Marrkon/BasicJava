package collections.list;

import java.util.ArrayList;
import java.util.Iterator;

// Iterable extends Collection extends List implements <i>AbstractList extends ArrayList
// public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable

public class ArrayListExample {

    public ArrayListExample() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("list.ArrayList");

        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
