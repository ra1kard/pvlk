

# Интерфейсы

Что такое интерфейсы в Java?

Интерфейсы в Java - это ключевой элемент ООП, который представляет абстракцию для определения 
КОНТРАКТА между объектами.

В Java интерфейсы определяются с помощью ключевого 
слова "interface".

Чтобы класс применил интерфейс, надо использовать ключевое 
слово "implements".

## Основные особенности интерфейсов

- Интерфейсы могут содержать только:
  - объявления методов (абстрактные методы);
  - и константы (статические и финальные переменные);
- Все методы в интерфейсе по умолчанию являются публичными
  и абстрактными;
- Интефейсы не могут иметь конструкторов, т.к. они не могут быть
  инстанциированы;
- Класс может реализовывать несколько интерейсов, что позволяет
  обойти отсутствие множественного наследования в Java;
- Начиная с Java 8, интерфейсы могут содержать статические и дефолтные
  (с реализацией) методы.

### Пример

```java
public interface Animal {
    // Константа
    String CATEGORY = "Animal";
 
    // Абстрактный метод
    void makeSound();
 
    // Статический метод (начиная с Java 8)
    static void showCategory() {
        System.out.println("Category: " + CATEGORY);
    }
 
    // Дефолтный метод (начиная с Java 8)
    default void breathe() {
        System.out.println("I can breathe");    //могу дышать
    }
}
 
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Woof!
        dog.breathe(); // I can breathe
        Animal.showCategory(); // Category: Animal
    }
}
```

## Зачем использовать интерфейсы?

1. Абстракция: Интерефейсы позволяют определить общий КОНТРАКТ
   между объектами, скрывая детали реализации;
2. Множественное наследование: Java не поддерживает
   МНОЖЕСТВЕННОЕ наследование классов, но позволяет
   классу реализовывать несколько интерфейсов;
3. Повышение гибкости: Использование интерфейсов делает код более
   ГИБКИМ и МАСШТАБИРУЕМЫМ, так как можно внести изменения 
   в реализацию без изменения контракта.

Использование интерфейсов в Java-разработке 
является обязательным навыком для создания 
гибких и масштабируемых приложений.



## Пример

ОСНОВНОЙ КЛАСС:
```java
public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }

    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return "HomeAnimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
```

ИНТЕРФЕЙСЫ:
```java
public interface HomeAnimalInterface{
    int a = 50;                     //является public static final переменной

    /**Отозваться*/
    void getVoice();
    /**Покушать*/
    void eat();


    default void printInfo(){       //является абстрактным методом
        System.out.println(this);
        getVoice();
        eat();
    }
}
```

```java
public interface SwimmableInterface {
    void swim();
}
```

КЛАССЫ ДОЧЕРНИЕ:
```java
public class Cat extends Animal implements HomeAnimalInterface {
    private boolean isHome;

    public Cat(String name, int age, String color, boolean isHome) {
        super(name, age, color);
        this.isHome = isHome;
    }

    public boolean isHome() { return isHome; }
    public void setHome(boolean home) { isHome = home; }

    public void playWithYarn(){ System.out.println(getName() + " играет с пряжей хозяйки");}

    @Override
    public void getVoice() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void eat() { System.out.println(getName() + " кушает корм и пьёт молоко");}
}
```

```java
public class Dog extends Animal implements HomeAnimalInterface, SwimmableInterface {
    private String nickname;

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void setNickname(String nickname) { this.nickname = nickname; }
    public String getNickname() { return nickname; }

    public void bringStick(){
        System.out.println(getName() + " несёт палку хозяину");
    }

    @Override
    public void getVoice() {
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает мясо");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывёт");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                "name='" + getName() + '\'' +
                '}';
    }

}
```

```java
public class Fish extends Animal implements SwimmableInterface{

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void swim() {
        System.out.println("Рыбка с именем " + getName() + " плывёт");
    }

}
```

