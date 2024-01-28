package classes.task1;

public class AdvancedMath {

    /** проверка простоты числа
     *  Простое число - это натуральное число (>0),
     *  которое имеет не более двух различных делителей: 1 и само число*/
    static boolean isPrime(int value) {
        if (value < 0) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    /** проверка является ли число полиндромом*
     *  Полиндром - слово или фраза, которые одинаково читаются слева направо и справа налево */
    static boolean isPalindrome(int value) {
        String valueStr = String.valueOf(value);
        char[] chars = valueStr.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            if (!(chars[i] == chars[chars.length-1-i])) {
                return false;
            }
        }
        return true;
    }

    /** проверка четности числа */
    static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /** проверка нечетности числа */
    static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    /** проверка числа на принадлежность к множеству натуральных чисел */
    /*static boolean isNatural(int value) {
        return true;
    }*/

 }
