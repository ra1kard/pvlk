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


















