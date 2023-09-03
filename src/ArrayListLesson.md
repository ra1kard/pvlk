# Коллекции

Для хранения наборов данных в _Java_ предназначены массивы. Однако их не всегда удобно использовать, прежде всего потому, что они имеют фиксированную 
длину. Эту проблему в _Java_ решают коллекции. Однако суть не только в гибких по размеру наборах объектов, но в и том, что классы коллекций реализуют 
различные алгоритмы и структуры данных, например, такие как стек, очередь, дерево и ряд других.

Любая коллекция взаимодействует только с ссылочными типами данных, а с примитивами работать не умеет.

Примитивы:
* `byte`
* `short`
* `int`
* `long`
* `double`
* `float`
* `boolean`
* `char`

Примеры ссылочных типов данных:
* `String`
* `Byte`
* `Short`
* `Integer`
* `Long`
* `Double`
* `Float`
* `Boolean`
* `Character`

## ArrayList

`ArrayList` - коллекция, которая основана на массиве. Использует реализацию массива, с которым взаимодействует по своим алгоритмам.
Изначально этот массив имеет длину, равную 10 элементам. При необходимости, этот массив расширяется, то есть увеличивается в 1,5 раза. Происходит
этот в тот момент, когда все существующие ячейки заняты, а программист пытается добавить значение.



### Работа с ArrayList

#### Инициализация

```java
ArrayList<Integer> list = new ArrayList<>();    //Инициализация пустого списка целых чисел
ArrayList<Double> list = new ArrayList<>();    //Инициализация пустого списка десятичных чисел
ArrayList<String> list = new ArrayList<>();    //Инициализация пустого списка строк

ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7)); //Инициализация списка целых чисел
ArrayList<String> list = new ArrayList<>(List.of("Привет", "мир")); //Инициализация списка строк
```

Можно создать новый список, основываясь на уже существующем списке. Тогда, все значения из существующего списка скопируются в новый список
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
ArrayList<Integer> newList = new ArrayList<>(list);                             //Указывается список list, из которого будут взяты значения
```
#### Добавление элементов в ArrayList
```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);               //Добавление элемента
list.add(20);               //Добавление элемента
list.add(35);               //Добавление элемента
list.add(-8);               //Добавление элемента
list.add(10);               //Добавление элемента
System.out.println(list);
```

#### Вставка элемента в ArrayList
Позволяет вставить на указанную позицию определённое значение. Для этого используется метод `add`, который принимает в качестве первого параметра
индекс для вставки, а в качестве второго параметра значение, которое будет вставлено.

```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
list.add(2, 666);               //На вторую позицию вставляется число 666
System.out.println(list);
```

#### Замена элемента коллекции ArrayList
В `ArrayList` возможно заменить элемент под определённым номером. Для этого используется метод `set`, принимающий в качестве первого параметра
индекс заменяемого элемента, а в качестве второго параметра новое значение.
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
list.set(3, 6984);                      //Заменить значение третьего элемента на число 6984
System.out.println(list);
```

#### Получение длины ArrayList
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
int size = list.size();         //Длина списка
System.out.println(size);
```

#### Получение элемента ArrayList
Как и у массива, у `ArrayList` есть возможность получения элемента по его индексу. Индексация, так же как и у массива, начинается с нуля. При попытке
получения значения, индекса которого не существует, будет сгенерирована ошибка.
Для получения элемента по индексу используется метод `get`, принимающий в качестве параметра целое число - индекс элемента.
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));
System.out.println(list.get(3));
System.out.println(list.get(10));            //ОШИБКА. Нет такого индекса
```

#### Проверка наличия элемента
Благодаря методу `contains` можно проверить наличие элемента в коллекции. Метод `contains` принимает в качестве параметра искомое значение, а возвращает
_true_ - если такой элемент есть или _false_, если такого элемента нет.
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7));

boolean isContains = list.contains(10);
System.out.println(isContains);      //true - если указанный элемент есть в списке

System.out.println(list.contains(6895));    //false - если указанного элемента нет в списке
```

#### Получение номера элемента в списке
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 10, 66, 7, 10));
System.out.println(list.indexOf(10));           // Ищет только первое совпадение
System.out.println(list.indexOf(6684));         // Если искомого элемента нет, то возвращается -1
System.out.println(list.lastIndexOf(10));    // Номер последнего совпадения
```

#### Удаление элемента из списка
Метод `remove` отвечает за удаление элемента из коллекции. У метода `remove` есть две модификации:
* удаление по номеру элемента
* удаление по значению

Для удаления по номеру элемента достаточно лишь указать этот номер в качестве параметра.
```java
ArrayList<String> listString = new ArrayList<>(List.of("hello", "world", "!"));
listString.remove(2);
System.out.println(listString);
```

```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
list.remove(2);         //Удаление по индексу
System.out.println(list);
```

**Если указать индекс за границами коллекции, то будет сгенерирована ошибка `IndexOutOfBoundsException`.**

