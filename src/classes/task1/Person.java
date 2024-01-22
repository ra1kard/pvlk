package classes.task1;

public class Person {
    /** поля */
    private String name;
    private String surname;
    private int age;

    /** геттеры сеттеры */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /** методы */
    //конструктор для создания "пустых" объектов класса
    Person() {                                              //ты говорил лучше вызывать ниже констр - как?
        this.name = "неизвестно";
        this.surname = "неизвестно";
        this.age = 44;
    }

    //конструктор для создания объектов класса с инициализацией полей */
    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //метод выводящий сообщение: <name> сделал <кол-во шагов> шагов
    void move(int countStep) {
        System.out.println(this.name + " сделал " + countStep + " шагов");
    }

    //метод выводящий сообщение: <name> говорит: <сообщение>
    void talk(String message) {
        System.out.println(this.name + " говорит: " + "\"" + message + "\"");
    }

}
