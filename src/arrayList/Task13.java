package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 0, 15, 20, 4, 0, 15, 0, 9, 0, 1));
        //ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 51));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        ArrayList<Integer> list = new ArrayList<>(List.of(13, 1));
        int rsl = 0;

        for (int value : list) {
            char[] chars = Integer.toString(value).toCharArray();
            for (char ch : chars) {
                rsl += Character.getNumericValue(ch);
            }
        }

        System.out.println(rsl);
    }
}
