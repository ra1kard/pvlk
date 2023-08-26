package loop;

import java.util.Scanner;

public class Task44_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        int sumX = 0;
        int sumY = 0;
        System.out.print("Числа " + x + " и " + y);

        while (x > 0) {
            int value = x % 10;
            x = x / 10;
            sumX += value;
        }

        while (y > 0) {
            int value = y % 10;
            y = y / 10;
            sumY += value;
        }

        System.out.println((sumX == sumY) ? " родственные" : " не родственные");
    }
}
