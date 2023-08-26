package loop;

import java.util.Scanner;

public class Task45_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();

        while (x > 0) {
            int value = x % 1000;
            x = x / 1000;
            System.out.print(value + " ");
        }
    }
}
