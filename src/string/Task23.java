package string;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str1 = console.nextLine();
        char[] chArray = str1.toCharArray();
        String str2 = null;

        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == '*') {                    //если попали на символ
                int j = 1;
                int count = 1;
                while (chArray[i+j] == '*') {           //посчитаем сколько у нас подряд символов = 42
                    j++;
                    count++;                            //счетчик символов подряд
                }
                i += count + (count-1);                 //затем плюсуем кол-во звездочек и кол-во пропускаемы букв
            } else {
                if (str2 == null) {
                    str2 = String.valueOf(chArray[i]);
                } else {
                    str2 += chArray[i];
                }
            }
        }

        System.out.println(str2);
    }
}
// вычислить, является ли последней звездой (сократит while)
