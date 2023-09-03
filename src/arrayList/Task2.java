package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("один", "шестььь", "восемь"));
        String Biggest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > Biggest.length()) {
                Biggest = list.get(i);
            }
        }
        System.out.println(Biggest);
    }
}
