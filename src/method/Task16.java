package method;

import java.util.ArrayList;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(myMethod(10));
        System.out.println(myMethod(25));
        System.out.println(myMethod(30));
        System.out.println(myMethod(1));
        System.out.println(myMethod(13));
    }

    public static ArrayList<Integer> myMethod(int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
