package Sorting.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntSimple {

    public static void main(String[] args) {
        //сортировка простого списка Integer
        List<Integer> counters = new ArrayList<>();
        counters.add(8);
        counters.add(3);
        counters.add(1);
        Collections.sort(counters);
        System.out.println(counters);
    }

}
