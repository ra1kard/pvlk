package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 200, 30, 1, 70, 2));
        int maxOrder = 0;
        int minOrder = 0;

        for (int i = 0; i < list.size()-1; i++) {
            maxOrder = list.get(i+1) > list.get(maxOrder) ? i+1 : maxOrder;
            minOrder = list.get(i+1) <= list.get(minOrder) ? i+1 : minOrder;
        }

        System.out.println("Номер максимального элемента: " + maxOrder);
        System.out.println("Номер минимального элемента: " + minOrder);
    }
}
