
# Обобщения (Generic)

Источник: https://developer.alexanderklimov.ru/android/java/generic.php

Обобщения - это параметризованные типы. 

С их помощью можно: 
- объявлять классы, интерфейсы и методы
- где тип данных указан в виде параметра. 

Обобщения добавили в язык безопасность типов.

Рассмотрим пример с обобщением.

```java
 class Gen<T> {
    T ob; // объявление объекта типа T

    // Передать конструктору ссылку на объект типа T
    Gen(T o) {
        ob = o;
    }

    // Вернуть ob
    T getob() {
        return ob;
    }

    // Показать тип T
    void showType() {
        System.out.println("Тип T: " + ob.getClass().getName());
    }
}

// Код для кнопки
// Работаем с обобщённым классом
// Создаём Gen-ссылку для Integer
Gen<Integer> iOb;

// Создаём объект Gen<Integer>
iOb = new Gen<Integer>(77);

// Показать тип данных, используемый iOb
        iOb.showType();

// Получить значение iOb
int value = iOb.getob();
System.out.println("Значение " + value);

// Создадим объект Gen для String
Gen<String> strOb = new Gen<String>("Обобщённый текст");

// Показать тип данных, используемый strOb
strOb.showType();

// Получить значение strOb
String str = strOb.getob();
System.out.println("Значение: " + str);
```

В результате мы получим:

```java
Типом T является java.lang.Integer
Значение: 77
Типом T является java.lang.String
Значение: Обобщённый текст
```

___

Изучим код. Мы объявили класс в следующей форме:

```java
class Gen<T> {
}
```

В угловых скобках используется T - имя параметра типа. 

Это имя:
- используется в качестве заполнителя, 
- куда будет подставлено имя реального типа, 
- переданного классу Gen при создании реальных типов. 

То есть:
- Параметр типа T применяется в классе всякий раз, 
когда требуется параметр типа. 
- Угловые скобки указывают, что параметр может быть обобщён.
- Сам класс при этом называется обобщённым классом или параметризованным типом.

Далее тип T используется для объявления объекта по имени ob:


```java
T ob; // объявляет объект типа T
```

- Вместо T подставится реальный тип, 
который будет указан при создании объекта класса Gen. 
- Объект ob будет объектом типа, переданного в параметре типа T. 
- Если в параметре T передать тип String, то экземпляр ob будет иметь тип String.

Рассмотрим конструктор Gen().

```java
Get(T o) {
    ob = o;
}
```

Параметр o имеет тип T. 

- Это значит, что реальный тип параметра o определяется типом, 
переданным параметром типа T при создании объекта класса Gen.

___


Параметр типа T также может быть использован для указания типа возвращаемого значения метода:

```java
T getob() {
    return ob;
}
```


## Наименование 

В именах переменных типа принято использовать заглавные буквы. 

Обычно:
- для коллекций используется буква E, 
- буквами K и V - типы ключей и значение (Key/Value), 
- а буквой T (и при необходимости буквы S и U) - любой тип.


___

## Использование

Как использовать обобщённый класс?

Можно создать версию класса Gen для целых чисел:

```java
Gen<Integer> iOb;
```

- в угловых скобках указан тип Integer, 
- т.е. это аргумент типа, который передаётся в параметре типа T класса Gen. 

Фактически:
- мы создаём версию класса Gen, 
- в которой все ссылки на тип T становятся ссылками на тип Integer.

Когда мы присваиваем ссылку на экземпляр, то угловые скобки также требуется указывать.

```java
iOb = new Gen<Integer>(77);
```

Полная версия записи может быть такой:

```java
iOb = new Gen<Integer>(new Integer(88));        // ???????????? оч странно
```

Но такая запись избыточна, 
так как можно использовать автоматическую упаковку значения 77 в нужный формат.

Аналогично, 
можно было бы использовать вариант без автоупаковки для получения значения:

```java
int value = iOb.getob().intValue(); // избыточный код
```

## Обобщения работают только с объектами

Поэтому нельзя использовать в качестве параметра элементарные типы вроде int или char:

```java
Gen<int> intOb = new Gen<int>(44); // нельзя!
```

## Сравнение

- хотя объекты iOb и strOb имеют тип Gen<T>, 
- они являются ссылками на разные типы и их сравнивать нельзя.

```java
iOB = strOb; // нельзя!
```

