# Заметки

## Преобразования из одного типа в другой

### char в int

```java
class Main {
    public static void main(String[] args) {
        char ch = '5';
        int num = Character.getNumericValue(ch); // 5
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(13, 1));
        int rsl = 0;

        for (int value : list) {
            char[] chars = Integer.toString(value).toCharArray();
            for (char ch : chars) {
                rsl += Character.getNumericValue(ch);
            }
        }

        System.out.println(rsl); // 5 = 1+3+1
    }
}
```

### int в char

```java
class Main {
    public static void main(String[] args) {
        int value = 5;
        char ch = Integer.toString(value).toCharArray();
    }
}
```

### String в char

```java
public class StringToArrayExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Преобразовать строку в массив символов
        char[] charArray = str.toCharArray();

        // Распечатать элементы массива
        for (char c : charArray) {
            System.out.println(c);
        }
    }
}
```

### char в String

```java
class Main {
    char ch = 'a';
    String str = new String(new char[]{ch});
    String str = String.valueOf(ch);            //или так
}
```

```java
class Main {
    char[] arr = {'h', 'e', 'l', 'l', 'o'};
    String str = new String(arr); // hello
}
```

## Получение цифр из числа - остаток, целое

```java
class Main {
    public static void main(String[] args) {
        int number = 112;
        int count = 0;
        while (number > 0) {                //учитываем целое число
            int digit = number % 10;        //получаем остаток
            number = number / 10;           //получаем целое число, без остатка

            count++;                        //доп счетчик чтобы посчитать кол-во цифр в числе
        }

        System.out.println("ск цифр две или одна или три? = " + count);
    }
}
```

## Ввод с клавиатуры

### строка
```java
class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
    }
}
```

### число 
```java
class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
    }
}
```

## Enum - перечисление

Используется когда нам требуется перечисление.

### Например

Нам надо перечислить типы объектов, допустим: 
- есть времена года
- есть типы животных

Если программе требуются времена года:
1. мы можем создать Enum время года
2. и там перечислить: весна, лето, осень, зима

Если программе трбуются страны:
1. мы можем создать Enum страны
2. и там перечислить: Россия, Беларусь и тд

### Как жили до появления Enum в Java < 1.5 версии:

```java
public class Test {
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
```

Неудобства:
1. представьте, если переменная хранит 100, что это будет означать?
    
- какое же это животное? 
- возникает НЕОПРЕДЕЛЕННОСТЬ:
- int animal = 100;


2. и вторая проблема с хранением в целом числе какого-то типа:
    
- это то, что для того чтобы понять какое животное в переменной
- нам надо посмотреть вверх класса на поля - НЕУДОБНО
- если класс большой - проблема остро может ощущаться


### Поэтому появился Enum. Что делают теперь:

```java
public enum Animal {
    DOG, CAT, FROG
}
```

```java
public enum Season {
    SUMMER, WINTER, AUTUMN, SPRING
}
```

```java
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
```

Вывод будет следующим:
```java
it's a cat!
Тепло
```

### Преимущества Enum 

1. проблему №1 - Enum наглядно решил:

    теперь программа может использовать только то, что перечислено в Enum;

2. проблема №2 - также решена, сразу понятно из названия где кошка


При создании:
- выбираем имя Enum, точка и выбираем тип Enum 
- и ссылаемся на переменную animal

### Наследование в Enum отличается от классов

Все классы насладуются от объекта Object:
- Object -> Test 

У Enum в отличие от класса наследование идет по-другому:
- Object -> Enum -> Animal
- Object -> Enum -> Season

Как только мы написали перечисление:
```java
public enum Season {
    SUMMER, WINTER, AUTUMN, SPRING
}
```
Java сама создает объекты этого Enum

Enum - по сути как класс, в нем тоже могут быть методы и тп

То есть у нас:
```java
public class Test {
    public static void main(Sting[] args) {
       Season season = Season.SUMMER;
    }
}
```
- объект в переменной season (лето)
- является объектом класса Season


### Создание Enum

Если в Enum будет только перечисление, тогда ; в конце можно не ставить
```java
public enum Season {
    SUMMER, WINTER, AUTUMN, SPRING
}
```

Если в Enum что-то еще, тогда ; нам необходимо поставить

