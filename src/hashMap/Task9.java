package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String biggestKey = "";
        int biggest = 0;
        int count = 0;

        //разобъем по пробелам
        String[] arrayString = str.split(" ");

        for (String value : arrayString) {
            for (String s : arrayString) {
                if (value.equalsIgnoreCase(s)) {
                    count++;
                }
            }
            map.put(value, count);
            count = 0;
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > biggest) {
                biggest = entry.getValue();
                biggestKey = entry.getKey();
            }
        }

        System.out.println(biggestKey + ": " + map.get(biggestKey));
    }
}
