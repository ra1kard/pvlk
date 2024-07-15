package generics.type_erase;

import java.util.ArrayList;

/*
public class Main {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        String str = "Hello world";
        list.add(str);
        list.add(5);
        str = (String) list.get(1);
        System.out.println(str);

        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerList = new ArrayList<>();

        //тут будет ошибка компиляции
        stringList = integerList;

        //а если сравним классы - видно, что классы равны
        //но это потому что выполнение кода будет уже после компиляции, в runtime
        if (stringList.getClass() == integerList.getClass()) {

        }
    }

}
*/
