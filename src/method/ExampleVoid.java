package method;

public class ExampleVoid {

    public static void main(String[] args) {
        methodRankPoints(255.7);
        methodRankPoints(130);
        methodRankPoints(100);
    }

    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println("Ранг A1");
        } else if (points >= 122.4) {
            System.out.println("Ранг A2");
        } else {
            System.out.println("Ранг A3");
        }
    }

}
