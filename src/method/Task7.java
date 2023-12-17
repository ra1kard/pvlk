package method;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(arithmeticAverage(new ArrayList<>(List.of(10, 25, 666, 14))));
        System.out.println(arithmeticAverage(new ArrayList<>(List.of(4, 28, 19))));
        System.out.println(arithmeticAverage(new ArrayList<>(List.of(1, 2, 3, 4, 5))));
    }

    public static double arithmeticAverage(ArrayList<Integer> list) {
        double rsl = 0;
        for (Integer s : list) {
            rsl += s;
        }
        return rsl/list.size();
    }
}
