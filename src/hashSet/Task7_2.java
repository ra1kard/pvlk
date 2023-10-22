package hashSet;

import java.util.*;

public class Task7_2 {
    public static void main(String[] args) {
        HashSet<Integer> numbersOne = new HashSet<>(Arrays.asList(10, 90, 30, 40, 50, 60));
        HashSet<Integer> numbersTwo = new HashSet<>(Arrays.asList(11, 90, 33, 40, 55, 60));
        TreeSet<Integer> numbersTree = new TreeSet<>();

        for (Integer i : numbersOne) {
            if (numbersTwo.contains(i)) {
                numbersTree.add(i);
            }
        }
        System.out.println(numbersTree);
    }
}