Использование обобщений:
- автоматически гарантирует безопасность типов во всех операциях, где они задействованы. 
- это очень мощный механизм, широко используемый в Java


# Обобщённый класс с двумя параметрами

Можно указать два и более параметров типа через запятую.

```java
class TwoGen<T, V> {
T ob1;
V ob2;

    // Передать конструктору ссылки на объекты двух типов
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    
    void showTypes() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }
    
    T getob1() {
        return ob1;
    }
    
    V getob2() {
        return ob2;
    }
    
    // Используем созданный класс
    TwoGen<Integer, String> twogenObj = new TwoGen<Integer, String>(77, "Обобщённый текст");
    
    // Узнаем типы
    twogenObj.showTypes();
    
    // Узнаем значения
    int value = twogenObj.getob1();
    System.out.println("Значение: " + value);
    
    String str = twogenObj.getob2();
    System.out.println("Значение: " + str);
}
```

# Обобщённые методы

Никто не запрещает создавать и методы с параметрами и возвращаемыми значениями в виде обобщений.

```java
public static <T> T getSomething(T... a){
    return a;
}
```


# Шаблоны аргументов

Шаблон аргументов указывается символом ? и представляет собой неизвестный тип.

```java
boolean sameAvg(Stats<?> ob) ...
```

По сути, вопрос заменяет Object и мы можем использовать любой класс, который в любом случае будет происходить от Object.

Мы можем ограничить диапазон объектов, указав суперкласс:

```java
public void addItems(ArrayList<? extends Animal> list)
```

- в этом случае можно использовать классы, которые могут быть наследниками Animal - Dog, Cat. 
- а String или Integer вы уже не сможете использовать.

Пример обобщённого метода:

```java
public static <T> T getMiddle(T... a) {
    return a[a.length / 2];
}
```

Переменная типа вводится после модификаторов и перед возвращаемым типом.

___

Отдельно стоит упомянуть новинку JDK 7, позволяющую сократить код:

```java
MyClass<Integer, String> mcObj = new MyClass<Integer, String>(33, "Meow"); // старый способ в JDK 6
MyClass<Integer, String> mcObj = new MyClass<>(33, "Meow"); // новый способ в JDK 7
```
Во второй строке используются только угловые скобки, без указания типов.

Помните, что нельзя создать экземпляр типа параметра.

```java
class Gen {
T ob;

    Gen() {
        ob = new T(); // Недопустимо
    }
}
```



___
___
___

```java
 
```

# Generics

Источник https://blog.skillfactory.ru/glossary/generics/

Дженерики (generics) в языке программирования Java — это сущности, которые могут хранить в себе данные только определенного типа. 

Например, список элементов, в котором могут быть одни числа. 

Но не только: дженерик — обобщенный термин для разных структур.

___

Можно представить дженерик как папку для бумаг:
- куда нельзя положить ничего, кроме документов определенного формата
- это удобно: помогает разделить разные данные и не допустить ситуаций, когда в сущность передается что-то не то

___

Дженерик-сущности еще иногда называют:
- параметризованными
- общими 
- или обобщенными.

Такая сущность создается со специальным параметром. 
 
Параметр позволяет указать, с каким типом данных она будет работать. 
Отсюда и название.

___

В разных источниках можно услышать про:
- «тип-дженерик»
- «класс-дженерик» 
- или «метод-дженерик». 

Это нормально, ведь обобщение и параметризация касаются всех этих сущностей, а generics — общий термин.



## Для чего нужны дженерики

С дженериками работают программисты на Java. 

Без этой возможности писать код, который работает только с определенным видом данных, было сложнее. 

Существовало два способа, и оба неоптимальные:

### Способ 1

Указывать проверку типа в коде:
- например, получать данные — и сразу проверять, 
- а если они не те, выдавать ошибку


- это помогло бы отсеять ненужные элементы
- но если бы класс понадобилось сделать более гибким (например, создать его вариацию для другого типа) его пришлось бы переписывать или копировать. 

 
- не получилось бы просто передать другой специальный параметр, чтобы тот же класс смог работать еще с каким-то типом;

### Способ 2

Полагаться на разработчиков. 

- например, оставлять в коде комментарий «Этот класс работает только с числами».
- слишком велик риск, что кто-то не заметит комментарий и передаст в объект класса не те данные. 
- и хорошо, если ошибка будет заметна сразу, а не уже на этапе тестирования.

