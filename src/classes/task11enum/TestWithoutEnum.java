package classes.task11enum;

public class TestWithoutEnum {
    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;

    public static void main(String[] args) {
        int animal = 100;

        switch (animal) {
            case DOG:
                System.out.println("it's a dog");
                break;
            case FROG:
                System.out.println("it's a frog");
                break;
            default:
                System.out.println("it's a animal");
        }
    }
}
