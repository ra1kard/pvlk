package array;

public class Task37 {
    public static void main(String[] args) {
        int[] array = {55, 67, 10, 4, 10, 66, 7, 30, 5, 20, 20};
        //int[] array = {10, 35, 34, 6, 7, 8, 99, 10, 100};
        //int[] array = {1, 2, 3, 4, 5, 6, 7};
        boolean max = false;

        //идем по массиву с единицы и не доходя до последнего элемента
        for (int i = 1; i < (array.length - 1); i++) {
            if (array[i] > array[i-1] && array[i] > array[i+1]) {
                System.out.print(array[i] + " ");
                max = true;
            }
        }

        if (!max) {
            System.out.println("Локальные максимумы отсутствуют");
        }
    }
}
