package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("один", "шестььь", "восемь"));
        String biggest = list.get(0);

        /*for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > biggest.length()) {
                biggest = list.get(i);
            }
        }*/
        for (String s : list) {
            if (s.length() > biggest.length()) {
                biggest = s;
            }
        }
        System.out.println(biggest);
    }
}
//лучшее решение из 4 вариантов