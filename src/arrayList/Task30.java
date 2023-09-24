package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Task30 {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>(List.of(10, 5, 99, 6));
        //ArrayList<Integer> list = new ArrayList<>(List.of(71, 15, 19, 29, 88));
        ArrayList<Integer> list = new ArrayList<>(List.of(0, 1, 3, 9, 10, 30, 90, 11, 33, 99, 100));
        int number;

        //определим число однозначное или двузначное в digitCount
        for (int i : list) {
            number = i;
            int digitCount = 0;
            int digitOne = 0;
            int digitTwo = 0;
            while (number > 0) {
                if (digitCount == 0) {
                    digitTwo = number % 10;     //зафиксируем на будущее вторую цифру
                } else {
                    digitOne = number % 10;     //зафиксируем на будущее первую цифру
                }
                number = number / 10;
                digitCount++;
            }
            //System.out.println("сколько цифр в " + list.get(i) + " = " + digitCount);
            //System.out.println("первая цифра = " + digitOne);
            //System.out.println("вторая цифра = " + digitTwo);

            if (i == 0) {                 //обработаем 0
                System.out.println("Ноль");
            } else if (i == 100) {        //обработает 100
                System.out.println("Сто");
            } else if (digitCount == 1) {           //однозначные тут
                switch (i) {
                    case 1 -> System.out.println("Один");
                    case 2 -> System.out.println("Два");
                    case 3 -> System.out.println("Три");
                    case 4 -> System.out.println("Четыре");
                    case 5 -> System.out.println("Пять");
                    case 6 -> System.out.println("Шесть");
                    case 7 -> System.out.println("Семь");
                    case 8 -> System.out.println("Восемь");
                    case 9 -> System.out.println("Девять");
                }
            } else if (digitTwo == 0) {             //двузначные заканчивающиеся на ноль тут
                switch (digitOne) {
                    case 1 -> System.out.println("Десять");
                    case 2 -> System.out.println("Двадцать");
                    case 3 -> System.out.println("Тридцать");
                    case 4 -> System.out.println("Сорок");
                    case 5 -> System.out.println("Пятьдесят");
                    case 6 -> System.out.println("Шестьдесят");
                    case 7 -> System.out.println("Семьдесят");
                    case 8 -> System.out.println("Восемьдесят");
                    case 9 -> System.out.println("Девяносто");
                }
            } else if (digitOne == 1) {             //двузначные начинающиеся на 1
                switch (digitTwo) {
                    case 1 -> System.out.println("Одиннадцать");
                    case 2 -> System.out.println("Двенадцать");
                    case 3 -> System.out.println("Тринадцать");
                    case 4 -> System.out.println("Четырнадцать");
                    case 5 -> System.out.println("Пятнадцать");
                    case 6 -> System.out.println("Шестнадцать");
                    case 7 -> System.out.println("Семнадцать");
                    case 8 -> System.out.println("Восемнадцать");
                    case 9 -> System.out.println("Девятнадцать");
                }
            } else {                                //двузначные остальные тут
                switch (digitOne) {
                    case 2 -> System.out.print("Двадцать ");
                    case 3 -> System.out.print("Тридцать ");
                    case 4 -> System.out.print("Сорок ");
                    case 5 -> System.out.print("Пятьдесят ");
                    case 6 -> System.out.print("Шестьдесят ");
                    case 7 -> System.out.print("Семьдесят ");
                    case 8 -> System.out.print("Восемьдесят ");
                    case 9 -> System.out.print("Девяносто ");
                }
                switch (digitTwo) {
                    case 1 -> System.out.println("один");
                    case 2 -> System.out.println("два");
                    case 3 -> System.out.println("три");
                    case 4 -> System.out.println("четыре");
                    case 5 -> System.out.println("пять");
                    case 6 -> System.out.println("шесть");
                    case 7 -> System.out.println("семь");
                    case 8 -> System.out.println("восемь");
                    case 9 -> System.out.println("девять");
                }
            }
        }
    }
}
