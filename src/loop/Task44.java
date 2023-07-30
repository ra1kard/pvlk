package loop;

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        String strX = String.valueOf(x);
        String strY = String.valueOf(y);
        char[] arrayX = strX.toCharArray();
        char[] arrayY = strY.toCharArray();
        int sumX = 0;
        int sumY = 0;

        for (int i = 0; i < strX.length(); i++) {   //а это норм что пробелом разделяю где-то логически? илиСплошн надо?
            sumX += arrayX[i];
        }
        for (int i = 0; i < strY.length(); i++) {
            sumY += arrayY[i];
        }

        System.out.println("sumX = " + sumX);
        System.out.println("sumY = " + sumY);
        if (sumX == sumY) {
            System.out.println("Числа " + x + " и " + y + " родственные");
        } else {
            System.out.println("Числа " + x + " и " + y + " не родственные");
        }
    }
}
