package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(10, 10, 20, 20, 33, 44, 55, 66));
        System.out.println(numbers);

        List<Integer> list = new ArrayList<>(numbers);
        System.out.println(list);
    }
}
