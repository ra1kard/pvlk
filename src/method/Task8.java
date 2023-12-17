package method;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += keyboardInput("Введите число:");
        }
        System.out.println(sum);
    }

    public static int keyboardInput(String str) {
        Scanner console = new Scanner(System.in);
        System.out.println(str);
        return console.nextInt();
    }
}
