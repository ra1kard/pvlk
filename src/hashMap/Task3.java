package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        //int n = console.nextInt();    //почему первый элемент не заполняется не пойму, буд-то сливается со след чтением строки

        for (int i = 1; i < 5; i++) {   //тут вместо 5 должен быть n
            String str = console.nextLine();
            map.put(i, str);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
