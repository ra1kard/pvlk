package method;

public class Task19 {
    public static void main(String[] args) {
        System.out.println(myMethod(153) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(myMethod(370) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(myMethod(123) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(myMethod(8) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(myMethod(36) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(myMethod(8208) ? "Число Армстронга" : "Не число Армстронга");
    }

    public static boolean myMethod(int value) {
        String str = String.valueOf(value);
        char[] array = str.toCharArray();
        int rsl = 0;
        for (char c : array) {
            int num = Character.getNumericValue(c);
            rsl += Math.pow(num, array.length);
        }
        return (value == rsl);
    }
}