```java
import classes.task11enum.Animal;

public enum Season {
   SUMMER, WINTER, AUTUMN, SPRING;

   private Animal() {
       
   }
}
```

### Получение индекса Enum (порядка среди перечислений):

Есть ситуации когда мы хотим получить индекс нашего Enum
```java
public enum Season {
   SUMMER, WINTER, AUTUMN, SPRING;
}

public class Test {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal()); //ordinal
    }
}
```
Вывод будет:
```java
1
```

### Вывод имени Enum
Допустим хотим вывести имя как оно задекларировано в перечислении
```java
public enum Season {
   SUMMER, WINTER, AUTUMN, SPRING;
}

public class Test {
    public static void main(String[] args) {
        Season season = Season.WINTER;
        System.out.println(season.name());
    }
}
```

Вывод будет:
```java
WINTER
```


## Класс LocalTime

### Пример, когда создаем и заносим свои значения:
Используем LocalTime.of

```java
import java.time.LocalTime;

public class LocalTimeDemo1 {
   public static void main(String[] args) {
      // С часами (0-23) и минутами (0-59)
      LocalTime fiveThirty = LocalTime.of(5, 30);

      //С часами, минутами и секундами (0-59)
      LocalTime noon = LocalTime.of(12, 0, 30);

      //С часами, минутами, секундами и наносекундами
      LocalTime almostMidnignt = LocalTime.of(23, 59, 59, 999999);

      System.out.println(fiveThirty);
      System.out.println(noon);
      System.out.println(almostMidnignt);
   }
}
```
```java
05:30
12:00:30
23:59:59.000999999
```

### Пример, когда мы выводим текущее время:
Используем LocalTime.now

```java
import java.time.LocalTime;

public class LocalTimeDemo2 {
   public static void main(String[] args) {
      LocalTime now = LocalTime.now();
      int hour = now.getHour();
      int minute = now.getMinute();
      int second = now.getSecond();
      int nanosecond = now.getNano();

      System.out.println(hour);
      System.out.println(minute);
      System.out.println(second);
      System.out.println(nanosecond);
   }
}
```
```java
1
50
24
474711000
```

### Пример разных форматов дня и тп

```java
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeDemo3 {
   public static void main(String[] args) {
      LocalTime now = LocalTime.now();
      int hourAMPM = now.get(ChronoField.HOUR_OF_AMPM);           // 0 - 11   формат1
      int hourDay = now.get(ChronoField.HOUR_OF_DAY);             // 0 - 23   формат2
      int minuteDay = now.get(ChronoField.MINUTE_OF_DAY);         // 0 - 1,439
      int minuteHour = now.get(ChronoField.MINUTE_OF_HOUR);       // 0 - 59
      int secondDay = now.get(ChronoField.SECOND_OF_DAY);         // 0 - 86,399
      int secondMinute = now.get(ChronoField.SECOND_OF_MINUTE);   // 0 - 59
      long nanoDay = now.getLong(ChronoField.NANO_OF_DAY);        // 0 - 86399999999
      long nanoSecond = now.getLong(ChronoField.NANO_OF_SECOND);  // 0 - 999999999

      System.out.println("Часы: " + hourAMPM);
      System.out.println("Часы: " + hourDay);
      System.out.println("Минуты дня: " + minuteDay);             // на текущий момент, допустим в 15:41 будет 941
      System.out.println("Минуты: " + minuteHour);
      System.out.println("Секунды дня: " + secondDay);
      System.out.println("Секунды: " + secondMinute);
      System.out.println("Наносекунды дня: " + nanoDay);
      System.out.println("Наносекунды: " + nanoSecond);
   }
}
```

```java
Часы: 2
Часы: 2
Минуты дня: 125
Минуты: 5
Секунды дня: 7557
Секунды: 57
Наносекунды дня: 7557701681000
Наносекунды: 701681000
```


### Методы сравнения

