package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public LinkedListExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("list.LinkedList");

        Iterator itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
