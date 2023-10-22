package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < 11; i++) {
            map.put(i, i*i*i);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
