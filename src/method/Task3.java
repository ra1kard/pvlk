package method;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 25, 666, 14));
        //ArrayList<Integer> list = new ArrayList<>(List.of(4, 28, 17));
        //ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 1, 3));
        //ArrayList<Integer> list = new ArrayList<>(List.of(667, 666));
        System.out.println(maxSumNumbers(list) + " - число, сумма цифр которого максимальна");
    }

    public static int maxSumNumbers(ArrayList<Integer> list) {
        int max = Task2.sumNumbers(list.get(0));
        int maxNumber = list.get(0);
        for (Integer number : list) {
            if (Task2.sumNumbers(number) > max) {
                max = Task2.sumNumbers(number);
                maxNumber = number;
            }
        }
        return maxNumber;
    }
}
