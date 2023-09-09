package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(100, 20, 300));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10));
        //ArrayList<Integer> list = new ArrayList<>(List.of(20, 20));
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            maxIndex = list.get(i) > list.get(maxIndex) ? i : maxIndex;
            minIndex = list.get(i) <= list.get(minIndex) ? i : minIndex;
        }

        System.out.println("Минимальный элемент: " + list.get(minIndex));
        System.out.println("Максимальный элемент: " + list.get(maxIndex));
    }
}
