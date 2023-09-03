package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task2_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("один", "шестььь", "восемь"));
        String biggest = list.get(0);

        for (String s : list) {
            biggest = s.length() > biggest.length() ? s : biggest;
        }
        System.out.println(biggest);
    }
}