Для удаления по значению достаточно указать удаляемое значение элемента коллекции в качестве параметра метода. Будет удалено
только первое совпадение. Например, если в коллекции несколько строк "Hello" и вызывается метод `remove("Hello")`, то удалится
только первое слово "Hello", а остальные останутся.

**Если указать значение, которого в списке нет, то ничего не произойдёт.**

```java
ArrayList<String> listString = new ArrayList<>(List.of("hello", "world", "!"));
listString.remove("world");         //Удаление по значению
System.out.println(listString);
```
Но, стоит учесть, что в случае, если список хранит целые числа, то удаление по значению выполняется особенным образом. Если просто указать
параметром целое число, то оно будет воспринято как `int`, а не как `Integer` (тип хранимого значения коллекции).

```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
//list.remove(2);         //Удаление по индексу
list.remove((Integer) 10);      //Удаление по значению
System.out.println(list);
```

### Получение подсписка

Метод `subList` принимает два параметра: индекс начала подсписка и индекс конца подсписка. Работает этот метод схожим образом с методом
`substring` у строк. Стоит учесть, что метод `subList` возвращает тип `List`, а не `ArrayList`, поэтому, может потребоваться дополнительное
преобразование через создание нового `ArrayList`.

```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 17, 50, 60,-8));
ArrayList<Integer> sublist = new ArrayList<>(list.subList(3, 6));
System.out.println(sublist);
```

#### Проверка коллекции на пустоту

Проверить что коллекция пуста можно двумя способами.

Первый способ:
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
boolean isEmpty = list.size() == 0;
System.out.println(isEmpty);
```

Первый способ не очень лаконичный, поэтому для коллекций существует специальный метод `isEmpty()`, проверяющий список на пустоту.

Второй способ:
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
System.out.println(list.isEmpty());
```

Метод `isEmpty` возвращает _true_, если в списке нет элементов, иначе возвращает _false_

#### Сравнение списков

Списки, как и строки, сравниваются при помощи метода `equals`.
```java
ArrayList<String> stringList = new ArrayList<>();
stringList.add("Hello");
stringList.add("World");

ArrayList<String> secondStringList = new ArrayList<>();
secondStringList.add("Hello");
secondStringList.add("World");

// Сравнение двух списков
if (stringList.equals(secondStringList)){
    System.out.println("Листы равны");
} else {
    System.out.println("Листы не равны");
}
```

#### Копирование списков

Список нельзя просто присвоить при помощи =. Если так сделать, то новому списку будет присвоено не значение оригинала, а ссылка на оригинал. Поэтому
любое изменение с одним из двух списков обязательно отразятся на другом списке.

В примере ниже отражён случай неправильного копирования:
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
ArrayList<Integer> newList = list;                  //в newList помещается ссылка на list
newList.add(5555);                                  //Меняем копию
System.out.println("Оригинал: " + list);            //Вывод оригинального списка
System.out.println("Копия: " + newList);            //Вывод копии
```

При добавлении числа 5555 в список `newList`, который является "копией" оригинального списка `list`, это число появляется и в оригинальном списке. Это связано с тем,
что скопирована была именно ссылка. Следовательно, в памяти не было создано нового списка и обе переменные `list` и `newList` ссылаются на один и тот же список.

Чтобы скопировать список правильно есть два способа. Первый способ это создать новый список через _new_ и инициализировать его существующим списком.
В таком случае будет создана полная копия первого списка в памяти и это будет считаться копией.

```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
ArrayList<Integer> newList = new ArrayList<>(list);   //newList копирует элементы list
newList.add(5555);                                  //Меняем копию
System.out.println("Оригинал: " + list);            //Вывод оригинального списка
System.out.println("Копия: " + newList);            //Вывод копии
```

Есть ещё один вариант копирования списка - метод `clone()`.
```java
ArrayList<Integer> list = new ArrayList<>(List.of(10, 20, -5, -44, 66, 7, 10));
ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
newList.add(5555);                                  //Меняем копию
System.out.println("Оригинал: " + list);            //Вывод оригинального списка
System.out.println("Копия: " + newList);            //Вывод копии
```

#### Массив в коллекцию
```java
int[] array = {10, 20, 30, -5, 40, 55};
ArrayList<Integer> list = new ArrayList<>();
for (int i = 0; i < array.length; i++) {
    list.add(array[i]);
}
System.out.println(list);
```

#### Коллекция в строку
Коллекция может быть конвертирована в строку точно также как и массив, при помощи метода `String.join`.
```java
ArrayList<String> strings = new ArrayList<>(List.of("Hello", "World"));
String s = String.join(" ", strings);
System.out.println(s);
```

Также, можно воспользоваться специальным методом `Collections.addAll`, принимающим в качестве первого параметра список, а в качестве
второго параметра массив.
```java
String[] array = {"Привет мир", "Я твой герой", "Power Ranger"};
ArrayList<String> list = new ArrayList<>();
Collections.addAll(list, array);
```