package string;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        /*
        10 + 25 * 2 + 3
        8 / 2 + 2
        50 /10 + 2 ** 2 + 6 * 6 - 30
         */
        //3 + 3 * 3 = 18 (это пример когда по порядку идет вычисление, что неверно)
        //3 + 3 * 3 = 12 (это пример когда математически вычисляется сначала умножение затем сложение)
        //int value = 3 + 3 * 3; System.out.println(value);

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        str = str.replace(" ", "");
        System.out.println("строка: удалим все пробелы: " + str);

        char[] chars = str.toCharArray();
        System.out.print("символы: создадим массив из оставшихся символов: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        };

        //вычислить только цифры
        //вычислить только знаки

        char ch0 = chars[0];
        char ch1 = chars[1];
        char ch2 = chars[2];

        System.out.println();
        System.out.println("ssssssadsdasdasdasd");
        System.out.println(Character.getNumericValue(ch0));
        System.out.println(Character.getNumericValue(ch1));
        System.out.println("sad = " + ch1 + " = sad");
        System.out.println(Character.getNumericValue(ch2));

        int value = Integer.parseInt(Character.getNumericValue(ch0) + "2" + Character.valueOf(ch1) + Character.getNumericValue(ch2));
        //int value = Integer.parseInt(Character.getNumericValue(ch0) + "2" + Character.valueOf(ch1) + Character.getNumericValue(ch2));

        System.out.println();
        System.out.print(value);

        //1. почему не удалось решить с помощью eval, что я там не то выбирал??
        //2. обратную польскую запись надо курить
    }
}
