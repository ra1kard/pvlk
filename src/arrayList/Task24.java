package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task24 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 15, 6, -8, 41, 9, 16, -5, 0));
        System.out.println(list);
        int lowest = 0;
        int lowestIndex = 0;
        int k = 0;

        while (k < 4) {
            lowest = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < lowest) {
                    lowest = list.get(i);
                    lowestIndex = i;
                }
            }
            System.out.println("наименьшее: " + lowest);
            if (k < 3) {
                list.remove(lowestIndex);
            }
            k++;
        }

        System.out.println(lowest);
    }
}
//есть еще вариант добавлять в новый список - попробовать (см. task24_2)
