package array;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {10, 15, 28, 4, 11, 5};
        //int[] array = {15, 10, 15, 20, 0, 88, -8, 16};
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int rsl = 0;
        for (int i = array.length-1; i > ((array.length-1) - x); i--) {
            rsl += array[i];
            System.out.println(rsl);
        }
        System.out.println("Ответ: " + rsl);
    }
}
