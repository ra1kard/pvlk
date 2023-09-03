package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task2_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("один", "шесть", "восемь"));
        int longOrder = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            longOrder = list.get(i+1).length() > list.get(longOrder).length() ? i+1 : longOrder;
        }
        System.out.println(list.get(longOrder));
    }
}
