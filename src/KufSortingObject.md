# Заметки

## Сортировка/сравнение объектов (Comparable, Comparator)

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

P.S. ЕСЛИ ХОТИМ НАОБОРОТ ОБРАТНУЮ СОРТИРОВКУ:
вычитаем из o.object текущее
```java
@Override
public int compareTo(Car o) {
   return this.o.getManufactureYear() - getManufactureYear();
}
```

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












