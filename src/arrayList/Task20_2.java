package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task20_2 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 10, 20, 77, 89, 96, 5, 14, 13, 20, 17, 10));
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 3, 5, 1));
        ArrayList<Integer> listRsl = new ArrayList<>();

        for (Integer integer : list) {
            if (!listRsl.contains(integer)) {
                listRsl.add(integer);
            }
        }

        System.out.println(listRsl);
    }
}
