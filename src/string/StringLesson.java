package string;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class StringLesson {
    public static void main(String[] args) {

//============================================ СОЗДАНИЕ СТРОК ==========================================================
//        String str = "Какая то строка"; //Строка с инициализацией
//        String str = "☺ ♫♫☼ -+!!!!! ☻♥♦♣♠"; //Строка с инициализацией
//        String numberStr = "256";     //Это не число 256. Это символы 2, 5 и 6
//        String empty = "";              //Пустая строка
//
//        System.out.println(str);

//============================================= МЕТОДЫ СТРОК ===========================================================
        //Получение символа из строки по указанному номеру
//        String str = "Какая то строка";
//        System.out.println(str.charAt(0));            //Получение символа строки, хранящимся под индексом 0
//
//        char ch = str.charAt(3);                     //charAt(..) возвращает тип char
//        System.out.println(ch);
//
//        System.out.println(str.charAt(100));        //ОШИБКА! Нет символа с указанным номером

        //Получение длины строки
//        String str = "Какая то строка";
//        int length = str.length();
//        System.out.println(length);

        //Получение номера указанного символа или подстроки
//        String str = "Какая то строка";
//        int index = str.indexOf("а");
//        System.out.println(index);           //Получение номера первого вхождения символа "а"
//        System.out.println(str.indexOf("то"));          //Получение номера начала подстроки "то"
//        System.out.println(str.lastIndexOf("а"));     //Получение номера последнего вхождения символа "а"
//        System.out.println(str.indexOf("Hello"));       //Возвращает -1, потому что подстроки "Hello" нет в строке str

        //Проверка, содержатся ли символы в строке
//        String str = "Какая то строка";
//        System.out.println(str.contains("Какая"));      //true, потому что в строке есть подстрока "Какая"
//        System.out.println(str.contains("какая"));      //false, потому что в строке нет подстроки "какая". Дело в регистре
//        System.out.println(str.contains("а"));          //true, потому что в строке есть подстрока "а"
//        System.out.println(str.contains("hello"));      //false, потому что в строке нет подстроки "hello"
//        String str1 = "aa";
//        String str2 = "Kawabangaaa";
//        System.out.println(str2.contains(str1));

//        Если в str2 есть подстрока str1
//        String str1 = "aa";
//        String str2 = "Kawabangaaa";
//        if (str2.contains(str1)){
//            System.out.println("Совпадение есть");
//        }
        //Получение подстроки из строки
//        String str = "Какая то строка";
//        System.out.println(str.substring(6));      //Получение подстроки, начиная с 6 элемента и до конца
//        System.out.println(str.substring(0, 6));            //Получение подстроки, с 0 по 6 (не включительно) элемент
//        String newStr = str.substring(0, 5);                //Копию кусочка строки можно положить в строковую переменную
//        System.out.println(newStr);

        //Проверка, что строка пуста
//        String str = "";
//        System.out.println(str.isEmpty());              //true - если строка пуста
//        System.out.println(str.isBlank());              //true - если строка пуста или содержит только пробелы
//        String str1 = "Whats app";
//        System.out.println(str1.isEmpty());
//        System.out.println(str1.isBlank());
//        String str2 = "     ";
//        System.out.println(str2.isEmpty());
//        System.out.println(str2.isBlank());

        //Убрать пробелы в начале и в конце строки
//        String str = "       Hello   world   ";
//        System.out.println(str);
//        System.out.println(str.trim());

        //Замена символов
//        String str = "Какая то строка";
//        System.out.println(str.replace(" ", "___"));    //Замена ВСЕХ пробелов на '___'

        //Проверить на что заканчивается строка
//        String str = "Какая то строка";
//        System.out.println(str.endsWith("ока"));            //Проверка, что строка заканчивается на подстроку "ока". Вернётся true
//        System.out.println(str.endsWith("абвгд"));          //Проверка, что строка заканчивается на подстроку "абвгд". Вернётся false

        //Проверить на что начинается строка
//        String str = "Какая то строка";
//        System.out.println(str.startsWith("Какая"));    //true
//        System.out.println(str.startsWith("абвгд"));    //false

        //Приведения к регистрам
//        String str = "Какая то строка";
//        System.out.println(str.toUpperCase());  //Приведение строки к верхнему регистру
//        System.out.println(str.toLowerCase());  //Приведение строки к нижнему регистру

        //Превращение строки в массив
//        String str = "Какая то строка";
//        String[] arrayString = str.split(" ");          //Разбиение строки по пробелам. У split() в скобках указывается разделитель!!!
//        for (int i = 0; i < arrayString.length; i++){
//            System.out.println(arrayString[i]);
//        }

        // Преобразование массива строк в строку (Противоположно действию метода split)
//        String[] strings = {"Какая", "прекрасная", "сегодня", "погода"};
//        String str = String.join(" ", strings);     //Первый параметр - строка, которая будет между элементами массива, второй параметр - массив строк
//        System.out.println(str);

        //Превращение строки в массив символов
//        String str = "Какая то строка";
//        char[] chars = str.toCharArray();           //Превращение строки в массив символов
//        for (int i = 0; i < chars.length; i++){
//            System.out.println(chars[i]);
//        }

        //Сравнение строк
//        String str = "hello";
//        boolean b = str.equals("hello");    //Сравнение только через equals()!!!!!
//        boolean b = str.equals("Hello");
//        boolean b = str.equalsIgnoreCase("Hello");    //Сравнение без учёта регистра
//        System.out.println(b);

//============================================ ИЗМЕНЕНИЕ СТРОК =========================================================
        //Так строка не изменяется
//        String string = "Какой чудесный день";
//        string.replace(" ", "__");
//        string.toUpperCase();
//        System.out.println(string);

        //Правильный вариант изменения
//        String string = "Какой чудесный день";
//        string = string.replace(" ", "__");       //Перезапись старого значения строки на новое
//        string = string.toUpperCase();
//        System.out.println(string);

        //Цепочка методов
//        String string = "              Какой чудесный день";
//        string = string.replace(" ", "__").toUpperCase().trim();
//        string = string.trim().replace(" ", "__").toUpperCase();  //Порядок вызова методов в цепочке имеет значение!!!
//        System.out.println(string);

        //КОНКАТЕНАЦИЯ И ФОРМИРОВАНИЕ СТРОК
        //Конкатенация - сложение строк
//        String string = "Какой чудесный день";
//        string = string + " новое слово";
//        System.out.println(string);
//        String newStr = "Привет," + " " + "как дела?" + 50 + 10;       //Так тоже можно
//        String newStr = "Привет," + " " + "как дела?" + 50 + 10 * 2;       //Так тоже можно
//        String newStr = "Привет," + " " + "как дела?" + (50 + 10);       //Так тоже можно
//        String newStr = 50 + 10+ "Привет," + " " + "как дела?";       //Порядок имеет значение!
//        System.out.println(newStr);

        //char превратить в String
//        char ch = 'a';
//        String str = "";
////        str = ch;           //Так нельзя, несовпадение типов
//        str = ch + "";

//================================================= УДАЛЕНИЕ ===========================================================
        //Удалить символ под номером 2
//        int number = 2;
//        String str = "Строчечка";
//        str = str.substring(0, number) + str.substring(number + 1);
//        System.out.println(str);

//================================================= ПРИМЕР ===========================================================
        //Вывести строку посимвольно
//        String str = "Строка";
//        for (int i = 0; i < str.length(); i++){
//            System.out.println(str.charAt(i));
//        }
    }
}