Поэтому появились дженерики: они решают эту проблему, делают написание кода проще, а защиту от ошибок надежнее.

___


## Как работают дженерики

Чтобы вернее понять принцип работы, нужно представлять, как устроены сущности в Java. 

- Есть классы — это как бы «чертежи» будущих сущностей, описывающие, что они делают. 
- И есть объекты — экземпляры классов, непосредственно существующие и работающие. Класс — как схема машины, объект — как машина.

Когда разработчик создает дженерик-класс, он приписывает к нему параметр в треугольных скобках — метку. К примеру, так:

```java
class myClass<T>;
```

Теперь при создании объекта этого класса нужно будет указать на месте T название типа, с которым будет работать объект. 

Например, 
- myClass<Integer> <название объекта> для целых чисел 
- или myClass<String> <название объекта> для строк. 


- Сам класс остается универсальным, то есть общим.
- А вот каждый его объект специфичен для своего типа.


С помощью дженериков:
- можно создать один класс, 
- а потом на основе него — несколько объектов этого класса для разных типов. 

Не понадобится дублировать код и усложнять программу. 

Поэтому дженерики лучше и удобнее, чем проверка типа прямо в коде — тогда для каждого типа данных понадобился бы свой класс.

___

## Что такое raw types

В Java есть понятие raw types. 

Так называют дженерик-классы, из которых удалили параметр. 

То есть изначально класс описали как дженерик, но при создании объекта этого класса тип ему не передали. 
То есть что-то вроде myClass<> — тип не указан.


Дословно это название переводится как «сырые типы». 

Пользоваться ими сейчас в коммерческой разработке — чаще всего плохая практика. 

Но в мире все еще много старого кода, который написали до появления дженериков. 

Если такой код еще не успели переписать, в нем может быть очень много «сырых типов». Это надо учитывать, чтобы не возникало проблем с совместимостью.

___ 

## Дженерики-классы и дженерики-методы

Выше мы говорили, что дженериками могут быть разные сущности. 

Разберемся подробнее:

1. дженерик-классы (generic classes) — это классы, «схемы» объектов с параметром. При создании объекта ему передается тип, с которым он будет работать;


2. дженерик-методы (generics methods) — это методы, работающие по такому же принципу. Метод — это функция внутри объекта, то, что он может делать. Методу тип передается при вызове, сразу перед аргументами. Так можно создавать более универсальные функции и применять одну и ту же логику к данным разного типа.


Кстати, дженериками могут быть и встроенные классы или методы, 
и те, которые разработчик пишет самостоятельно. 

Например, встроенный ArrayList — список-массив — работает как дженерик.

___

## Что будет, если передать дженерику не тот тип

Если объекту класса-дженерика передать не тот тип, который указали при его объявлении, он выдаст ошибку. 

Например, если в ходе работы экземпляра myClass<Integer> в нем попытаются сохранить дробное число или даже строку, программа не скомпилируется. 

Вместо этого разработчик увидит ошибку: неверный тип.


Эта ошибка отличается от тех, которые возникнут, если не пользоваться дженериками. 

По ней сразу ясно, из-за чего она возникла и как можно ее исправить. 

Кроме того, она появляется сразу. Поэтому код становится легче отлаживать.



А если отправить «не тот» тип объекту без дженерика, действия с ним выполнятся с ошибкой. Но по этой ошибке не всегда очевидно, чем она вызвана. Худший вариант — код успешно запустится, но сработает неправильно: так ошибку будет найти еще сложнее.



___
___
___

1. принципы PECS 
2. wild card

описать с примерами 
описать принципы 
и объяснение почему оно так работает - почему это безопасно


и дз (вторая с wild картами)






### Еще примеры

https://skillbox.ru/media/base/dzheneriki-v-java-dlya-samykh-malenkikh/?topic=base&section=dzheneriki-v-java-dlya-samykh-malenkikh

___ 

## Еще примеры

### Пример №1 без дженериков:

```java
public class Start {

    public static void main(String[] args) {
        PrintClass printClass = new PrintClass();
        printClass.printAll();
        printClass.print(1);
    }

}
```


