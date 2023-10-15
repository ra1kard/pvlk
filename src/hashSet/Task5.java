package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<>(Arrays.asList("Germany", "France", "Italy", "Belgium", "Japan"));
        System.out.println(states);

        //выведите, а затем удалите последний элемент
        List<String> list = new ArrayList<>(states);
        System.out.println(list.get(list.size()-1));    //вывод последнего

        list.remove(list.size()-1);
        System.out.println(list);                       //вывод после удаления в list

        states.clear();
        states.addAll(list);
        System.out.println(states);
    }
}
//это решение, но избыточное, можно иначе (см. второй вариант)
