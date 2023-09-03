package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task2_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("один", "шестььь", "восемь"));
        String Biggest = list.get(0);

        for (String s : list) {
            Biggest = s.length() > Biggest.length() ? s : Biggest;
        }
        System.out.println(Biggest);
    }
}