```java
public class PrintClass {
    ArrayList<String> values;       //поле приватное и не имеет сеттера геттера

    //сама коллекция должна инициироваться в конструкторе
    PrintClass() {
        values = new ArrayList<>(List.of("Раз", "Два", "Четыре", "Восемь"));
    }

    //Вывести все значения из списка. Каждое новое значение выводится с новой строки
    public void printAll() {
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println();
    }

    //Вывести значение из списка под указанным номером
    public void print(int a) {
        System.out.println(values.get(a));
    }

}

```

### Пример №2 с дженериками:

```java
public class Start {

    public static void main(String[] args) {
        PrintClass <String> printClass = new PrintClass<>();
        printClass.printAll();
        printClass.print(1);
    }

}
```

```java 
public class PrintClass <T> {
ArrayList<T> values;       //поле приватное и не имеет сеттера геттера

    //сама коллекция должна инициироваться в конструкторе
    PrintClass() {
        values = new ArrayList (List.of("Раз", "Два", "Четыре", "Восемь"));
    }

    //Вывести все значения из списка. Каждое новое значение выводится с новой строки
    public void printAll() {
        for (T value : values) {
            System.out.println(value);
        }
        System.out.println();
    }

    //Вывести значение из списка под указанным номером
    public void print(int a) {
        System.out.println(values.get(a));
    }

}
```

___

## Что стоит запомнить

1. мы указываем или тип конкретный или если допускаем неск типов - берем Generic
2. мы по факту описываем абстрактно в классе с T
3. а при создании указываем уже определенный тип данных


4. и если мы допустим уже в объект1 добавили тип string, 
5. в этот же объект1 тип int не добавим - будет ошибка компиляции
6. соответственно нам не надо делать доп логику на проверку (код сокращается)


7. при создании объекта указывать тип слева (обязательно) - справа просто пустым можно <>, совсем БЕЗ скобок НЕЛЬЗЯ
8. указывать можно или extends (вниз) или super (вверх) - выбрать


9. public class Cage < T extends Animals >{..} - тут пишем абстрактно Т, подразумеваем Animals или наследников
10. public void addAnimal( T animal ){..} - тут пишем абстрактно тип и название объекта с мал буквы

Это и есть ключевое, что пока стоит запомнить (был затык с этим)

___

### Пример:

```java 
public abstract class Animal {
    private String name;
    private int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
```

```java 
public class Snake extends Animal {

    Snake(String name, int age) {
        super(name, age);
    }

}
```

```java 
public class Dolphin extends Animal {

    Dolphin(String name, int age) {
        super(name, age);
    }

}
```

```java 
public class Bear extends Animal {

    Bear(String name, int age) {
        super(name, age);
    }

}
```

