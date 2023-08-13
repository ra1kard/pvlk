package loop;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        String x = "1";
        for (int i = 1; i < n; i++) {
            x += "0";
        }
        System.out.println(x);
    }
}

// подумать: на выходе должно быть число, а не строка (без строк, без parseint)
