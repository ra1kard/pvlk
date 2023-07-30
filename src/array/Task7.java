package array;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {10, 15, 28, 4, 11, 5};
        //int[] array = {15, 17, 19, 20};

        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