```java 
public class Cage<T extends Animal> {
    private int numberCage;             //номер клетки
    private int capacity;               //вместимость (считаю не может быть меньше 1)
    private int added;                  //добавлено
    private ArrayList<T> animals;       //список животных

    Cage(int capacity, int numberCage) {
        animals = new ArrayList<>();
        if (capacity < 1) {
            System.out.println("Вместимость не может быть меньше 1");
        } else {
            this.capacity = capacity;
            this.numberCage = numberCage;
        }
    }

    //добавление животного (не добавлять животное, если превышен лимит максимального кол-ва)
    public void addAnimal(T animal) {
        System.out.print("Пробуем добавить в клетку №" + numberCage + " " + animal.getName() + " = ");
        if (isFreePlaces(animal)) {                     //если пусто - ок
            animals.add(animal);
            added++;
            System.out.println("Успех. Животное добавлено.");
        } else if (capacity > added) {                  //если вместимость позволяет
            animals.add(animal);
            added++;
            System.out.println("Успех. Животное добавлено.");
        } else {
            System.out.println("Отказ. В клетке максимальное кол-во животных.");
        }
    }

    //определяет возможность добавления животного в клетку
    public boolean isFreePlaces(T animal) {
        if (animals.isEmpty()) {                        //если пусто - ок
            return true;
        } else
            return (capacity > added);                  //если вместимость позволяет
    }

    //вывести животного из клетки (метод возвращает животное и удаляет его из списка животных клетки
    public Animal takeOutAnimal(String nameAnimal) {
        Animal tempAnimal = null;
        for (Animal animal : animals) {
            if (animal.getName().equals(nameAnimal)) {
                animals.remove(animal);
                System.out.println(animal.getName() + ": Животное выведено из клетки");
                tempAnimal = animal;
                break;
            }
        }
        return tempAnimal;
    }

    //перевод жив из тек клетки в другую (убед что в клетке куда перев есть своб место, иначе перев не вып)
    public void transferAnimal(String nameAnimal, Cage cageWhere) {
        System.out.println("Попытка трансфера животного " + nameAnimal
                + " из клетки №" + numberCage + " в " + cageWhere.getNumberCage());
        Animal tempAnimal = null;
        //проверим можно ли перевести в КлеткуБ
        boolean access = cageWhere.isFreePlaces(getAnimalByName(nameAnimal));
        if (access) {
            System.out.println("Перевод возможен");
            tempAnimal = takeOutAnimal(nameAnimal);     //вывести
            cageWhere.addAnimal(tempAnimal);            //добавить
        } else {
            System.out.println("Перевод невозможен, перепроверьте вместимость и тип животного");
        }
    }

    public void printAnimalsAdded() {
        System.out.println("Список животных в клетке №" + numberCage + ":");
        if (animals.isEmpty()) {
            System.out.println("Пусто");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal.getName());
            }
        }
        System.out.println();
    }

    //получение животного по его имени
    public Animal getAnimalByName(String nameAnimal) {
        Animal tempAnimal = null;
        for (Animal animal : animals) {
            if (animal.getName().equals(nameAnimal)) {
                tempAnimal = animal;
            }
        }
        return tempAnimal;
    }

    public Animal getYoungestAnimal() {
        int value = Integer.MAX_VALUE;
        Animal tempAnimal = null;
        for (Animal animal : animals) {
            if (animal.getAge() < value) {
                tempAnimal = animal;
                value = animal.getAge();
            }
        }
        return tempAnimal;
    }

    public Animal getOldestAnimal() {
        int value = 0;
        Animal tempAnimal = null;
        for (Animal animal : animals) {
            if (animal.getAge() > value) {
                tempAnimal = animal;
                value = animal.getAge();
            }
        }
        return tempAnimal;
    }



    public int getCapacity() {
        return capacity;
    }

    public ArrayList<T> getAnimals() {
        return animals;
    }

    public int getNumberCage() {
        return numberCage;
    }

}
```

```java 
public class Start {

    public static void main(String[] args) {
        Snake snake1 = new Snake("snake1", 1);
        Snake snake2 = new Snake("snake2", 2);
        Snake snake3 = new Snake("snake3", 3);
        Dolphin dolphin1 = new Dolphin("dolphin1", 1);
        Dolphin dolphin2 = new Dolphin("dolphin2", 2);
        Dolphin dolphin3 = new Dolphin("dolphin3", 3);
        Dolphin dolphin4 = new Dolphin("dolphin4", 4);
        Bear bear1 = new Bear("bear1", 1);
        Bear bear2 = new Bear("bear2", 2);

        ArrayList<String> arrayList = new ArrayList<>();
        Cage<Snake> cage1 = new Cage(2, 11);
        Cage<Dolphin> cage2 = new Cage(3, 12);
        Cage<Bear> cage3 = new Cage(1, 13);
        Cage<Dolphin> cage4 = new Cage(10, 14);

        /**
         * Показ общего функционала (добавление удаление из клетки)
         */
        System.out.println("------------Показ общего функционала (добавление-удаление из клетки)------------");
        System.out.println();
        cage1.addAnimal(snake1);
        //cage1.addAnimal(dolphin1); //сразу ошибка на уровне компиляции, у нас уже cage1 исп тип "змея", а не "дельфин"
        cage1.addAnimal(snake2);
        cage1.addAnimal(snake3);
        cage1.printAnimalsAdded();

        cage2.addAnimal(dolphin1);
        cage2.addAnimal(dolphin2);
        cage2.addAnimal(dolphin3);
        cage2.addAnimal(dolphin4);
        cage2.printAnimalsAdded();

        System.out.println("самый молодой возраст у " + cage2.getYoungestAnimal().getName()
                + " = " + cage2.getYoungestAnimal().getAge());
        System.out.println("самый большой возраст у " + cage2.getOldestAnimal().getName()
                + " = " + cage2.getOldestAnimal().getAge());
        System.out.println();

        cage2.takeOutAnimal("dolphin2");
        cage2.printAnimalsAdded();

        cage3.addAnimal(bear1);
        cage3.addAnimal(bear2);
        cage3.printAnimalsAdded();

        cage4.printAnimalsAdded();
        cage2.transferAnimal("dolphin3", cage4);
        cage2.printAnimalsAdded();
        cage4.printAnimalsAdded();

        cage2.transferAnimal("dolphin1", cage4);
        cage2.printAnimalsAdded();
        cage4.printAnimalsAdded();

        /**
         * В двух разных клетках поменять местами самое старое и самое молодое животное
         */
        System.out.println("------------В двух разных клетках поменять местами самое старое и самое молодое животное------------");
        System.out.println();
        Cage<Snake> cage20 = new Cage(3, 20);
        Cage<Dolphin> cage30 = new Cage(3, 30);
        Cage<Bear> cage40 = new Cage(3, 40);
        Cage<Snake> cage50 = new Cage(3, 50);

        Snake snake101 = new Snake("snake101", 1);
        Snake snake102 = new Snake("snake102", 2);
        Snake snake103 = new Snake("snake103", 3);
        Snake snake104 = new Snake("snake104", 4);

        cage20.addAnimal(snake101);
        cage20.addAnimal(snake102);
        cage50.addAnimal(snake103);
        cage50.addAnimal(snake104);

        cage20.printAnimalsAdded();
        cage30.printAnimalsAdded();
        cage40.printAnimalsAdded();
        cage50.printAnimalsAdded();

        changeAnimalYoungestAndOldest(cage20, cage50);
    }

    public static void changeAnimalYoungestAndOldest(Cage cage1, Cage cage2) {
        System.out.println("---Смена местами самого молодого и самого старого---");
        cage1.printAnimalsAdded();
        cage2.printAnimalsAdded();
        cage1.transferAnimal(cage1.getYoungestAnimal().getName(), cage2);
        cage2.transferAnimal(cage2.getOldestAnimal().getName(), cage1);
        cage1.printAnimalsAdded();
        cage2.printAnimalsAdded();
    }

}
```

