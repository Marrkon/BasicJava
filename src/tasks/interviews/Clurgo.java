package tasks.interviews;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Clurgo {

    // 1
    public List<Integer> findMinMax(List <Integer> listOfIntegers) {
        Integer minValue = 0, maxValue = 0;
        if (listOfIntegers.size() == 0){
            return Arrays.asList(0,0);
        }

        for (Integer listElement : listOfIntegers ){
            if (listElement > maxValue) {
                maxValue = listElement;
            }
            if (listElement < minValue){
                minValue = listElement;
            }
        }
        return Arrays.asList(minValue,maxValue);
    }
    // 2.1
    public List <String> removeDuplicatesArrayListsWithContains (List <String> stringList){
        List <String> newStringList = new LinkedList<>();

        for(String elem : stringList) {
            if(!newStringList.contains(elem)) {
                newStringList.add(elem);
            }
        }
        return newStringList;
    }

    // 2.2
    public List <String> removeDuplicatesLinkedHashSet (ArrayList <String> stringList){
        Set <String> newHashSet = new HashSet<>();
        newHashSet.addAll(stringList);

        System.out.println(newHashSet);

        stringList.clear();
        stringList.addAll(newHashSet);
        return stringList;
    }

    // 2.3
    public List <String> removeDuplicatesStreams (List <String> stringList){
        return stringList.stream()
                .filter(elem -> elem.contains("pa"))
                .map(elem -> elem + "x111")
                .distinct()
                .collect(Collectors.toList());
    }

    // 3
    public int calculateFibbonaciSum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return calculateFibbonaciSum(n - 1) + calculateFibbonaciSum(n - 2);
    }

    // 4 TreeSet reversed order
    public void reverseTreeSet(TreeSet<String> someTreeSet ){
        System.out.println(someTreeSet);
        System.out.println(someTreeSet.descendingSet());
        }

    // 5

    public List<Integer> findCommonElements(List<Integer> l1, List<Integer> l2) {
        List <Integer> interferenceList = new ArrayList<>();

        Integer l1Size = l1.size();
        Integer l2Size = l2.size();
        Integer l1Pointer = 0;
        Integer l2Pointer = 0;

        if (l1Size == 0 || l2Size == 0){
            return interferenceList;
        }

        while (l1Pointer < l1Size && l2Pointer < l2Size) {

            if (l1.get(l1Pointer) < l2.get(l2Pointer)) {
                l1Pointer += 1;
            } else if (l2.get(l2Pointer) < l1.get(l1Pointer)) {
                l2Pointer += 1;
            } else {
                interferenceList.add(l1.get(l1Pointer));
                l1Pointer += 1;
                l2Pointer += 1;
            }
        }

        System.out.println(interferenceList);
        return interferenceList;
    }

    private int fibNum;

    public Clurgo(int fibNum) {
        this.fibNum = fibNum;
        // 1
        //System.out.println(calculateFibbonaciSum(this.fibNum));

        // 2.1, 2.2, 2.3
        //System.out.println(removeDuplicatesArrayListsWithContains(Arrays.asList("a", "v","aa","a","aa","c","b","cc")));
        //System.out.println(removeDuplicatesLinkedHashSet(A ("a", "v","aa","a","aa","c","b","cc")));
        //System.out.println(removeDuplicatesStreams(Arrays.asList("a", "dupa","dupa","dupa","patka","pa","patka","patka","v","aa","a","aa","c","b","cc")));

        // 3
        //System.out.println(findMinMax(Arrays.asList(4,6,1,22,5,-2,6,8,999,-22)));

        //4
//        TreeSet <String> myTreeSet = new TreeSet<>();
//        myTreeSet.add("Bupka");
//        myTreeSet.add("Zupka");
//        myTreeSet.add("Cupka");
//        myTreeSet.add("Dupka");
//        reverseTreeSet(myTreeSet);

        //5 - 2 sorted Lists find common elements
        ArrayList <Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(5);
        l1.add(5);
        l1.add(8);
        l1.add(9);

        ArrayList <Integer> l2 = new ArrayList<>();
        l2.add(2);
//        l2.add(2);
//        l2.add(3);
//        l2.add(5);
        l2.add(5);
//        l2.add(7);
//        l2.add(9);

        findCommonElements(l1, l2);
    }
}
