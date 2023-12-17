package method.examples;

public class Example1 {

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minFunction(5, 10));
        System.out.println(minFunction(13, 10));
    }

}