```java
import java.time.LocalTime;

public class CompareLocalTimeDemo {
   public static void main(String[] args) {
      LocalTime fiveThirty = LocalTime.of(5, 30);
      LocalTime noon = LocalTime.of(12, 0, 0);
      LocalTime almostMidnight = LocalTime.of(23, 59, 59, 99999);

      System.out.println("fiveThirty.isAfter(noon)? " + fiveThirty.isAfter(noon));    //false
      System.out.println("fiveThirty.isBefore(noon)? " + fiveThirty.isBefore(noon));  //true
      System.out.println("noon.isAfter(almostMidnight)? " + noon.equals(almostMidnight));     //false
   }
}
```

```java
fiveThirty.isAfter(noon)? false
fiveThirty.isBefore(noon)? true
noon.isAfter(almostMidnight)? false
```


### Методы with 

Когда хочу изменить время - пишем with и передаем новые значения

```java
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class WithLocalTimeDemo {
   public static void main(String[] args) {
      LocalTime noon = LocalTime.of(12, 0, 0);

      LocalTime ten = noon.with(ChronoField.HOUR_OF_DAY, 10);
      LocalTime eight = noon.withHour(8);
      LocalTime twelveThirty = noon.withMinute(30);
      LocalTime thirtyTwoSeconds = noon.withSecond(32);

      // Можно использовать сцепление методов
      LocalTime secondsNano = noon.withSecond(20).withNano(999999);

      System.out.println("ten: " + ten);
      System.out.println("eight: " + eight);
      System.out.println("twelveThirty: " + twelveThirty);
      System.out.println("thirtyTwoSeconds: " + thirtyTwoSeconds);
      System.out.println("secondsNano: " + secondsNano);
   }
}
```

```java
ten: 10:00
eight: 08:00
twelveThirty: 12:30
thirtyTwoSeconds: 12:00:32
secondsNano: 12:00:20.000999999
```



### Методы plus() minus()

```java
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class PlusMinusLocalTimeDemo {
   public static void main(String[] args) {
      LocalTime fiveThirty = LocalTime.of(5, 30);

      // Добавление
      LocalTime sixThirty = fiveThirty.plusHours(1);
      LocalTime fiveForty = fiveThirty.plusMinutes(10);
      LocalTime plusSeconds = fiveForty.plusSeconds(14);
      LocalTime plusNanos = fiveForty.plusNanos(9999999);
      LocalTime sevenThirty = fiveForty.plus(2, ChronoUnit.HOURS);

      // Вычитание
      LocalTime fourThirty = fiveForty.minusHours(1);
      LocalTime fiveTen = fiveForty.minusMinutes(20);
      LocalTime minusSeconds = fiveForty.minusSeconds(2);
      LocalTime minusNano = fiveForty.minusNanos(1);
      LocalTime fiveTwenty = fiveForty.minus(10, ChronoUnit.MINUTES);

      System.out.println("sixThirty: " + sixThirty);
      System.out.println("fiveForty: " + fiveForty);
   }
}
```

```java
sixThirty: 06:30
fiveForty: 05:40
```


### Методы сравнения

Можно воспольз LocalTime и ChronoUnit, если используется Java8:

```java
LocalTime now = LocalTime.parse("10:30");
LocalTime expected = LocalTime.parse("10:45");
Long minutes = ChronoUnit.MINUTES.between(now, expected);
System.out.println(minutes); //15
```

```java
15
```


## Random


- Для генерации случайного числа в заданном диапазоне, 
в Java можно использовать класс Random и его метод nextInt(int bound)
- Этот метод генерирует случайное число в диапазоне от 0 (включительно) до указанного числа (исключительно):

```java
Random random = new Random();
int count = random.nextInt(100);
```

- Пример рандомных чисел от 1 до 100:

```java
Random random = new Random();
int count = random.nextInt(100) + 1;
```

https://developer.alexanderklimov.ru/android/java/random.php

- Пример для вывода случайного числа:
```java
final Random random = new Random();
    
public void onClick(View v) {
	mInfoTextView.setText(String.valueOf(random.nextInt()));
}
```

- Случайные числа часто используются в играх. 
- Допустим, мы хотим вывести случайные числа от 1 до 6 при бросании игрального кубика. 
- Попробуем:
```java
mInfoTextView.setText(String.valueOf(random.nextInt(6)));
```

- При проверке вы заметите две нестыковки. 
- Во-первых, иногда выпадает число 0, которого нет на кубике, 
- Во-вторых никогда не выпадает число 6. 
- Когда вы помещаете число в параметр метода, то это означает, 
что выпадают числа в диапазоне от 0 до указанного числа, которое в этот диапазон не входит. 

