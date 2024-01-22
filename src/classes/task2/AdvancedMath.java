package classes.task2;

public class AdvancedMath {

    public static void main(String[] args) {
        System.out.println("проверка простоты числа 13 " + isPrime(13));
        System.out.println("проверка простоты числа 10 " + isPrime(10));
        System.out.println();

        System.out.println("полиндром 121? = " + isPalindrome(121));
        System.out.println("полиндром 123? = " + isPalindrome(123));
        System.out.println();

        System.out.println("четное 22? = " + isEven(22));
        System.out.println("четное 21? = " + isEven(21));
        System.out.println();

        System.out.println("нечетное 5? = " + isOdd(5));
        System.out.println("нечетное 6? = " + isOdd(6));
        System.out.println();
    }

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