ИТОГ:
```java
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 6, "Серый", true);
        Dog dog = new Dog("Бобик", 3, "Коричневый");
        Fish fish = new Fish("Золотая рыбка", 1, "Золотой");
        
        printSwimmable(dog);
        printSwimmable(fish);
//        printSwimmable(cat);        //ОШИБКА! Кошка не плавает
        printSwimmable(new Ship());
        System.out.println();

        info(cat);
        info(dog);
//        info(fish);                 //ОШИБКА! Рыбка не домашнее животное
        System.out.println();

        dog.printInfo();
        cat.printInfo();
    }

    static void info(HomeAnimalInterface homeAnimal){
        homeAnimal.getVoice();
        homeAnimal.eat();
    }

    static void makeOlder(Animal animal){
        animal.setAge(animal.getAge() + 1);
    }

    /**В качестве параметра может быть передан ЛЮБОЙ объект, имплементирующий интерфейс SwimmableInterface*/
    static void printSwimmable(SwimmableInterface swimmableAnimal){
        swimmableAnimal.swim();
    }
}
```

Вывод:
```java
Бобик плывёт
Рыбка с именем Золотая рыбка плывёт
Корабль идёт по волнам

Мяу-мяу
Барсик кушает корм и пьёт молоко
Гав-гав
Бобик кушает мясо

Dog{nickname='null'name='Бобик'}
Гав-гав
Бобик кушает мясо
HomeAnimal{name='Барсик', age=6, color='Серый'}
Мяу-мяу
Барсик кушает корм и пьёт молоко
```

## Еще пример

Данный интерфейс называется Printable. 

```java
interface Printable {
    void print();
}
```

Интерфейс может определять константы и методы:
- которые могут иметь
- а могут и не иметь реализации. 

Методы без реализации похожи на абстрактные методы 
абстрактных классов. 

Так, в данном случае объявлен один метод, 
который не имеет реализации.


Все методы интерфейса НЕ ИМЕЮТ модификаторов доступа, 
но ФАКТИЧЕСКИ по умолчанию доступ PUBLIC, 
так как цель интерфейса - определение функционала
для реализации его классом. 

Поэтому весь функционал должен быть открыт для реализации.
___

Чтобы класс применил интерфейс, используем ключевое слово implements:

```java
public class Program {
    public static void main(String[] args) {
        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();
    }
}
```

```java
interface Printable{    //печатный
    void print();
}
```

```java
/**
 * 1. Если класс применяет интерфейс, 
 *    то он должен реализовать все методы интерфейса (кроме дефолтных).
 *    
 * 2. Если класс не реализует какие-то методы интерфейса,
 *    то такое класс должен быть определен как абстрактный,
 *    а его неабстрактные классы-наследники затем дб реализовать эти методы
  */
// 
class Book implements Printable{
    String name;
    String author;
  
    Book(String name, String author){
        this.name = name;
        this.author = author;
    }
      
    public void print() {
        System.out.printf("%s (%s) \n", name, author); //ЧТО ТАКОЕ %s??
    }
}
```

Вывод:
```java
Java. Complete Referense. (H. Shildt) 
```
___

В тоже время мы не можем напрямую создавать объекты интерфейсов.

Поэтому следующий код не будет работать:

```java
Printable pr = new Printable();
pr.print();
```

___

Одним из преимуществ использования интерфейсов является то, 
что они позволяют добавить в приложение ГИБКОСТИ.

Например, в дополнение к классу Book определим еще один класс, 
который будет реализовывать интерфейс Printable:

```java
class Journal implements Printable {
    private String name;
  
    String getName(){
        return name;
    }
  
    Journal(String name){
        this.name = name;
    }
    
    public void print() {
        System.out.println(name);
    }  
}
```
___

Класс Book и класс Journal связаны тем, 
что они реализуют интерфейс Printable. 

Поэтому мы динамически в программе можем 
создавать объекты Printable КАК ЭКЗЕМПЛЯРЫ обоих классов:

```java
public class Program {

    public static void main(String[] args) {
        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();      //  Java. Complete Reference (H. Shildt)
        printable = new Journal("Foreign Policy");
        printable.print();      // Foreign Policy
    }

}
```

```java
public interface Printable {        //печатный
    void print();
}
```

```java
public class Book implements Printable {
    String name;
    String author;

    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}
```

```java
public class Journal implements Printable {
    private String name;

    String getName(){
        return name;
    }

    Journal(String name){
        this.name = name;
    }

    public void print() {           // Override лучше ставить или нет?
        System.out.println(name);
    }
}
```

