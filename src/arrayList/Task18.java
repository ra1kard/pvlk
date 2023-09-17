package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int z = console.nextInt();

        for (int i = 1; i <= n; i++) {
            list.add(i);
            for (int j = 0; j < z; j++) {
                if (i != n) {
                    list.add(0);
                }
            }
        }

        System.out.println(list);
    }
}
