package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task29 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(114, 10));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(-8, -6, 0, 0, 7, -29));
        ArrayList<List> list = new ArrayList<>(List.of(list1, list2, list3));       //подсвечивает почему? необработанное использование - это далее будем разбирать?
        ArrayList<Integer> listNew = new ArrayList<>();

        /*System.out.println(list + " - пробуем печать всего");   //печать
        System.out.println();


        for (int i = 0; i < list.size(); i++) {                 //печать через цикл
            System.out.println(list.get(i));
        }
        System.out.println();


        for (int i = 0; i < list.size(); i++) {                 //печать через цикл по элементам
            ArrayList<Integer> listTemp = new ArrayList<>(list.get(i));
            for (int j = 0; j < listTemp.size(); j++) {
                System.out.print(listTemp.get(j) + " ");
            }
            System.out.println();
        }*/

        for (List i : list) {                                                       //подсвечивает почему?
            int rslAverage = 0;
            int count = 0;
            ArrayList<Integer> listTemp = new ArrayList<>(i);                       //подсвечивает почему?
            for (Integer j : listTemp) {                            //а тут я могу и int и Integer указать ведь?
                rslAverage += j;
                count++;
            }
            listNew.add(rslAverage / count);
        }

        System.out.println(listNew);
    }
}
