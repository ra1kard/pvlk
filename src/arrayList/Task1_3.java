package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task1_3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Трое", "в", "лодке", "не", "считая", "собаки"));
        System.out.println(list);
        for (String s : list) {
            if (s.length() > 5) {
                System.out.println(s);
            }
        }
    }
}
