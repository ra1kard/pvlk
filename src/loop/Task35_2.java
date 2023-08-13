package loop;

import java.util.Scanner;

public class Task35_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int x1 = 0;
        int x2 = 1;
        int rsl = 0;
        int i = 0;
        System.out.print(x1 + " ");
        System.out.print(x2 + " ");
        while (rsl < n) {
            rsl = x1 + x2;
            i++;
            System.out.print(rsl + " ");
            x1 = x2;
            x2 = rsl;
        }
        System.out.println();
        if (rsl == n) {
            switch (n) {
                case 0 -> System.out.println("Порядковый номер числа Фибоначчи = 1");
                case 1 -> System.out.println("Порядковый номер числа Фибоначчи = 2");
                default -> System.out.println("Порядковый номер числа Фибоначчи = " + (i + 2));
            }
        } else {
            System.out.println(n + " не является числом Фибоначчи");
        }
    }
}
