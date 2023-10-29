package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task14 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>(Map.of(
                "Иванов", 280000,
                "Петров", 54000,
                "Смирнов", 105000,
                "Галкин", 38560)
        );

        TreeMap<String, Integer> map2 = new TreeMap<>(map1);
        System.out.println(map2);
    }
}
