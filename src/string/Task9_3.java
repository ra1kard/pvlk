package string;

import java.util.Scanner;

public class Task9_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int n = console.nextInt();
        char[] chArray= str.toCharArray();
        String newStr = "##";

        for (int i = 1; i < chArray.length; i++) {
            newStr += (i % n == 0) ? "##": chArray[i];
        }

        str = newStr;
        System.out.println(str);
    }
}
