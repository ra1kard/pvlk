package oop_inheritance.example1;

public class Sub_class extends Super_class {
    int num = 77;

    // Метод display() субкласса
    public void display() {
        System.out.println("Это метод display() подкласса");
    }

    public void my_method() {
        // Инициализация подкласса
        Sub_class sub = new Sub_class();

        // Вызываем метод display() подкласса
        sub.display();

        // Вызываем метод display() суперкласса
        super.display();

        // Выводим значение переменной num подкласса
        System.out.println("Значение переменной num в подклассе: " + sub.num);

        // Выводим значение переменной num суперкласса
        System.out.println("Значение переменной num в суперклассе: " + super.num);
    }

    public static void main(String args[]) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}
