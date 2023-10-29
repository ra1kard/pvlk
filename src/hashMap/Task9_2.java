package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task9_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String maxKey = "";
        int max = 0;

        //разобъем по пробелам
        String[] arrayString = str.split(" ");

        for (String k : arrayString) {          //добавляем в мапу ключ и значение (учитывая повторы)
            if (map.containsKey(k)) {
                map.put(k, map.get(k)+1);
            } else {
                map.put(k, 1);
            }
            if (map.get(k) > max) {             //ищем тут же максимальное value
                max = map.get(k);
            }
        }
        System.out.println(map);

        for (String s : map.keySet()) {         //перебираем ключи
            if (map.get(s) == max) {            //если значение по ключу = max
                maxKey = s;                     //то считаем максимальнымКлюч = s
                break;
            }
        }

        System.out.println(maxKey + ": " + map.get(maxKey));
    }
}
//map участвует в процессе непосредственно