Вывод:

```java 
/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=58667:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/s.kufarev/IdeaProjects/pvlk/out/production/pvlk generics.task2.Start
------------Показ общего функционала (добавление-удаление из клетки)------------

Пробуем добавить в клетку №11 snake1 = Успех. Животное добавлено.
Пробуем добавить в клетку №11 snake2 = Успех. Животное добавлено.
Пробуем добавить в клетку №11 snake3 = Отказ. В клетке максимальное кол-во животных.
Список животных в клетке №11:
snake1
snake2

Пробуем добавить в клетку №12 dolphin1 = Успех. Животное добавлено.
Пробуем добавить в клетку №12 dolphin2 = Успех. Животное добавлено.
Пробуем добавить в клетку №12 dolphin3 = Успех. Животное добавлено.
Пробуем добавить в клетку №12 dolphin4 = Отказ. В клетке максимальное кол-во животных.
Список животных в клетке №12:
dolphin1
dolphin2
dolphin3

самый молодой возраст у dolphin1 = 1
самый большой возраст у dolphin3 = 3

dolphin2: Животное выведено из клетки
Список животных в клетке №12:
dolphin1
dolphin3

Пробуем добавить в клетку №13 bear1 = Успех. Животное добавлено.
Пробуем добавить в клетку №13 bear2 = Отказ. В клетке максимальное кол-во животных.
Список животных в клетке №13:
bear1

Список животных в клетке №14:
Пусто

Попытка трансфера животного dolphin3 из клетки №12 в 14
Перевод возможен
dolphin3: Животное выведено из клетки
Пробуем добавить в клетку №14 dolphin3 = Успех. Животное добавлено.
Список животных в клетке №12:
dolphin1

Список животных в клетке №14:
dolphin3

Попытка трансфера животного dolphin1 из клетки №12 в 14
Перевод возможен
dolphin1: Животное выведено из клетки
Пробуем добавить в клетку №14 dolphin1 = Успех. Животное добавлено.
Список животных в клетке №12:
Пусто

Список животных в клетке №14:
dolphin3
dolphin1

------------В двух разных клетках поменять местами самое старое и самое молодое животное------------

Пробуем добавить в клетку №20 snake101 = Успех. Животное добавлено.
Пробуем добавить в клетку №20 snake102 = Успех. Животное добавлено.
Пробуем добавить в клетку №50 snake103 = Успех. Животное добавлено.
Пробуем добавить в клетку №50 snake104 = Успех. Животное добавлено.
Список животных в клетке №20:
snake101
snake102

Список животных в клетке №30:
Пусто

Список животных в клетке №40:
Пусто

Список животных в клетке №50:
snake103
snake104

---Смена местами самого молодого и самого старого---
Список животных в клетке №20:
snake101
snake102

Список животных в клетке №50:
snake103
snake104

Попытка трансфера животного snake101 из клетки №20 в 50
Перевод возможен
snake101: Животное выведено из клетки
Пробуем добавить в клетку №50 snake101 = Успех. Животное добавлено.
Попытка трансфера животного snake104 из клетки №50 в 20
Перевод возможен
snake104: Животное выведено из клетки
Пробуем добавить в клетку №20 snake104 = Успех. Животное добавлено.
Список животных в клетке №20:
snake102
snake104

Список животных в клетке №50:
snake103
snake101


Process finished with exit code 0

```


