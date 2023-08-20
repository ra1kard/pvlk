package loop;

import java.util.Scanner;

public class Task40_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int x = 1;
        int y = 2;
        int rsl = 0;
        for (int i = 2; i <= n ; i++) {
            System.out.print(x + "*" + y + " + ");
            rsl += x * y;
            x++;
            y++;
        }
        System.out.println(x + "*" + y + " = "  + rsl);
    }
}
