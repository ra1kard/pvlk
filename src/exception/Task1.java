package exception;

public class Task1 {

    /**
     * Перехватите исключение (и вывести его на экран)
     * указав его тип, возникающее при выполнении кода:
     * int a = 42/0
     */
    public static void main(String[] args) {
        testMethod(42, 0);
    }

    public static void testMethod(int a, int b) {
        int c;
        //c = a / b;  //пример без try catch: Exception in thread "main" java.lang.ArithmeticException: / by zero
        try {
            System.out.println("Все, что было до...");
            c = a / b;
            System.out.println(c);
            System.out.println("Все, что будет после...");
        } catch (ArithmeticException e) {
            System.out.println("Говорили же не делить на ноль! Попали на ArithmeticException!");
            c = 0;
        }
        System.out.println("Метод отработал");
        System.out.println("Переменная c = " + c);
    }

}
