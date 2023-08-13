package string;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int n = console.nextInt();
        char[] chArray= str.toCharArray();
        String newStr = "##";
        int count = 1;

        for (int i = 1; i < chArray.length; i++) {
            if (count < n) {
                newStr += chArray[i];
                count++;
            } else {
                newStr += "##";
                count = 1;
            }
        }

        System.out.println(newStr);
    }
}
