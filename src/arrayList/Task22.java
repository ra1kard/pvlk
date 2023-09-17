package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, -5, 17, 30, -100, 15, 2));
        //ArrayList<Integer> list = new ArrayList<>(List.of(15, 27, 9, 0, 14, 6, 28, -7, 0));
        Scanner console = new Scanner(System.in);
        int valueUser = console.nextInt();
        int indexUser = console.nextInt();
        boolean rsl = false;

        if (list.contains(valueUser)) {     //проверим наличие значения в коллекции, чтобы даже не заходить если нет
            for (int i = indexUser; i < list.size(); i++) {     //если есть, отсчет с индекса юзера
                if (list.get(i) == valueUser) {
                    System.out.println(i);
                    rsl = true;
                    break;
                }
            }
        } if (!rsl) {
            System.out.println(-1);
        }
    }
}
