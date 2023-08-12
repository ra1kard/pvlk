# Строки

## Общие сведения

### Определение строки

**_Строка_** - это набор символов. Можно представлять строку в виде одномерного массива, где каждый элемент массива является символом.
**_Подстрока_** - это часть какой-то строки

Каждый элемент строки имеет свой номер. Нумерация начинается с нуля.

Строковый тип представлен в _Java_ классом (типом) `String`

### Особенности

1. Тип `String` в _Java_ является **иммутабельным** (неизменяемым). Это означает, что нельзя изменить часть строковой переменной. Она может быть только перезаписана целиком!
2. Класс `String` является ссылочным типом данных

## Объявление строковой переменной

### Строка с инициализацией

```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка"; //Строка с инициализацией
        System.out.println(str);
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        String str = "☺ ♫♫☼ -+!!!!! ☻♥♦♣♠"; //Строка с инициализацией
        System.out.println(str);
    }
}
```

### Символы цифр в строке

```java
class Main {
    public static void main(String[] args) {
        String numberStr = "256";     //Это не число 256. Это символы 2, 5 и 6
        System.out.println(str);

        //Не произойдет сложения. numberStr это строка, содержащая символы 2, 5 и 6. Поэтому результатом сложения строки и числа будет "склеивание"
        System.out.println(numberStr + 44); 
    }
}
```

### Пустая строка

В пустой строке нет никаких символов. Объявление происходит просто через двойные кавычки. **Пробел тоже символ!!!**
```java
class Main {
    public static void main(String[] args) {
        String empty = "";              //Пустая строка

        System.out.println(str);
    }
}
```

## Методы строк

### Получение длины строки (length())

Длина строки это просто **количество** символов в этой строке. Работает аналогично методу `length` у массивов.

Номер (инидекс) последнего символа всегда можно получить, руководствуясь формулой `length() - 1`.


```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        int length = str.length();
        System.out.println(length);
    }
}
```

### Конкатенация

**_Конкатенация_** - сложение двух строк. Если сложить две строки, результатом будет объединённая строка.

```java
class Main {
    public static void main(String[] args) {
        System.out.println("Что, где, " + "когда?");
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        String str1 = "Какая то строка";
        String str2 = "была введена";
        
        System.out.println(str1 + " " + str2);
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        String str1 = "Какая то строка";
        String str2 = "была введена";
        
        String strResult = str1 + " " + str2;
        System.out.println(strResult);
        
        String s = str1 + " не была введена";
        System.out.println(s);
    }
}
```

### Получение символа строки по его номеру (charAt(int))

В качестве параметра методу передаётся **номер** символа в строке. Если указать номер элемента, которого в строке нет, будет сгенерирована ошибка _StringIndexOutOfBoundsException_

```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        System.out.println(str.charAt(0));            //Получение символа строки, хранящимся под индексом 0
                
        System.out.println(str.charAt(100));        //ОШИБКА! Нет символа с указанным номером
    }
}
```

Метод возвращает символ, который хранится под указанным номером. Символ - это отдельный тип данных, который называется `char`.

```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        char ch = str.charAt(3);                     //charAt(..) возвращает тип char
        System.out.println(ch);
    }
}
```

### Как превратить тип char в тип String

Для конвертации типа `char` в тип `String` может использоваться конкатенация
```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        char ch = str.charAt(3);                     //charAt(..) возвращает тип char
        
        String newStr = ch + "";                    //Превратили char в String
    }
}
```

Более лаконичным способом приведения типов будет использование специального метода `valueOf(char)` класса `String`.
```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        char ch = str.charAt(3);                     //charAt(..) возвращает тип char
        
        String newStr = String.valueOf(ch);
    }
}
```

### Получение номера первого вхождения указанного символа или подстроки (indexOf(String))

Возвращает номер первого совпадения для указанной в качестве параметра подстроки. Если подстроки нет в строке, тогда возвращается -1.

```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        
        int index = str.indexOf("а");
        System.out.println(index);           //Получение номера первого вхождения символа "а"
        
        System.out.println(str.indexOf("то"));          //Получение номера начала подстроки "то"
//        System.out.println(str.lastIndexOf("а"));     //Получение номера последнего вхождения символа "а"
        System.out.println(str.indexOf("Hello"));       //Возвращает -1, потому что подстроки "Hello" нет в строке str
    }
}
```

### Получение номера последнего вхождения указанного символа или подстроки (lastIndexOf(String))

Возвращает номер последнего совпадения для указанной в качестве параметра подстроки. Если подстроки нет в строке, тогда возвращается -1.

```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        System.out.println(str.lastIndexOf("а"));     //Получение номера последнего вхождения символа "а"
    }
}
```

### Проверка наличия подстроки в строке (contains(String))

Метод `contains()` возвращает `true`, если указанная подстрока содержится в проверяемой строке. Иначе, возвращает `false`.

```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        System.out.println(str.contains("Какая"));      //true, потому что в строке есть подстрока "Какая"
        System.out.println(str.contains("какая"));      //false, потому что в строке нет подстроки "какая". Дело в регистре
        System.out.println(str.contains("а"));          //true, потому что в строке есть подстрока "а"
        
        boolean b = str.contains("hello");              //false, потому что в строке нет подстроки "hello"
        System.out.println(b);  
    }
}
```

Метод `contains()` может быть использован в качестве любого условия. Это может быть оператор `if` или цикл `while` и т.п.

```java
class Main {
    public static void main(String[] args) {
        //Если в str2 есть подстрока str1
        String str1 = "aa";
        String str2 = "Kawabangaaa";
        if (str2.contains(str1)){
            System.out.println("Совпадение есть");
        }
    }
}
```

### Получение подстроки (substring(int) или substring(int, int))

Метод `substring` позволяет получить подстроку из строки, между заданными индексами. Существует два варианта метода:

1. substring(int) - в качестве параметра передаётся одно целое число - начало подстроки. Метод вернёт подстроку от указанного символа и до конца самой строки
2. substring(int, int) - в качестве параметра передаётся две целых числа - начало (включительно) и конец (не включительно) подстроки.

```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        System.out.println(str.substring(6));      //Получение подстроки, начиная с 6 элемента и до конца
        System.out.println(str);
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        String str = "Какая то строка";
        System.out.println(str.substring(0, 6));            //Получение подстроки, с 0 по 6 (не включительно) элемент
        
        String newStr = str.substring(0, 5);                //Копию кусочка строки можно положить в строковую переменную
        System.out.println(newStr);
    }
}
```

### Проверка на пустоту строки (isEmpty())

Строка является пустой, если в ней не содержится ни одного символа. Метод возвращает `true`, если строка пуста, иначе возвращается `false`.

```java
class Main {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.isEmpty());              //true

        String str1 = "Whaths app";
        System.out.println(str1.isEmpty());             //false
        
        String str2 = "     ";
        System.out.println(str2.isEmpty());             //false
    }
}
```

### Проверка на пустоту, но возможно содержание пробелов (isBlank())

Метод работает аналогично методу `isEmpty()`, но может вернуть `true` в том случае, если в строке есть один или несколько пробелов.

```java
class Main {
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.isBlank());              //true - если строка пуста или содержит только пробелы
        
        String str1 = "Whaths app";
        System.out.println(str1.isBlank());             //false
        
        String str2 = "     ";
        System.out.println(str2.isBlank());             //true
    }
}
```