package loop;

import java.util.Scanner;

public class Task68_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        String strX = String.valueOf(x);
        int rsl = 0;

        for (int i = 0; i < 3; i++) {
            char ch = strX.charAt(i);
            rsl += Character.getNumericValue(ch) * Character.getNumericValue(ch) * Character.getNumericValue(ch);
        }

        String answer = (x == rsl) ? "Число Армстронга" : "Не число Армстронга";
        System.out.println(answer);

        //String str = "Какая то строка";
        //System.out.println(str.charAt(0));

        //я знаю как из строки в символ и символ в инт,
        //а сразу из строки в инт можно? не пойму... не нашел

    }
}
//не исп символы, не исп строки
//дело в оптимальности