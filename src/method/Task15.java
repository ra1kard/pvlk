package method;

import java.util.ArrayList;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 1, 2, 3));  // 4, 5, 6, 7 - уник
        ArrayList<Integer> list2 = new ArrayList<>(List.of(               6, 7, 8, 8, 9));  // 6, 7, 9    - уник
        myMethod(list1, list2);
    }

    public static ArrayList<Integer> myMethod(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> listTemp = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // 1. пробежаться вычислить уникальные в list1 = 4, 5, 6, 7         //работа с list1 -> listTemp
        for (Integer value : list1) {
            int count = 0;
            for (Integer l1 : list1) {
                if (value.equals(l1)) count++;
                if (count > 1) break;
            }
            if (count == 1) listTemp.add(value);
        }
        System.out.println(listTemp);

        // 2. проверим наличие уникальных listTemp в list2 = 4, 5           //-> list3
        for (Integer temp : listTemp) {
            int count = 0;
            for (Integer l2 : list2) {
                if (temp.equals(l2)) count++;
                if (count > 0) break;
            }
            if (count == 0) list3.add(temp);
        }
        System.out.println(list3 + " - list3");

        // 3. пробежаться вычислить уникальные в list2 = 6, 7, 9            //работа с list2 -> listTemp
        listTemp.clear();
        for (Integer value : list2) {
            int count = 0;
            for (Integer l2 : list2) {
                if (value.equals(l2)) count++;
                if (count > 1) break;
            }
            if (count == 1) listTemp.add(value);
        }
        System.out.println(listTemp);

        // 4. проверим наличие уникальных listTemp в list1 = 9              //-> list3 (4, 5, 9)
        for (Integer temp : listTemp) {
            int count = 0;
            for (Integer l1 : list1) {
                if (temp.equals(l1)) count++;
                if (count > 0) break;
            }
            if (count == 0) list3.add(temp);
        }
        System.out.println(list3 + " - list3");

        return list3;
    }
}
