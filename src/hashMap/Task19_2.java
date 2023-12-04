package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Task19_2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        System.out.println("Введите строку:");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        str = str.replace("{", "");
        str = str.replace("}", "");
        str = str.replace("'", "");
        System.out.println(str);
        System.out.println();

        String[] arrayStr = str.split(", ");
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println(arrayStr[i]);
        }

        for (int i = 0; i < arrayStr.length; i++) {
            String[] arrayStrTemp = arrayStr[i].split(" : ");
            map.put(arrayStrTemp[0], arrayStrTemp[1]);
        }

        System.out.println();
        System.out.println(map);
    }
}
