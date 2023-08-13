package array;

public class Task40_2 {
    public static void main(String[] args) {
        //int[] array = {1, 2, 3, 5, 7};
        int[] array = {10, 2, 10, 17, 8, -5, 0};
        int tempLast = array[array.length-1];

        for (int i = array.length-1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = tempLast;

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
