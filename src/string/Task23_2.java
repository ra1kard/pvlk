package string;

import java.util.Scanner;

public class Task23_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str1 = console.nextLine();
        char[] chArray = str1.toCharArray();
        int count = 0;
        String str2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if (chArray[i] == '*') {
                count++;
            } else if (count != 0) {
                i += count - 1;
                count = 0;
            } else {
                str2 += String.valueOf(chArray[i]);
            }
        }
        System.out.println(str2);
    }
}
