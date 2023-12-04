package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task18_4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите кол-во вводимых значений");
        int countInput = console.nextInt();     //кол-во вводимых значений
        console = new Scanner(System.in);       //проинициализируем еще раз

        for (int i = 0; i <countInput ; i++) {
            System.out.println("Введите строку в формате: engWord - ruWord, ruWord");
            String str = console.nextLine();    //вызовем столько раз, сколько указали ранее
            str = str.toLowerCase();
            String[] arrayStr = str.split(" - ");

            map.put(arrayStr[0], arrayStr[1]);
        }

        System.out.println(map);
    }
}
