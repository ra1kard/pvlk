package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, -5, 17, 30, -100, 15, 2));
        //ArrayList<Integer> list = new ArrayList<>(List.of(15, 27, 9, 0, 14, 6, 28, -7, 0));
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60, 20));
        Scanner console = new Scanner(System.in);
        int userValue = console.nextInt();
        boolean isContains = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == userValue) {
                System.out.println(i);
                isContains = true;
                break;
            }
        }
        if (!isContains) {
            System.out.println(-1);
        }
    }
}
