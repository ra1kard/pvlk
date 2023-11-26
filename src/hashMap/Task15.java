package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        map.put("Иванов", new ArrayList<>(List.of(3, 3, 3, 3)));
        map.put("Астафьев", new ArrayList<>(List.of(4, 4, 4, 4)));
        map.put("Любова", new ArrayList<>(List.of(5, 5, 5, 3)));
        map.put("Рассказова", new ArrayList<>(List.of(2, 2, 2, 3)));

        System.out.println(map);
    }
}
