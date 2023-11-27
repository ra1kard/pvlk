package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        System.out.println("Введите строку:");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        str = str.replace("{", "");
        str = str.replace("}", "");
        str = str.replace("'", "");
        System.out.println(str);

        //просто печать
        System.out.println();
        String[] arrayStr = str.split(",");
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println(arrayStr[i]);
        }

        //Удаление лишних пробелов в начале и в конце строки (trim()) - не можем просто удалить все пробелы
        for (int i = 0; i < arrayStr.length; i++) {
            for (int j = 0; j < arrayStr[i].length(); j++) {
                arrayStr[i] = arrayStr[i].trim();
                break;
            }
        }

        //просто печать
        System.out.println();
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println(arrayStr[i]);
        }

        /* неудачный способ
        в массиве обработаем пробелы если пробел не нулевой и не слева/справа от двоеточия и не последний - замена на что-то
        for (int i = 0; i < arrayStr.length; i++) {                 //зашлий в первый элемент массива (строка1)
            for (int j = 0; j < arrayStr[i].length(); j++) {        //пошли посимвольно
                int index = arrayStr[i].indexOf(":");               //найдем : чтобы сл/сп найти индексы пробелов
                System.out.println("index равен = " + index);
                if ((arrayStr[i].charAt(j) == ' ') && (i != 0 || i != arrayStr.length-1 || i != index-1 )) {
                    //тогда заменяем данный пробел на что-то другое
                }
            }
        }*/

        System.out.println();
        //используем метод `substring`
        for (int i = 0; i < arrayStr.length; i++) {
            for (int j = 0; j < arrayStr[i].length(); j++) {
                int index = arrayStr[i].indexOf(":");
                map.put(arrayStr[i].substring(0, index-1), arrayStr[i].substring(index+2));
                break;
            }
        }

        System.out.println(map);
    }
}
