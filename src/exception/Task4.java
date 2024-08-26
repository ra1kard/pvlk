package exception;

import java.util.ArrayList;

public class Task4 {

    /**
     * Перехватить исключение (и вывести его на экран)
     * указав его тип, возникающее при выполнении кода:
     * ArrayList<String> list = new ArrayList<String>();
     * String s = list.get(18);
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        testMethod(list, 18);
    }

    public static void testMethod(ArrayList<String> list, int placeInArrayList) {
        //String es = list.get(placeInArrayList);      //пример без try catch: Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 18 out of bounds for length 0
        try {
            System.out.println("Все, что было до...");
            String s = list.get(placeInArrayList);
            System.out.println(s);
            System.out.println("Все, что будет после...");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("За размером следи, у тебя же IndexOutOfBoundsException");
            System.out.println("list.size() = " + list.size());
        }
    }

}
