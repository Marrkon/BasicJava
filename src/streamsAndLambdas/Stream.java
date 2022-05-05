package streamsAndLambdas;

import java.util.ArrayList;
import java.util.Iterator;

// Collectors fun

public class Stream {

    public Stream() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("streams.Stream");

        Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

//    List<Integer> transactionsIds =
//            transactions.stream()
//                    .filter(t -> t.getType() == Transaction.GROCERY)
//                    .sorted(comparing(Transaction::getValue).reversed())
//                    .map(Transaction::getId)
//                    .collect(toList());
}
