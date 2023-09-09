package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(100, 10, 200, 30, 1));
        int maxIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= 10 && list.get(i) <= 99) {
                maxIndex = i;
                break;
            }
        }

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) >= 10 && list.get(i) <= 99) {
                maxIndex = list.get(i) > list.get(maxIndex) ? i : maxIndex;
            }
        }
        System.out.println("Максимальное двухзначное число - " + list.get(maxIndex));
    }
}
