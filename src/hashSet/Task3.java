package hashSet;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        /*HashSet<String> states = new HashSet<String>(Arrays.asList("Germany", "France", "Italy"));
        System.out.println(states);*/

        HashSet<String> states = new HashSet<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        System.out.println(states);             // [Italy, France, Germany] последний добавленный первый выходит?

        /*
        выведите первый элемент набора                  а что вообще есть первый элемент в HashSet? он же хаос?
        Для получения элемента из Set в Java можно использовать метод Iterator.next(),
        который возвращает следующий элемент из набора.
         */
        Iterator<String> iterator = states.iterator();
        String element = iterator.next();
        System.out.println(element);                    // Italy - вариант 1

        System.out.println(states.iterator().next());   // Italy - вариант 2

        List<String> list = new ArrayList<>(states);
        System.out.println(list.get(0));                // преобразовать HashSet в ArrayList - вариант 3

        //выведите последний элемент набора
        System.out.println(list.get(list.size()-1));    // преобразовать HashSet в ArrayList (а как еще?)
    }
}
