package loop;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int x1 = 0;
        int x2 = 1;
        int rsl;
        System.out.print(x1 + " ");
        System.out.print(x2 + " ");
        for (int i = 0; i < n-2; i++) {
            rsl = x1 + x2;
            System.out.print(rsl + " ");
            x1 = x2;
            x2 = rsl;
        }
    }
}
