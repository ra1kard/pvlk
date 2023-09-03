package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(100, 20, 3));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10));
        //ArrayList<Integer> list = new ArrayList<>(List.of(20, 20));
        int longOrder = 0;
        int shortOrder = 0;

        for (int i = 0; i < list.size()-1; i++) {
            longOrder = list.get(i+1) > list.get(longOrder) ? i+1 : longOrder;
            shortOrder = list.get(i+1) <= list.get(shortOrder) ? i+1 : shortOrder;
        }

        System.out.println("Минимальный элемент: " + list.get(shortOrder));
        System.out.println("Максимальный элемент: " + list.get(longOrder));
    }
}
