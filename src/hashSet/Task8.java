package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(10, 90, 30, 40, 50, 60));
        System.out.println(numbers);

        List<Integer> list = new ArrayList<>(numbers);
        int max = list.get(0);
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }

        System.out.println(index + " - index");
        System.out.println(max + " - maxValue");
    }
}
