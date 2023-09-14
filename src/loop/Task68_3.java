package loop;

import java.util.Scanner;

public class Task68_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int i = x;
        int value;
        int rsl = 0;

        while (i > 0) {
            value = i % 10;
            i = i / 10;
            rsl += value * value * value;
        }

        System.out.println((x == rsl) ? "Число Армстронга" : "Не число Армстронга");
    }
}
