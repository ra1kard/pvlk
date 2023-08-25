package loop;

import java.util.Scanner;

public class Task44_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        String strX = String.valueOf(x);
        String strY = String.valueOf(y);
        int sumX = 0;
        int sumY = 0;

        for (int i = 0; i < strX.length(); i++) {
            char ch = strX.charAt(i);
            sumX += Character.getNumericValue(ch);      //можно здесь сократить, но мне так пока читабельнее
        }
        for (int i = 0; i < strY.length(); i++) {
            char ch = strY.charAt(i);
            sumY += Character.getNumericValue(ch);
        }

        String rsl = (sumX == sumY) ? " родственные" : " не родственные";
        System.out.println("Числа " + x + " и " + y + rsl);
    }
}
//попробовать решить без исп строк (не переводить в стрингу и символов (без char)
