package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 17, 50, 60,-8));
        ArrayList<Integer> sublist = new ArrayList<>(list.subList(3, 6));
        System.out.println(sublist);
    }
}
