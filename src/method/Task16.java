package method;

import java.util.ArrayList;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(myMethod(10));
        System.out.println(myMethod(25));
        System.out.println(myMethod(30));
        System.out.println(myMethod(1));
        System.out.println(myMethod(13));

        System.out.println(Math.sqrt(10));
    }

    public static ArrayList<Integer> myMethod(int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < value/2+1; i++) {
            if (value % i == 0) {           //&& !(list.contains(i))
                list.add(i);
            }
        }
        return list;
    }
}
// изначально в цикле было i < value, то есть перебор всех чисел
// но по факту можно проверять до половины (до квадратного корня)
// Паша подсказывал, но я не вкурил: "только чисел касается ...16,25,36,49...

// не разобрался с этим, поэтому я просто до половины решил проверять пока, поэтому i < value/2+1
