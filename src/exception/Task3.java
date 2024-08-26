package exception;

public class Task3 {

    /**
     * Перехватить исключение (и вывести его на экран)
     * указав его тип, возникающее при выполнении кода:
     * int[] m = new int[2];
     * m[8] = 5;
     */
    public static void main(String[] args) {
        int[] m = new int[2];
        testMethod(m, 8, 5);
    }

    public static void testMethod(int[] m, int placeInArray, int number) {
        //m[placeInArray] = number;     //пример без try catch: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 2
        try {
            System.out.println("Все, что было до...");
            m[placeInArray] = number;
            System.out.println(m);
            System.out.println("Все, что будет после...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("За размером следи, у тебя же ArrayIndexOutOfBoundsException");
            System.out.println("Так и быть, помогу, запишу в последнюю ячейку массива");
            System.out.println("До присваивания = " + m[m.length-1]);
            m[m.length-1] = number;
            System.out.println("После присваивания = " + m[m.length-1]);
        }
    }

}
