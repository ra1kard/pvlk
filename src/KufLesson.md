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