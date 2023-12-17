package method;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("123", "1234", "12345", "123456", "1234567"));
        System.out.println(listMoreLength5(list));
    }

    public static ArrayList<String> listMoreLength5(ArrayList<String> list) {
        ArrayList<String> listNew = new ArrayList<>();
        for (String s : list) {
            if (s.length() > 5) {
                listNew.add(s);
            }
        }
        return listNew;
    }
}
