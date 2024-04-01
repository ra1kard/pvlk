package polymorphism.test3;

public class Child {
    private int age;

    @Override
    public String toString() {
        return "age is "+age;
    }

    public static void main(String[] args) {
        Child child = new Child();
        Object myObject = child;
        System.out.println(child);      //печатаем объект Child
        System.out.println(myObject);   //печатаем объект Object
    }

}
