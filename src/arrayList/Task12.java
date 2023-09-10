package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Молоко", "Зерно", "Мебель", "Ель"));
        //ArrayList<String> list = new ArrayList<>(List.of("Зельеварение", "Кирпич", "Медиана"));
        String str = "е";

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).toLowerCase();
            if (s.contains(str)) {
                char[] chars = s.toCharArray();             //string перевели в массив символов
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] == str.charAt(0)) {
                        chars[j] = '_';
                        break;
                    }
                }
                s = String.valueOf(chars);                  //обратно массив символов в string
            }
            list.set(i, s);
        }

        System.out.println(list);
    }
}
