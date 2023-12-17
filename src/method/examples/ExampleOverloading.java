package method.examples;

public class ExampleOverloading {

    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        double c = 5.1;
        double d = 7.2;
        int result1 = minFunction(a, b);

        // такая же функция с другими параметрами
        double result2 = minFunction(c, d);
        System.out.println("Минимальное значение = " + result1);
        System.out.println("Минимальное значение = " + result2);
    }

    // для integer
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

    // для double
    public static double minFunction(double n1, double n2) {
        double min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }

}
