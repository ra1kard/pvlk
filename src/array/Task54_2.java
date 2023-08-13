package array;

public class Task54_2 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {50, 40, 30, 20, 10};

        //int[] array1 = {27, 39, 42};
        //int[] array2 = {-8, 14, 0, 75};

        //int[] array1 = {2, 5, -9, 100, -10, 8};
        //int[] array2 = {-2, 15, 7, 7};

        //int[] array1 = {10, 20, 30, 40, 50};
        //int[] array2 = {60, 70};

        int[] array3 = new int[array1.length + array2.length];
        double sum = 0;
        int max = array1[0];

        for (int i = 0; i < array3.length; i++) {
            array3[i] = i < array1.length ? array1[i] : array2[i - (array1.length)];
            sum += array3[i];
            if (array3[i] > max) {
                max = array3[i];
            }
        }

        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum / array3.length);    //среднее арифметическое
        System.out.println(max);

        if (array3.length % 2 == 0) {
            System.out.println((array3[array3.length/2 - 1] + array3[array3.length/2]) / 2);
        } else {
            System.out.println(array3[array3.length/2]);
        }
    }
}
