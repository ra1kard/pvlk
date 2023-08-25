package loop;

import java.util.Scanner;

public class Task40_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int rsl = 0;
        for (int i = 1; i < n; i++) {
            //String str = (i == n-1) ? i + "*" + (i+1) : i + "*" + (i+1) + " + ";
            String str = i + "*" + (i+1) + ((i == n-1) ? "" : " + ");
            System.out.print(str);
            rsl += i * (i+1);
        }
        System.out.println(" = " + rsl);
    }
}
