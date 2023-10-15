package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        HashSet<Integer> numbersOne = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        HashSet<Integer> numbersTwo = new HashSet<>(Arrays.asList(11, 20, 33, 40, 55, 60));
        List<Integer> list = new ArrayList<>();

        for (Integer i : numbersOne) {
            if (numbersTwo.contains(i)) {
                list.add(i);
            }
        }

        System.out.println(list);
    }
}
