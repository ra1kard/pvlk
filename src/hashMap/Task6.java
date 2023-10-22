package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(Map.of(
                1, "Привет",
                2, ",",
                3, "сегодня солнечно",
                4, "завтра",
                5, "будет",
                6, "еще",
                7, "жарче")
        );

        String str1 = map.get(1) + map.get(2) + " " + map.get(3);
        String str2 = map.get(4) + " " + map.get(5) + " " + map.get(6) + " " + map.get(7);
        String str3 = str1 + " " + str2;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
