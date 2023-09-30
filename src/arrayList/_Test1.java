package arrayList;

import java.util.ArrayList;

public class _Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(35);
        list.add(-8);
        System.out.println(list);
        System.out.println(list.size());
        list.add(2, 666);
        System.out.println(list);
        list.set(0, 555);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));
        System.out.println(list.contains(-8));
    }
}
