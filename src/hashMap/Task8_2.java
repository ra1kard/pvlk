package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task8_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int count = 0;

        //уберем запятые
        while (str.contains(",")) {
            int index = str.indexOf(",");
            str = str.substring(0, index) + str.substring(index+1);
        }

        //разобъем по пробелам
        String[] arrayString = str.split(" ");

        for (String s : arrayString) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
        }

        System.out.println(map);
    }
}
//map участвует в процессе непосредственно