## Интерфейсы в преобразованиях типов

Все сказанное в отношении преобразования типов характерно 
и для интерфейсов. 

Например, так как класс Journal реализует интерфейс Printable, 
то переменная типа Printable может хранить ссылку на объект 
типа Journal:

```java
Printable p = new Journal("Foreign Affairs");
p.print();  
// Интерфейс не имеет метода getName, необходимо явное приведение типов
String name = ((Journal)p).getName();
System.out.println(name);
```

И если мы хотим обратиться к методам класса Journal, 
которые определены не в интерфейсе Printable, 
а в самом классе Journal, то нам надо явным образом выполнить
преобразование типов: ((Journal)p).getName();


## Методы по умолчанию

Ранее до JDK 8 при реализации интерфейса мы должны были:
- обязательно реализовать все его методы в классе.
- а сам интерфейс мог содержать только определения методов 
без конкретной реализации.

В JDK 8 была добавлена такая функциональность как методы по умолчанию.

И теперь интерфейсы кроме определения методов могут иметь их
реализацию по умолчанию, которая используется, если класс, 
реализующий данный интерфейс, не реализует метод.

Например, создадим метод по умолчанию в интерфейсе Printable:

```java
interface Printable {
     
    default void print(){
        System.out.println("Undefined printable");
    }
    
}
```

Метод по умолчанию - это обычный метод без модификаторов, 
который помечается ключевым словом default. 

Затем в классе Journal нам необязательно этот метод реализовать, 
хотя мы можем его и переопределить:

```java
class Journal implements Printable {
    private String name;
  
    String getName(){
        return name;
    }
    
    Journal(String name){
        this.name = name;
    }
}
```

## Статические методы

Начиная с JDK 8 в интерфейсах доступны статические методы - 
они аналогичны методам класса:

```java
interface Printable {
    
    void print();
     
    static void read(){
        System.out.println("Read printable");
    }
    
}
```

Чтобы обратиться к статическому методу интерфейса также, 
как и в случае с классами, пишут название интерфейса и метод:

```java
public static void main(String[] args) {
    Printable.read();
}
```

## Приватные методы

По умолчанию все методы в интерфейсе фактически имеют 
модификатор public. 

Однако начиная с Java 9 мы также можем определять в интерфейсе
методы с модификатором private. 

Они могут быть статическими и нестатическими, 
но они не могут иметь реализации по умолчанию.

Подобные методы могут использоваться только внутри самого интерфейса, 
в котором они определены. 

То есть к примеру нам надо выполнять в интерфейсе некоторые 
повторяющиеся действия, и в этом случае такие действия 
можно выделить в приватные методы:

```java
public class Program {

    public static void main(String[] args) {
        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));
    }

}
```

```java
public class Calculation implements Calculatable {
}
```

```java
public interface Calculatable {

    default int sum(int a, int b){
        return sumAll(a, b);
    }

    default int sum(int a, int b, int c){
        return sumAll(a, b, c);
    }

    private int sumAll(int... values){
        int result = 0;
        for(int n : values){
            result += n;
        }
        return result;
    }

}
```

Вывод:
```java
3
7
```


## Константы в интерфейсах

Кроме методов в интерфейсах могут быть определены 
статические константы:

```java
interface Stateable{
    int OPEN = 1;
    int CLOSED = 0;
     
    void printState(int n);
}
```

Хотя такие константы также не имеют модификаторов, 
но по умолчанию они имеют модификатор доступа public static final.

И поэтому их значение доступно из любого места программы.

Применение констант:
```java
public class Program {

    public static void main(String[] args) {
        WaterPipe pipe = new WaterPipe();       //водопровод
        pipe.printState(1);
    }

}
```

```java
public interface Stateable {
    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);
}
```

```java
public class WaterPipe implements Stateable {

    public void printState(int n){
        if(n==OPEN)
            System.out.println("Water is opened");
        else if(n==CLOSED)
            System.out.println("Water is closed");
        else
            System.out.println("State is invalid");
    }

}
```

Вывод:
```java
Water is opened
```

## Множественная реализация интерфейсов

