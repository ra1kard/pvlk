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








