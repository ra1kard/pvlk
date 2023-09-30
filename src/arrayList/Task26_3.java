package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task26_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 8, 3, 5, 7, 8));
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 15, 6, -8, 41, 9, 16, -5, 0));
        //ArrayList<Integer> list = new ArrayList<>(List.of(7, 1, 3, 3, 5));
        ArrayList<Integer> list2 = new ArrayList<>(list);
        ArrayList<Integer> list3 = new ArrayList<>();
        System.out.println(list2 + " - исходный лист");

        for (int i = 0; i < list2.size(); i++) {
            int lowest = Integer.MAX_VALUE;
            int temp = list2.get(i);
            int lowestIndex = 0;
            for (int j = i; j < list2.size(); j++) {
                if (list2.get(j) < lowest) {
                    lowest = list2.get(j);
                    lowestIndex = j;
                }
            }
            list2.set(i, lowest);
            list2.set(lowestIndex, temp);
        }

        for (int i = list2.size()-1; i >= 0; i--) {
            list3.add(list2.get(i));
        }

        System.out.println(list2);
        System.out.println(list3);
    }
}

//как я подумал и решил: раз мне надо учесть еще дубли
//ну а что я хочу упороться именно сразу из лист1 -> в лист2 с сортировкой кинуть все и дубли тоже, тяжко
//могу ведь просто из лист1 в лист2 без сортировки закинуть, а затем сортировать все в листе2
