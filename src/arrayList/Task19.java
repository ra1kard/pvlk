package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 0, 9100, 500, 6000, 1522, 14));
        //ArrayList<Integer> list = new ArrayList<>(List.of(15, 27, 9, 0, 14, 6, 28, -7, 0));
        //ArrayList<Integer> list = new ArrayList<>(List.of(1500, 9600, 7000, 14142));
        //ArrayList<Integer> list = new ArrayList<>(List.of(9100, 990));

        for (int i = 0; i < list.size(); i++) {
            int countFour = 0;
            int x = list.get(i);
            while (x > 0) {
                x = x / 10;
                countFour++;
            }
            if (countFour < 4) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }
}
