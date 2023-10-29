package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task4_2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(Map.of(
                1, 200,
                2, 15,
                3, 25,
                4, 100,
                5, 10)
        );
        int sum = 0;

        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println(sum);
    }
}
