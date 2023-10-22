package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(Map.of(
                1, 200,
                2, 15,
                3, 25,
                4, 100,
                5, 10)
        );
        int sum = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }

        System.out.println(sum);
    }
}
