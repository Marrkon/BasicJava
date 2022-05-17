package collections.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Iterable extends Collection extends List implements <i>AbstractList extends ArrayList
// public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable

public class ArrayListExample {

    public ArrayListExample() {
        List<String> normalList = new ArrayList<>();

        normalList.add("list.ArrayList");
        normalList.add("list.ArrayList");
        normalList.add("list.ArrayList");
        Iterator ir = normalList.iterator();
        while(ir.hasNext()){
            System.out.println(ir);
            ir.next();
        }

        HashMap <Integer, String> storage = new HashMap();
        storage.put(1, "Marcin");
        storage.put(2, "Maciek");
        Iterator ir2 = storage.keySet().iterator();
        while (ir2.hasNext()){
            System.out.println(ir2.next());
        }
    }
}

//    Iterator itr = arrayList.iterator();
//        while (itr.hasNext()) {
//                System.out.println(itr.next());
//                }