package string;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int n = console.nextInt();

        char[] chArray= str.toCharArray();
        chArray[n] = '@';
        System.out.println(String.valueOf(chArray));
    }
}
