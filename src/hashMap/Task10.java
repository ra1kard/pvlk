package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Task10 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //String str = "клаксон";
        String str = "молоко";
        char[] charArray = str.toCharArray();
        int count = 0;

        for (char value : charArray) {
            for (char c : charArray) {
                if (value == c) {
                    count++;
                }
            }
            map.put(String.valueOf(value), count);
            count = 0;
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
