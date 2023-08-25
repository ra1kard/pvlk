package string;

import java.util.Scanner;

public class Task8_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int n = console.nextInt();
        char[] chArray= str.toCharArray();

        for (int i = 0; i < chArray.length; i++) {
            if (i % n == 0) chArray[i] = '#';
        }

        System.out.println(String.valueOf(chArray));
    }
}
