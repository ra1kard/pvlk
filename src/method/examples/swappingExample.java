package method.examples;

public class swappingExample {

    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        System.out.println("Перед тем как передать, значения аргументов a = " + a + " и b = " + b);

        // Вызов метода передачи
        swapFunction(a, b);
        System.out.println("\nСейчас, до и после передачи значения аргументов ");
        System.out.println("остались неизменными, a = " + a + " и b = " + b);
    }

    public static void swapFunction(int a, int b) {
        System.out.println("До замены: a = " + a + " b = " + b);

        // Передача параметров
        int c = a;
        a = b;
        b = c;
        System.out.println("После замены: a = " + a + " b = " + b);
    }

}
