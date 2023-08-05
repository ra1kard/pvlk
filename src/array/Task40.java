package array;

public class Task40 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7};
        //int[] array = {10, 2, 10, 17, 8, -5, 0};

        int[] arrayNew = new int[array.length];

        for (int i = 0; i < arrayNew.length; i++) {
            if (i == 0) {
                arrayNew[i] = array[array.length-1];
            } else {
                arrayNew[i] = array[i-1];
            }
        }

        //по заданию не нужно выводить, но для наглядности вывожу
        for (int i : arrayNew) {
            System.out.print(i + " ");
        }

    }
}
