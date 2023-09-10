# Преобразования

## Из одного типа в другой

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
