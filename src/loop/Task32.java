package loop;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        String x = null;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                x = "1";
            } else {
                x += 0;
            }
        }
        System.out.println(x);
    }
}
