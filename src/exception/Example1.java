package exception;

public class Example1 {

    public static void main(String[] args) {
        //hereWillBeTrouble(42, 0);
        //hereWillBeTrouble2(42, 0);
        //hereWillBeTrouble3(42, 0);
        //hereWillBeTrouble4(42, 0);
        //hereWillBeTrouble5();
        //notGood();

        try {
            hereWillBeTrouble6();
        } catch (ArithmeticException ex) {
            System.out.println("Да, это случилось");
        }
    }

    public static void hereWillBeTrouble(int a, int b) {
        int oops = a / b;
        System.out.println(oops);
    }

    public static void hereWillBeTrouble2(int a, int b) {
        System.out.println("Всё, что было до...");
        int oops = a / b;
        System.out.println(oops);
        System.out.println("Всё, что будет после...");
    }

    private static void hereWillBeTrouble3(int a, int b) {
        int oops;
        try {
            System.out.println("Всё, что было до...");
            oops = a / b;
            System.out.println(oops);
            System.out.println("Всё, что будет после...");
        } catch (ArithmeticException e) {
            System.out.println("Говорили же не делить на ноль!");
            oops = 0;
        }
        System.out.println("Метод отработал");
    }

    private static void hereWillBeTrouble4(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("ты опять делишь на ноль?");
        }
        int oops = a / b;
        System.out.println(oops);
    }

    private static void hereWillBeTrouble5() throws ArithmeticException {
        System.out.println("Всё, что было до...");
        int oops = 42 / 0;
        System.out.println("Всё, что будет после...");
    }

    private static void hereWillBeTrouble6() throws ArithmeticException {
        System.out.println("Всё, что было до...");
        int oops = 42 / 0;
        System.out.println("Всё, что будет после...");
    }

    static void notGood() {
        System.out.println("Только не снова!");
        notGood();
    }

}
