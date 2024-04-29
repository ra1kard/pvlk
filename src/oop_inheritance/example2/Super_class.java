package oop_inheritance.example2;

public class Super_class {
    int age;

    Super_class(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("Значение переменной age в суперклассе равно: " + age);
    }
}
