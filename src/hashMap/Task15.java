package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        ArrayList<Integer> list1 = new ArrayList<>(List.of(3, 3, 3, 3));
        map.put("Иванов", list1);

        ArrayList<Integer> list2 = new ArrayList<>(List.of(4, 4, 4, 4));
        map.put("Астафьев", list2);

        ArrayList<Integer> list3 = new ArrayList<>(List.of(5, 5, 5, 3));
        map.put("Любова", list3);

        ArrayList<Integer> list4 = new ArrayList<>(List.of(2, 2, 2, 3));
        map.put("Рассказова", list4);

        System.out.println(map);
    }
}
//list.add(3,1)
//list.set(3, 5);

//почему я не могу добавить так:
//map.put("Астафьев", 3 3 3 3);  ?  или что-то похожее на это, т.е. сразу лист значений
//потому что инициализировать надо? ок, мб инициализировать 1раз и затем переиспользовать?
//было 5555, установить 4444, но не понял как...
