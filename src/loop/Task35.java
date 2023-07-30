package loop;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int x1 = 0;
        int x2 = 1;
        int rsl = 0;
        int i = 0;
        boolean fibo = true;
        System.out.print(x1 + " ");
        System.out.print(x2 + " ");
        while (rsl != n) {
            rsl = x1 + x2;
            if (rsl > n) {
                //напр 232, лучше указывать ошибку наглядно, что след число Фибо 233, но не стал тратить время
                System.out.println();
                System.out.println(n + " не является числом Фибоначчи");
                fibo = false;
                break;
            }
            i++;
            System.out.print(rsl + " ");
            x1 = x2;
            x2 = rsl;
        }
        if (fibo && n == 0) {
            System.out.println();
            System.out.println("Порядковый номер числа Фибоначчи = 1");
        } else if (fibo && n == 1) {
            System.out.println();
            System.out.println("Порядковый номер числа Фибоначчи = 2");
        } else if (fibo) {
            System.out.println();
            System.out.println("Подрядковый номер числа Фибоначчи = " + (i+2));
        }
    }
}