___
___
___
___
___
___
___
___


### Пример 2:

```java
package generics.task4;

public abstract class Treasure {    //сокровище - абстрактный родительский класс для бриллиантов и золота
    int quantity;                   //кол-во единиц, например кол-во золотых или кол-во бриллиантов

    Treasure(int quantity) {
         this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    abstract int getPrice();

    abstract int getSumMoney();

}
```

```java
package generics.task4;

public class Diamonds extends Treasure {
    private final int price = 100000;   //стоимость в долларах

    Diamonds(int quantity) {
        super(quantity);
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    int getSumMoney() {
        return super.quantity * price;
    }

    @Override
    public String toString() {
        return "Это Бриллианты детка!";
    }

}
```

```java
package generics.task4;

public class Gold extends Treasure {
    private final int price = 10000;   //стоимость в долларах

    Gold(int quantity) {
        super(quantity);
    }

    @Override
    int getPrice() {
        return price;
    }

    @Override
    int getSumMoney() {
        return super.quantity * price;
    }

    @Override
    public String toString() {
        return "Это Золото детка!";
    }

}
```

```java
package generics.task4;

public class TreasureMap {                        //карта сокровищ TreasureMap
    private final String nameIsland;              //название острова
    private final int stepsUntilChest;            //кол-во шагов до закопанного сундука (Chest)

    TreasureMap(String nameIsland, int stepsUntilChest) {
        this.nameIsland = nameIsland;
        this.stepsUntilChest = stepsUntilChest;
    }

    public String getName() {
        return nameIsland;
    }

    public int getStepsUntilChest() {
        return stepsUntilChest;
    }

}
```

```java
package generics.task4;

public class Island {   //класс острова Island содержит сундук с сокровищем и названием острова
    private final String name;
    private final Chest chest;

    Island (String name, Chest chest) {
        this.name = name;
        this.chest = chest;
    }

    public String getName() {
        return name;
    }

    public Chest getChest() {
        return chest;
    }

}
```

```java
package generics.task4;

public class Chest<T extends Treasure> {    //сундук с сокровищами
    T treasure;

    Chest(T treasure) {
        this.treasure = treasure;
    }

}
```

