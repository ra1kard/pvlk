package loop;

import java.util.Scanner;

public class Task68 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        String strX = String.valueOf(x);
        char[] arrayX = strX.toCharArray();
        int rsl = 0;

        for (char ch : arrayX) {
            int num = Character.getNumericValue(ch);
            rsl += num * num * num;
            System.out.println("num = " + num);
            System.out.println("в цикле rsl = " + rsl);
            System.out.println();
        }

        if (x == rsl) {
            System.out.println("Число Армстронга");
        } else {
            System.out.println("Не число Армстронга");
        }
    }
}
//решение без массива попробовать (циклы, переменные, if)