package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {

        //необходимо отфильтровать массив и сформировать коллекцию без дублей
        HashSet<Integer> numbers = new HashSet<Integer>(Arrays.asList(10, 10, 20, 77, 89, 96, 5, 14, 13, 20, 17, 10));
        HashSet<Integer> numbers2 = new HashSet<Integer>();
        System.out.println(numbers);        // ! тут уже видно, что нет дублей

        for (int n : numbers) {             // и это выходит бессмысленное действие?
            if (!numbers2.contains(n)) {
                numbers2.add(n);
            }
        }
        System.out.println(numbers2);
        System.out.println();

        //дополнительно представить решение через ArrayList
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 10, 20, 77, 89, 96, 5, 14, 13, 20, 17, 10));
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list);           //тут видно дубли есть

        for (int n : list) {                //а тут мы их убрали
            if (!list2.contains(n)) {
                list2.add(n);
            }
        }
        System.out.println(list2);

    }
}
