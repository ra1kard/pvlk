package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task25 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 15, 6, -8, 41, 9, 16, -5, 0));
        int biggest = 0;
        int biggestIndex = 0;
        int k = 0;

        while (k < 4) {
            biggest = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > biggest) {
                    biggest = list.get(i);
                    biggestIndex = i;
                }
            }
            System.out.println("наибольшее: " + biggest);
            if (k < 3) {
                list.remove(biggestIndex);
            }
            k++;
        }

        System.out.println(biggest);
    }
}
