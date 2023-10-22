package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 21; i++) {
            map.put(i, (i+1)*5);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
