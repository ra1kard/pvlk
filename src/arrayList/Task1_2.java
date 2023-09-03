package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task1_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Трое", "в", "лодке", "не", "считая", "собаки"));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 5) {
                System.out.println(list.get(i));
            }
        }
    }
}
//это наиболее оптимальный вариант??? или 1_2??? потому что тут мы не переводим в String
