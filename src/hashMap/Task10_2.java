package hashMap;

import java.util.HashMap;

public class Task10_2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "клаксон";
        //String str = "молоко";
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
//map участвует в процессе непосредственно
