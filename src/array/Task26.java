package array;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner consoleStart = new Scanner(System.in);
        Scanner consoleEnd = new Scanner(System.in);
        int start = consoleStart.nextInt();
        int end = consoleEnd.nextInt();
        int count = 0;

        //надо вычислить длину массива если учесть, что еще есть 0 и -, через цикл с пом. счетчика
        for (int i = start; i <= end; i++) {
            count++;
        }

        //зафиксируем размер массива (это если не используем динамический размер)
        int[] array = new int[count];

        //числа от start до end занести в массив
        for (int i = 0; i < array.length; i++) {
            array[i] = start++;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
//посчитать длину без первого цикла
//end - start + 1 (- - два минуса дают плюс)
