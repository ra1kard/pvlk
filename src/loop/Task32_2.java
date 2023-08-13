package loop;

import java.util.Scanner;

public class Task32_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int x = 1;

        for (int i = 1; i < n; i++) {
            x *= 10;
        }
        System.out.println(x);
    }
}
