package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Task20_2 {
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
            if (map.containsKey(str)) {             //если найдено в ключах - выведем значение
                System.out.println(map.get(str));
            } else if (map.containsValue(str)) {    //если найдено в значении - выведем ключ
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (Objects.equals(entry.getValue(), str)) {
                        System.out.println(entry.getKey());
                    }
                }
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
//доработка:    1. пользователь может ввести и русское и англ слово
//              2. переводы тоже заполняет
