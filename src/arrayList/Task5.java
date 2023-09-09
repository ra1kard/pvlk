package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 200, 30, 1, 70, 2));
        int maxOrder = 0;
        int minOrder = 0;

        for (int i = 0; i < list.size(); i++) {
            maxOrder = list.get(i) > list.get(maxOrder) ? i : maxOrder;
            minOrder = list.get(i) <= list.get(minOrder) ? i : minOrder;
        }

        System.out.println("Номер максимального элемента: " + maxOrder);
        System.out.println("Номер минимального элемента: " + minOrder);
    }
}