```java
package generics.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Start {

    /**
     * найдите сокровище, которое спрятано на острове
     * 1. и сообщите о его содержимом
     * 2. и сколько шагов пришлось пройти, чтобы найти сокровище
     * 3. если острова нет, выведите сообщение "Остров не существует"
     * 4. не забудьте о том, что у нас есть карта сокровищ, в которой указано название острова
     * опционально:
     * 5. после этого, выведите те острова, в котором спрятаны пустые сундуки
     * 6. а после выведите остров с самым богатым сундуком
     */
    public static void main(String[] args) {
        Island island1 = new Island("Филиппины", new Chest<>(new Diamonds(0)));
        Island island2 = new Island("Мальдивы", new Chest<>(new Diamonds(50)));
        Island island3 = new Island("Бермуда", new Chest<>(new Gold(33)));
        Island island4 = new Island("Майорка", new Chest<>(new Gold(11)));

        TreasureMap treasureMap1 = new TreasureMap("Филиппины", 33);
        TreasureMap treasureMap2 = new TreasureMap("Мальдивы", 17);
        TreasureMap treasureMap3 = new TreasureMap("Бермуда", 56);
        TreasureMap treasureMap4 = new TreasureMap("Майорка", 6);
        TreasureMap treasureMap5 = new TreasureMap("Ролейно", 44);
        TreasureMap treasureMap6 = new TreasureMap("Мышиный", 22);

        ArrayList<Island> listIslands = new ArrayList<>(List.of(
                island1, island2, island3, island4));
        ArrayList<TreasureMap> treasureMaps = new ArrayList<>(List.of(
                treasureMap1, treasureMap2, treasureMap3, treasureMap4, treasureMap5, treasureMap6));

        if (tryLabyrinth()) {                                   //отправимся в смертельный лабиринт за поиском карты
            TreasureMap ourTreasureMap = getMap(treasureMaps);                              //если успех, получим карту
            Island tempIsland = findTreasureInWorld(ourTreasureMap.getName(), listIslands); //попробуем найти остров в мире
            if (tempIsland != null) {
                System.out.println();
                System.out.println("---Что же мы нашли?!---");
                System.out.println(tempIsland.getChest().treasure.toString());
                System.out.println("кол-во: " + tempIsland.getChest().treasure.getQuantity());
                System.out.println("прайс: " + tempIsland.getChest().treasure.getPrice());
                System.out.println("итого денег: " + tempIsland.getChest().treasure.getSumMoney());
            }
        }

    }

    /**
     * Смертельный лабиринт - либо получишь карту, либо настигнет смерть
     */
    public static boolean tryLabyrinth() {
        System.out.println("---Смертельный лабиринт - либо получишь карту, либо настигнет смерть---");
        Random random = new Random();
        if (1 == random.nextInt(2) + 1) {
            System.out.println("Успех, ранен, однако открыт доступ к карте!!!");
            System.out.println();
            return true;
        } else {
            System.out.println("Сыграл в ящик");
            return false;
        }
    }

    /**
     * если лабиринт пройден получите карту и распишитесь вот тут
     */
    public static TreasureMap getMap(ArrayList<TreasureMap> treasureMaps) {
        System.out.println("---Получение карты из рук древней статуи---");
        Random random = new Random();
        int bound = random.nextInt((treasureMaps.size() - 1) + 1);
        System.out.println("Карта острова: " + treasureMaps.get(bound).getName());
        System.out.println("Кол-во шагов до сундука там от точки: " + treasureMaps.get(bound).getStepsUntilChest());
        System.out.println();
        return treasureMaps.get(bound);
    }

    /**
     * Попробуй найти название острова с карты
     */
    public static Island findTreasureInWorld(String islandNameFromMap,
                                    ArrayList<Island> listIslandsInTheWorld) {  //список всех островов в мире
        System.out.println("---Смотрим есть ли такой остров в реестре на настоящее время---");
        boolean exists = false;
        Island tempIsland = null;
        for (Island island : listIslandsInTheWorld) {
            if (Objects.equals(island.getName(), islandNameFromMap)) {
                exists = true;
                tempIsland = island;
                break;
            }
        }
        if (exists) {
            System.out.println("Успех, такой остров существует, мы знаем где он находится!");
        } else {
            System.out.println("Остров не существует, кончай этим заниматься, устройся на работу наконец!");
        }
        return tempIsland;
    }
    
}

```

#### Вывод - вариант1:

```java
---Смертельный лабиринт - либо получишь карту, либо настигнет смерть---
Успех, ранен, однако открыт доступ к карте!!!

---Получение карты из рук древней статуи---
Карта острова: Филиппины
Кол-во шагов до сундука там от точки: 33

---Смотрим есть ли такой остров в реестре на настоящее время---
Успех, такой остров существует, мы знаем где он находится!

---Что же мы нашли?!---
Это Бриллианты детка!
кол-во: 0
прайс: 100000
итого денег: 0
```

#### Вывод - вариант2:

```java
Сыграл в ящик
```

#### Вывод - вариант3:

```java
---Смертельный лабиринт - либо получишь карту, либо настигнет смерть---
Успех, ранен, однако открыт доступ к карте!!!

---Получение карты из рук древней статуи---
Карта острова: Мальдивы
Кол-во шагов до сундука там от точки: 17

---Смотрим есть ли такой остров в реестре на настоящее время---
Успех, такой остров существует, мы знаем где он находится!

---Что же мы нашли?!---
Это Бриллианты детка!
кол-во: 50
прайс: 100000
итого денег: 5000000
```











