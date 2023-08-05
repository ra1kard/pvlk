package string;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str1 = console.nextLine();
        char[] chArray1 = str1.toCharArray();
        String str2 = null;

        for (int i = 0; i < chArray1.length; i++) {
            if (chArray1[i] == 42) {                    //если попали на символ
                int j = 1;
                int count = 1;
                while (chArray1[i+j] == 42) {           //посчитаем сколько у нас подряд символов = 42
                    j++;
                    count++;                            //счетчик символов подряд
                }
                i += count + (count-1);                 //затем плюсуем кол-во звездочек и кол-во пропускаемы букв
            } else {
                if (str2 == null) {
                    str2 = String.valueOf(chArray1[i]);
                } else {
                    str2 += chArray1[i];
                }
            }
        }

        System.out.println(str2);
    }
}
