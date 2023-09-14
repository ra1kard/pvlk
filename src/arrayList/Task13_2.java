package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task13_2 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 0, 15, 20, 4, 0, 15, 0, 9, 0, 1));
        //ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 51));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        ArrayList<Integer> list = new ArrayList<>(List.of(13, 1));
        int rsl = 0;

        for (int value : list) {
            while (value > 0) {
                rsl += value % 10;
                value = value / 10;
            }
        }

        System.out.println(rsl);
    }
}
//решение более оптимальное, без конвертаций
