package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task8 {
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

        //сравниваем
        for (String value : arrayString) {
            for (String s : arrayString) {
                if (value.equalsIgnoreCase(s)) {
                    count++;
                }
            }
            map.put(value, count);
            count = 0;
        }

        System.out.println(map);
    }
}