- Если вы будете использовать число 7
- то шестёрка станет выпадать, 
- но по-прежнему будет выпадать число 0. 

- Поэтому пример следует немного отредактировать (`хотим числа от 1 до 6` при бросании игрального кубика):
```java
mInfoTextView.setText(String.valueOf(random.nextInt(6) + 1));
```

















# Сортировка/сравнение объектов (Comparable, Comparator)

https://javarush.com/groups/posts/2262-comparator-v-java

Поговорим о сравнении объектов:
- мы знаем как работает оператор “==”, а также о методах equals() и hashCode().
- сравнение — не совсем об этом.
- Раньше мы имели в виду скорее «проверку объектов на равенство». 

А у сравнения объектов друг с другом могут быть совсем другие цели! 

Самая очевидная из них — сортировка.

Я думаю, если тебе скажут отсортировать список ArrayList<> чисел или строк, 
ты с этим справишься без проблем:

```java
public class SortIntSimple {

   public static void main(String[] args) {
      //сортировка простого списка Integer
      List<Integer> counters = new ArrayList<>();
      counters.add(8);
      counters.add(3);
      counters.add(1);
      Collections.sort(counters);
      System.out.println(counters);
   }

}
```
вывод:
```java
[1, 3, 8]
```

___

```java
public class SortStringSimple {

    public static void main(String[] args) {
        //сортировка простого списка String
        List<String> names = new ArrayList<>();
        String name1 = "Маша";
        String name2 = "Саша";
        String name3 = "Даша";
        names.add(name1);
        names.add(name2);
        names.add(name3);
        Collections.sort(names);
        System.out.println(names);
    }

}
```
вывод
```java
[Даша, Маша, Саша]
```
___

А вот тебе задача посложнее:
```java
public class Car {
   private int manufactureYear;
   private String model;
   private int maxSpeed;

   public Car(int manufactureYear, String model, int maxSpeed) {
      this.manufactureYear = manufactureYear;
      this.model = model;
      this.maxSpeed = maxSpeed;
   }

   //...геттеры, сеттеры, toString()
}
```

```java
public class SortObject {
    
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
    }
    
}
```
Вот очень просто: 
- класс Car и 3 его объекта.
- Будь так добр, отсортируй автомобили в списке!

Ты наверняка спросишь: 
- «А как их надо отсортировать?». 
- По названию, по году выпуска, по максимальной скорости?

Отличный вопрос. 
- Мы не знаем на данный момент, как надо сортировать объекты класса Car.
- И, вполне естественно, Java тоже этого не знает! 

При попытке передать в метод Collections.sort() список объектов Car 
- мы получим ошибку:

```java
public class Car {
   private int manufactureYear;
   private String model;
   private int maxSpeed;

   public Car(int manufactureYear, String model, int maxSpeed) {
      this.manufactureYear = manufactureYear;
      this.model = model;
      this.maxSpeed = maxSpeed;
   }

   //...геттеры, сеттеры, toString()
}
```
```java
public class SortObject {
    
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

       //ошибка компилятора!
       Collections.sort(cars);
    }
    
}
```

- И действительно, откуда языку знать, как именно сортировать написанные тобой объекты?
- Это зависит от задач твоей программы.
- Мы должны как-то научить Java сравнивать эти объекты. 
- Причем сравнивать так, как это нужно нам.

## Comparable

Для этого в Java есть специальный инструмент — интерфейс Comparable.
- С английского языка это переводится как «сравнимый». 
- чтобы наши объекты Car можно было сравнивать друг с другом
- и как-то сортировать, 
- класс должен имплементировать этот интерфейс 
- и реализовать его единственный метод — compareTo():

```java
public class Car implements Comparable<Car> {
   private int manufactureYear;
   private String model;
   private int maxSpeed;

   public Car(int manufactureYear, String model, int maxSpeed) {
      this.manufactureYear = manufactureYear;
      this.model = model;
      this.maxSpeed = maxSpeed;
   }

   @Override
   public int compareTo(Car o) {
      return 0;
   }

   //...геттеры, сеттеры, toString()
}
```

