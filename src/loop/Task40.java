package loop;

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int x = 1;
        int y = 2;
        int rsl = 0;
        while (y < n || y == n) {
            if (y != n) {
                System.out.print(x + "*" + y + " + ");
            } else {
                System.out.print(x + "*" + y);
            }
            rsl += x * y;
            x++;
            y++;
        }
        System.out.println(" = " + rsl);
    }
}
//решение через for (сравнить 2 решения)
