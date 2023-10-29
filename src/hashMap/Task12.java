package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int max = 0;
        int min = Integer.MAX_VALUE;

        String[] arrayString = str.split(" ");        //разобъем по пробелам

        for (String s : arrayString) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
            if (map.get(s) < min) min = map.get(s);         //найдем минимум
            if (map.get(s) > max) max = map.get(s);         //найдем максимум
        }

        System.out.println(map);
        System.out.println("min:"+ min + ", max:" + max);

        for (String s : map.keySet()) {
            if (map.get(s) != min && map.get(s) != max) {
                System.out.println(s);
                break;
            }
        }
    }
}
