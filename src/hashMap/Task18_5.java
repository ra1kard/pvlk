package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Task18_5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите кол-во вводимых значений");
        int countInput = console.nextInt();     //кол-во вводимых значений
        console = new Scanner(System.in);       //проинициализируем еще раз

        for (int i = 0; i <countInput ; i++) {
            System.out.println("Введите строку в формате: engWord - ruWord, ruWord");
            String str = console.nextLine();    //вызовем столько раз, сколько указали ранее
            str = str.toLowerCase();
            String[] arrayStr = str.split(" - ");
            String[] arrayStrValue = arrayStr[1].split(",");
            ArrayList<String> arrayValues = new ArrayList<>(List.of(arrayStrValue));

            map.put(arrayStr[0], arrayValues);
        }

        System.out.println(map);
    }
}
