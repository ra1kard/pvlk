package exception;

public class Task2 {

    /**
     * Перехватить исключение (и вывести его на экран)
     * указав его тип, возникающее при выполнении кода:
     * String s = null
     * String m = s.toLowerCase();
     */
    public static void main(String[] args) {
        String s = null;
        String m = s;
        testMethod(s, m);
    }

    public static void testMethod(String s, String m) {
        //m = s.toLowerCase();      //пример без try catch: Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "s" is null
        try {
            System.out.println("Все, что было до...");
            m = s.toLowerCase();
            System.out.println(m);
            System.out.println("Все, что будет после...");
        } catch (NullPointerException e) {
            System.out.println("null не привести к toLowerCase, добрый вечер, NullPointerException");
            m = null;
        }
        System.out.println("Метод отработал");
        System.out.println("Переменная m = " + m);
    }

}
