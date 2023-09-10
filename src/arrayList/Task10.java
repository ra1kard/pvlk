package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
          Дана коллекция строк.
          Пользователь вводит букву при помощи клавиатуры.
          Необходимо вычислить, сколько раз введенная буква встречается в коллекции
         */
        ArrayList<String> list = new ArrayList<>(List.of("Молоко", "Сметана", "Хлеб", "Оладьи", "Омлет"));
        Scanner console = new Scanner(System.in);
        String strUser = console.nextLine();
        strUser = strUser.toLowerCase();
        int count = 0;

        for (String s : list) {
            s = s.toLowerCase();
            if (s.contains(strUser)) {              //заходим в слово, если там встречается наша буква
                char[] chars = s.toCharArray();
                for (char aChar : chars) {
                    if (aChar == strUser.charAt(0)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
