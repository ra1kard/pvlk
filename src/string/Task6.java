package string;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int k = console.nextInt();

        if (k > str.length()-1) {
            System.out.println("Некорректный номер");
        } else {
            System.out.print(str.substring(0, k));
            System.out.println(str.substring(k+1));
        }
    }
}
