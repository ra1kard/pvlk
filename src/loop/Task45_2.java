package loop;

import java.util.Scanner;

public class Task45_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        String strX = String.valueOf(x);
        char[] arrayX = strX.toCharArray();
        int i = 0;
        int k = 6;

        while (i < 3) {
            if (i == 0) {
                System.out.print(arrayX[k] + "" + arrayX[k+1]); //доделать
                System.out.print(arrayX[k+2] + " ");
                k -= 3;
            } else if (i == 1) {
                System.out.print(arrayX[k]);
                System.out.print(arrayX[k+1]);
                System.out.print(arrayX[k+2] + " ");
                k -= 3;
            } else {
                System.out.print(arrayX[k]);
                System.out.print(arrayX[k+1]);
                System.out.print(arrayX[k+2] + " ");
            }
            i++;
        }
    }
}
//решение без символов и без строк (воспользоваться остатком от деления, также остается while)
