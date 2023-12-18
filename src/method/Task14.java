package method;

import java.util.ArrayList;
import java.util.List;

public class Task14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 0, 15, 20, 4, 0, 15, 0, 9, 0, 1));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(15, 27, 9, 0, 14, 6, 28, -7, 0));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(15, 27, 9, 0, 14, 6, 28, -7));
        System.out.println(myMethod(list));
        System.out.println(myMethod(list2));
        System.out.println(myMethod(list3));
    }

    public static int myMethod(ArrayList<Integer> list) {
        int rsl = 0;
        int countNull = 0;
        for (Integer n : list) {
            if (n == 0) {
                countNull++;
            } else if (countNull == 1) {
                rsl += n;
            } else if (countNull == 2) {
                break;
            }
        }
        return (countNull == 2) ? rsl : 0;
    }
}
