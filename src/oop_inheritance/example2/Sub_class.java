package oop_inheritance.example2;

public class Sub_class extends Super_class {
    Sub_class(int age) {
        super(age);
    }

    public static void main(String args[]) {
        Sub_class s = new Sub_class(24);
        s.getAge();
    }
}
