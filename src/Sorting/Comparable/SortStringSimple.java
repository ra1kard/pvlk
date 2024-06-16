package Sorting.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringSimple {

    public static void main(String[] args) {
        //сортировка простого списка String
        List<String> names = new ArrayList<>();
        String name1 = "Маша";
        String name2 = "Саша";
        String name3 = "Даша";
        names.add(name1);
        names.add(name2);
        names.add(name3);
        Collections.sort(names);
        System.out.println(names);
    }

}
