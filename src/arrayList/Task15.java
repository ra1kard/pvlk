package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Bob D", "Zoz", "Ror"));
        boolean smallWords = false;

        for (String str : list) {
            if (Character.isLowerCase(str.charAt(0))) {
                smallWords = true;
                System.out.println(str);
            }
        }

        if (!smallWords) {
            System.out.println("Все строки начинаются с заглавных букв");
        }
    }
}
