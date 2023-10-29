package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        console = new Scanner(System.in);       //проинициализирован еще раз, т.к. есть баг в Сканнере
        for (int i = 1; i < n; i++) {
            map.put(i, console.nextLine());
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
