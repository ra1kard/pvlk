package classes.task11enum;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        switch (animal) {
            case DOG:
                    System.out.println("it's a dog!");
                    break;
            case CAT:
                    System.out.println("it's a cat!");
                    break;
            case FROG:
                    System.out.println("it's a frog!");
                    break;
        }

        Season season = Season.SUMMER;

        switch (season) {
            case SUMMER:
                System.out.println("Тепло");
                break;
            case WINTER:
                System.out.println("Холодно");
                break;
        }
    }
}
