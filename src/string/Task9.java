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
            newStr += (i % n == 0) ? "##": chArray[i];

            /*if (i % n == 0) {
                newStr += "##";
            } else {
                newStr += chArray[i];
            }*/
        }

        /*for (int i = 1; i < chArray.length; i++) {
            if (count < n) {
                newStr += chArray[i];
                count++;
            } else {
                newStr += "##";
                count = 1;
            }
        }*/

        str = newStr;
        System.out.println(str);
    }
}

//запись себе - сделай копии и смотри альтернативные решения