Если нам надо применить в классе несколько интерфейсов, 
то они все перечисляются через запятую после слова implements:

```java
interface Printable {
     
    // методы интерфейса
}
 
interface Searchable {
     
    // методы интерфейса
}
 
class Book implements Printable, Searchable{
 
    // реализация класса
}
```


## Наследование интерфейсов

Интерфейсы, как и классы, могут наследоваться:

```java
interface BookPrintable extends Printable{
     
    void paint();
}
```

При применении этого интерфейса класс Book должен будет
реализовать как методы интерфейса BookPrintable, 
так и методы базового интерфейса Printable.


## Вложенные интерфейсы

Как и классы, интерфейсы могут быть вложенными, 
то есть могут быть определены в классах или других интерфейсах. 

Например:

```java
class Printer{
    
    interface Printable {
        void print();
    }
    
}
```

При применении такого интерфейса нам надо указывать его 
полное имя вместе с именем класса:

```java
public class Journal implements Printer.Printable {
    String name;
  
    Journal(String name){
        this.name = name;
    }
    
    public void print() {
        System.out.println(name);
    }  
    
}
```

Использование интерфейса будет аналогично предыдущим случаям:

```java
Printer.Printable p = new Journal("Foreign Affairs");
p.print();
```

## Интерфейсы как параметры и результаты методов

И также как и в случае с классами, интерфейсы могут использоваться
в качестве типа параметров метода или в качестве возвращаемого типа:

```java
public class Program {
    
    public static void main(String[] args) {
        Printable printable = createPrintable("Foreign Affairs", false);
        printable.print();
              
        read(new Book("Java for impatients", "Cay Horstmann"));
        read(new Journal("Java Dayly News"));
    }
          
    static void read(Printable p) {
        p.print();
    }
          
    static Printable createPrintable(String name, boolean option) {
        if (option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
    
}
```

```java
interface Printable {
    void print();
}
```

```java
class Book implements Printable {
    String name;
    String author;
  
    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
      
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}
```

```java
class Journal implements Printable {
    private String name;
  
    String getName() {
        return name;
    }
  
    Journal(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }  
    
}
```

Метод read() в качестве параметра принимает объект 
интерфейса Printable, поэтому в этот метод мы можем передать как объект Book, так и объект Journal.

Метод createPrintable() возвращает объект Printable, поэтому также мы можем возвратить как объект Book, так и Journal.

Вывод:
```java
Foreign Affairs
Java for impatients (Cay Horstmann)
Java Dayly News
```

// не понял, у меня в папке example5 ошибка  ??????????
https://metanit.com/java/tutorial/3.7.php


## Обратная совместимость интерфейсов - что это такое и тп

### Зачем интерфейсам нужны методы по умолчанию?

- Как и обычные методы интерфейса, методы по умолчанию неявно общедоступны;
- Нет необходимости указывать модификатор public.


- Мы объявляем их с помощью ключевого слова по умолчанию 
  в начале сигнатуры метода
- И они обеспечивают реализацию.

___ 

Причина, по которой выпуск Java 8 включал методы по умолчанию, 
довольно очевиден.

В типичном дизайне, основанном на абстракциях, 
где интерфейс имеет одну или несколько реализаций, 
если к интерфейсу добавить один или несколько методов,
все реализации также будут вынуждены их реализовать. 

В противном случае конструкция просто сломается.

___

Методы интерфейса по умолчанию являются эффективным способом РЕШЕНИЯ
этой проблемы. 

Они позволяют добавлять в интерфейс новые методы, 
автоматически доступные в реализациях. 

Поэтому нам не нужно изменять реализующие классы.

... 

...

### Заключение

В этой статье мы подробно рассмотрели использование статических методов интерфейса и методов интерфейса по умолчанию в Java 8. На первый взгляд, эта функция может показаться немного небрежной, особенно с точки зрения объектно-ориентированного пуриста. В идеале интерфейсы не должны инкапсулировать поведение, и мы должны использовать их только для определения общедоступного API определенного типа.

Однако когда дело доходит до обеспечения обратной совместимости с существующим кодом, статические методы и методы по умолчанию являются хорошим компромиссом.

https://for-each.dev/lessons/b/-java-static-default-methods


























