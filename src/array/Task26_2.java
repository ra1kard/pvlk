package array;

import java.util.Scanner;

public class Task26_2 {
    public static void main(String[] args) {
        Scanner consoleStart = new Scanner(System.in);
        Scanner consoleEnd = new Scanner(System.in);
        int start = consoleStart.nextInt();
        int end = consoleEnd.nextInt();

        int[] array = new int[end - start + 1];

        //числа от start до end занести в массив
        for (int i = 0; i < array.length; i++) {
            array[i] = start++;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
