package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 0, 15, 20, 4, 0, 15, 0, 9, 0, 1));
        //ArrayList<Integer> list = new ArrayList<>(List.of(15, 27, 9, 0, 14, 6, 28, -7, 0));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 1, 2, 3));
        int rsl = 0;
        int countNull = 0;

        for (int e : list) {
            if (e == 0) {
                countNull++;
            } else if (countNull == 1) {
                rsl += e;
            } else if (countNull > 1) {
                break;
            }
        }

        System.out.println(countNull > 1 ? rsl : 0);
    }
}
