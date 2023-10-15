package hashSet;

import java.util.HashSet;

public class Task_test {
    public static void main(String[] args) {
        HashSet<String> states = new HashSet<>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        System.out.println(states);

        // пытаемся добавить элемент, который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);    // false

        System.out.printf("Set contains %d elements \n", states.size());    // 3

        // удаление элемента
        states.remove("Germany");
        System.out.println(states);
    }
}

/*
Основные операции, которые можно выполнить с HashSet:
    добавление элемента: add()
    удаление элемента: remove()
    проверка наличия элемента: contains()
    очистка коллекции: clear()
    получение размера коллекции: size()
    проверка на пустоту коллекции: isEmpty()

HashSet реализован как хэш-таблица,
- где элементы хранятся в виде ключей
- а значения не используются.

При добавлении элемента,
- HashSet рассчитывает его хэш-код и добавляет в таблицу с соответствующим индексом.
- Если в таблице уже есть элемент с таким же хэш-кодом, то выполняется проверка на равенство.
- Если элементы равны, то новый элемент не добавляется в коллекцию, иначе он добавляется в таблицу.

При работе с HashSet
- важно правильно определить методы hashCode() и equals()
- для класса, который будет храниться в коллекции.
---
Это позволит корректно выполнять поиск и удаление элементов.
Если класс не переопределит методы hashCode() и equals(),
то будут использоваться реализации по умолчанию,
которые могут не давать ожидаемых результатов при работе с HashSet

 */
