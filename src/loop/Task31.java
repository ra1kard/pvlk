package loop;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int n = console.nextInt();
        int x = num;
        if (n != 0) {
            for (int i = 1; i < n; i++) {
                x *= num;
            }
            System.out.println(x);
        } else {
            System.out.println(1);
        }
    }
}
//альтернативное решение показано в Task31_2, как можно сразу обойти 0