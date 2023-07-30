package loop;

import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        String strX = String.valueOf(x);
        char[] arrayX = strX.toCharArray();

        for (int i = 6; i < 9; i++) {
            System.out.print(arrayX[i]);
        }
        System.out.print(" ");

        for (int i = 3; i < 6; i++) {
            System.out.print(arrayX[i]);
        }
        System.out.print(" ");

        for (int i = 0; i < 3; i++) {
            System.out.print(arrayX[i]);
        }
    }
}
