package hashSet;

import java.util.*;

public class Task8_2 {
    public static void main(String[] args) {
        HashSet<Integer> numbersOne = new HashSet<>(Arrays.asList(10, 90, 30, 40, 50, 60));
        System.out.println(numbersOne);

        TreeSet<Integer> numbersTwo = new TreeSet<>(numbersOne);
        System.out.println(numbersTwo);

        List<Integer> list = new ArrayList<>(numbersTwo);
        System.out.println(list.size()-1 + " - index");
        System.out.println(list.get(list.size()-1) + " - maxValue");
    }
}
