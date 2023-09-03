package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(100, 20, 3));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10));
        //ArrayList<Integer> list = new ArrayList<>(List.of(20, 20));
        int maxOrder = 0;
        int minOrder = 0;

        for (int i = 0; i < list.size()-1; i++) {
            maxOrder = list.get(i+1) > list.get(maxOrder) ? i+1 : maxOrder;
            minOrder = list.get(i+1) <= list.get(minOrder) ? i+1 : minOrder;
        }

        System.out.println("Минимальный элемент: " + list.get(minOrder));
        System.out.println("Максимальный элемент: " + list.get(maxOrder));
    }
}
