package classes.task1;

import static classes.task1.AdvancedMath.*;

public class Start {

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

}
