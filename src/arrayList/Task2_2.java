package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task2_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("один", "шестььь", "восемь"));
        String Biggest = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Biggest = list.get(i).length() > Biggest.length() ? list.get(i) : Biggest;
        }
        System.out.println(Biggest);
    }
}
