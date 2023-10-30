package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task16 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        ArrayList<Integer> list1 = new ArrayList<>(List.of(2, 2, 2));
        map.put("Иванов", list1);

        ArrayList<Integer> list2 = new ArrayList<>(List.of(3, 4, 5));
        map.put("Астафьев", list2);

        ArrayList<Integer> list3 = new ArrayList<>(List.of(2, 4, 5));
        map.put("Любова", list3);

        ArrayList<Integer> list4 = new ArrayList<>(List.of(3, 5, 5));
        map.put("Рассказова", list4);

        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            int average = 0;
            System.out.print(entry.getKey() + ": ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                average += entry.getValue().get(i);
            }
            System.out.println(average / entry.getValue().size());
        }
    }
}
//как добавить сразу лист со значениями в мапу? не разобрался
