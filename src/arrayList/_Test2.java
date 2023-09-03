package arrayList;

import java.util.ArrayList;

public class _Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(35);
        list.add(-8);
        list.add(-8);
        System.out.println(list);
        System.out.println(list.indexOf(35));
        System.out.println(list.lastIndexOf(-8));
        list.remove(0);
        list.remove((Integer) 20);
        System.out.println(list);
    }
}
