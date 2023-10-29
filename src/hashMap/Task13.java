package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task13 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>(Map.of(
                "Ivan Ivanov", 28,
                "Petr Petrov", 54,
                "Klim Smirnov", 20,
                "Sergey Bulkin", 34,
                "Maria Baskakova", 25,
                "Ksenia Nekrasova", 14,
                "Ivan Galkin", 28)
        );
        HashMap<String, Integer> map2 = new HashMap<>(Map.of(
                "Ivan Ivanov", 28,
                "Anna Kapystina", 25,
                "Robert Volya", 10,
                "Marina Gorshakova", 26,
                "Maria Baskakova", 25,
                "Ksenia Nekrasova", 39,
                "Zoya Pervova", 16)
        );
        HashMap<String, Integer> map3 = new HashMap<>();

        for (Map.Entry<String, Integer> entry1 : map1.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
                if (entry1.equals(entry2)) {
                    map3.put(entry1.getKey(), entry1.getValue());       //отправим уникальные в мап3
                }
            }
        }
        System.out.println(map3);

        for (Map.Entry<String, Integer> entry : map3.entrySet()) {
            map1.remove(entry.getKey());
            map2.remove(entry.getKey());
        }

        System.out.println(map1);
        System.out.println(map2);
    }
}
