package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>(List.of("Петров", "Иванов", "Сидоров"));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(5, 4, 3));

        for (int i = 0; i < list1.size(); i++) {
            map.put(list1.get(i), list2.get(i));
        }

        System.out.println(map);
    }
}