Обрати внимание: 
- мы указали интерфейс Comparable<Car>, 
- а не просто Comparable. 
- это типизированный интерфейс, то есть, требует указания конкретного класса, с которым он связан.

В принципе, < Car> можно из интерфейса и убрать, 
- но тогда он по умолчанию сравнивает объекты Object. 
- вместо метода compareTo(Car o) у нас в классе будет:

```java
@Override
public int compareTo(Object o) {
    return 0;
}
```
Нам, конечно, гораздо проще работать с Car.

- Внутри метода compareTo() мы реализуем логику сравнения машин.
- Допустим, нам нужно отсортировать их по году выпуска.

Наверное, ты обратил внимание, что метод compareTo() возвращает значение int, а не boolean.

Пусть тебя это не удивляет. 

Дело в том, что сравнение двух объектов дает нам 3 возможных варианта:
1. а < b
2. a > b
3. a == b

У boolean же есть всего 2 значения — true и false, что неудобно для сравнения объектов. 

С int все намного проще. 
1. Если возвращаемое значение > 0, значит a > b.
2. Если результат compareTo < 0, значит а < b.
3. Ну а если результат == 0, значит два объекта равны: a == b.


Научить наш класс сортировать машины по году выпуска — проще простого:

```java
@Override
public int compareTo(Car o) {
   return this.getManufactureYear() - o.getManufactureYear();
}
```

Что здесь происходит?
- мы берем один объект машины (this), выпуска этой машины 
- и вычитаем из него год выпуска другой машины (той, с котор сравниваем объект)

Если год выпуска первой машины больше
- метод вернет int > 0
- а значит, машина this > машины о

Если наоборот, год выпуска второй машины (о) больше
- значит метод вернет отрицательное число, 
- а следовательно, о > this.

Ну а если они равны, метод вернет 0.
___

- такого простого механизма уже достаточно, 
- чтобы сортировать коллекции объектов Car! 
- больше ничего делать не нужно.

Вот, пожалуйста:

```java
public class Car implements Comparable<Car> {
   private int manufactureYear;
   private String model;
   private int maxSpeed;

   public Car(int manufactureYear, String model, int maxSpeed) {
      this.manufactureYear = manufactureYear;
      this.model = model;
      this.maxSpeed = maxSpeed;
   }

   @Override
   public int compareTo(Car o) {
      return 0;
   }

   @Override
   public String toString() {
      return "getManufactureYear=" + getManufactureYear() + ", " +
              "getMaxSpeed=" + getMaxSpeed() + ", " +
              "model=" + getModel();

   }

   public int getManufactureYear() {
      return manufactureYear;
   }

   public String getModel() {
      return model;
   }

   public int getMaxSpeed() {
      return maxSpeed;
   }

}
```

```java
public class SortObject {

   public static void main(String[] args) {
      List<Car> cars = new ArrayList<>();

      Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
      Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
      Car bugatti = new Car(2010, "Bugatti Veyron", 350);

      cars.add(ferrari);
      cars.add(bugatti);
      cars.add(lambo);

      //тут раньше была ошибка
      Collections.sort(cars);
      for (Car car : cars) {
         System.out.println(car);
      }
   }

}
```

