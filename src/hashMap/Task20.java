package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(Map.of(
                "яблоко", "apple",
                "авто", "car"
        ));
        System.out.println("Введите слово:");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        console = new Scanner(System.in);

        while (!str.contains("!EXIT!")) {
            if (map.containsKey(str)) {
                System.out.println(map.get(str));
            } else {
                System.out.println("слова нет в словаре, введите перевод:");
                map.put(str, console.nextLine());
                System.out.println("слово добавлено в словарь");
            }

            System.out.println();
            System.out.println("Введите слово:");
            str = console.nextLine();
        }

        System.out.println();
        System.out.println(map);
    }
}
