package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task18_3 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите кол-во вводимых значений");
        int countInput = console.nextInt();     //кол-во вводимых значений
        console = new Scanner(System.in);       //проинициализируем еще раз

        for (int i = 0; i < countInput; i++) {
            ArrayList<String> arrayValues = new ArrayList<>();
            System.out.println("Введите строку в формате: engWord - ruWord, ruWord");
            String str = console.nextLine();    //вызовем столько раз, сколько указали ранее
            str = str.replace(",", "");
            str = str.toLowerCase();
            String[] arrayStr = str.split(" ");

            //затем нулевой - положить в key, второй и далее - положить в value
            for (int j = 2; j < arrayStr.length; j++) {
                arrayValues.add(arrayStr[j]);
            }
            map.put(arrayStr[0], arrayValues);
        }

        System.out.println(map);
    }
}

// реализуем не делая проверки
// далее в следующем варианте попробовать проще взять: пробел тире пробел и сплитовать
