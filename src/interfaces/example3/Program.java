package interfaces.example3;

public class Program {

    public static void main(String[] args) {
        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));
    }

}