Вывод в консоль:
```java
getManufactureYear=1990, getMaxSpeed=310, model=Ferrari 360 Spider
getManufactureYear=2010, getMaxSpeed=350, model=Bugatti Veyron
getManufactureYear=2012, getMaxSpeed=290, model=Lamborghini Gallardo```
```
Машины отсортированы как надо! :)

___

В каких случаях надо использовать Comparable?

- Реализованный в Comparable метод сравнения называют «natural ordering» — естественной сортировкой. 
- Это потому, что в методе compareTo() ты описываешь наиболее распространенный способ сравнения, 
- который будет использоваться для объектов этого класса в твоей программе.


Natural Ordering уже присутствует в Java. 
Например, Java знает, что строки чаще всего сортируют по алфавиту, а числа — по возрастанию их значения. 

Поэтому если вызвать на списке чисел или строк метод sort(), так они и будут отсортированы.

Если в нашей программе: 
- машины в большинстве случаев будут сравниваться и сортироваться по году выпуска, 
- значит, стоит определить для них натуральную сортировку с помощью интерфейса Comparable<Car> и метода compareTo().

___ 
Но что, если нам этого недостаточно?

Давай представим, что наша программа не так проста.

В большинстве случаев натуральная сортировка машин (мы установили ее по году выпуска) нас устраивает.

Но иногда среди наших клиентов попадаются любители быстрой езды. 

Если мы готовим для них каталог автомобилей на выбор, их нужно упорядочить по максимальной скорости.

- К примеру, такая сортировка нам нужна в 15% случаев. 
- Этого явно недостаточно, чтобы установить натуральную сортировку для Car по скорости вместо года выпуска.

Но и игнорировать 15% клиентов мы не можем. Что же нам делать?

## Comparator

Здесь нам приходит на помощь другой интерфейс — Comparator. Так же, как и Comparable, он типизированный.
А в чем же разница?

Comparable делает наши объекты «сравнимыми» и создает для них наиболее естественный порядок сортировки, который будет использоваться в большинстве случаев.

Comparator — это отдельный класс-«сравниватель» (перевод немного корявый, но зато понятный).

Если нам нужно реализовать какую-то специфическую сортировку, нам необязательно лезть в класс Car и менять логику compareTo().

Вместо этого мы можем создать отдельный класс-comparator в нашей программе и научить его делать нужную нам сортировку!

```java 
import java.util.Comparator;

public class MaxSpeedCarComparator implements Comparator<Car> {

   @Override
   public int compare(Car o1, Car o2) {
       return o1.getMaxSpeed() - o2.getMaxSpeed();
   }
}
```

Как видишь, наш Comparator довольно прост.

Всего один метод compare() — это метод интерфейса Comparator, который обязательно нужно реализовать. 

- Он принимает на вход два объекта Car 
- И привычным нам образом (вычитанием) сравнивает их максимальную скорость. 
- Как и compareTo(), он возвращает число int, принцип сравнения тот же.


Как же нам пользоваться этим?

Очень просто:

```java
public class Car implements Comparable<Car> {
   private int manufactureYear;
   private String model;
   private int maxSpeed;

   public Car(int manufactureYear, String model, int maxSpeed) {
      this.manufactureYear = manufactureYear;
      this.model = model;
      this.maxSpeed = maxSpeed;
   }

   @Override
   public int compareTo(Car o) {
      return 0;
   }

   @Override
   public String toString() {
      return "getManufactureYear=" + getManufactureYear() + ", " +
              "getMaxSpeed=" + getMaxSpeed() + ", " +
              "model=" + getModel();

   }

   public int getManufactureYear() {
      return manufactureYear;
   }

   public String getModel() {
      return model;
   }

   public int getMaxSpeed() {
      return maxSpeed;
   }

}
```

```java
public class MaxSpeedCarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getMaxSpeed() - o2.getMaxSpeed();
    }

}
```

```java
public class SortObject {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);

        Comparator speedComparator = new MaxSpeedCarComparator();
        Collections.sort(cars, speedComparator);

        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
```

вывод
```java
getManufactureYear=2012, getMaxSpeed=290, model=Lamborghini Gallardo
getManufactureYear=1990, getMaxSpeed=310, model=Ferrari 360 Spider
getManufactureYear=2010, getMaxSpeed=350, model=Bugatti Veyron
```

Мы просто создаем объект-компаратор 

И передаем его в метод Collections.sort() вместе со списком, который надо отсортировать.

- Получив на вход компаратор, 
- Метод sort() не будет использовать естественную сортировку, определенную в методе compareTo() класса Car. 
- Вместо этого он применит алгоритм сортировки из переданного ему компаратора.

### Какие плюсы нам это дает?

Во-первых - совместимость с написанным кодом:
- мы создали новый, специфический метод сортировки, 
- и при этом сохранили действующий, который будет использоваться в большинстве случаев.
- то есть мы вообще не трогали класс Car - он как был Comparable, так и остался.

Во-вторых, гибкость: 
- Мы можем добавлять сколько угодно сортировок.

Скажем, отсортировать машины 
- по цвету, 
- скорости, 
- весу, 
- или по тому, сколько раз эта машина использовалась в фильмах про Бэтмена. 

Достаточно только создать дополнительный Comparator.












