package method;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 25, 666, 14));
        System.out.println(list);
        int max = max(list);
        System.out.println(max);
        System.out.println(list);
    }

    public static int max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer number : list) {
            if (number > max) {
                max = number;
            }
        }
        list.remove((Integer) 666);       //можно удалить в функции, можно удалить и в main
        return max;
    }
}
