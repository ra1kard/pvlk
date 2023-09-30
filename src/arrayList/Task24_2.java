package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task24_2 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 15, 6, -8, 41, 9, 16, -5, 0));
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list);
        int k = 0;

        while (k < 4) {
            int lowest = Integer.MAX_VALUE;
            for (Integer integer : list) {
                if (integer < lowest && !list2.contains(integer)) {
                    lowest = integer;
                }
            }
            list2.add(lowest);
            k++;
        }

        System.out.println(list2.get(list2.size()-1));
    }
}
