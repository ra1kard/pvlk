package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 10, 20, 77, 89, 96, 5, 14, 13, 20, 17, 10));
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 3, 5, 1));
        int tempValue;

        for (int i = 0; i < list.size(); i++) {
            //возьмем i, извлечем её во временную переменную tempValue
            tempValue = list.get(i);
            list.remove(i);

            //проверим извлеченное значение на contains
            while (list.contains(tempValue)) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == tempValue) {
                        System.out.println("удалим " + list.get(j));
                        list.remove(j);
                    }
                }
            }
            list.add(i, tempValue);
        }

        System.out.println(list);
    }
}
//лучше использоваьб отдельную коллекция для рез-та
