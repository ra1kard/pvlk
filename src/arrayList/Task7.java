package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        int x = 0;

        while (x != -1) {
            x = console.nextInt();
            if (x != -1) {
                list.add(x);
            }
        }
        System.out.println(list);
        System.out.println(list.size() + " - list.size");

        if (list.size() % 2 == 0) {
            list.add(list.size()/2, 123);
        } else {
            list.add(list.size()/2, 123);
            list.add(list.size()/2+1, 123);
        }

        System.out.println(list);
    }
}
