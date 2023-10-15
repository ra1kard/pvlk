package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task5_2 {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<>(Arrays.asList("Germany", "France", "Italy", "Belgium", "Japan"));
        System.out.println(states);
        String lastValue;

        //выведите, а затем удалите последний элемент
        List<String> list = new ArrayList<>(states);
        System.out.println(list.get(list.size()-1));    //вывод последнего
        lastValue = list.get(list.size()-1);

        states.remove(lastValue);
        System.out.println(states);
    }
}
