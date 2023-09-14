package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task12_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Молоко", "Зерно", "Мебель", "Ель"));
        //ArrayList<String> list = new ArrayList<>(List.of("Зельеварение", "Кирпич", "Медиана"));
        String str = "е";

        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            str2 = str2.replace(str, "_");
            list.set(i, str2);
        }

        System.out.println(list);
    }
}
