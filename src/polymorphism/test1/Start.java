package polymorphism.test1;

public class Start {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        animal1.makeSound();
        dog1.makeSound();
        animal3.makeSound();
    }

}
