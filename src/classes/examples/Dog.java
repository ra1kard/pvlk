package classes.examples;

public class Dog {
    String breed;
    int age;
    String color;

    void barking() {
    }

    void hungry() {
        boolean enoughWater = false;
        boolean enoughFood = false;
    }

    void sleeping() {
    }

    public static void main(String[] args) {
        Dog ronny = new Dog();
        ronny.breed = "french";
        ronny.age = 5;
        ronny.color = "fawn";
    }
}
