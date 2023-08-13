package loop;

import java.util.Scanner;

public class Task31_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int n = console.nextInt();
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x *= num;
        }
        System.out.println(x);
    }
}
