package method;

public class Task19 {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(153) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(checkArmstrong(370) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(checkArmstrong(123) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(checkArmstrong(8) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(checkArmstrong(36) ? "Число Армстронга" : "Не число Армстронга");
        System.out.println(checkArmstrong(8208) ? "Число Армстронга" : "Не число Армстронга");
    }

    public static boolean checkArmstrong(int value) {
        if (value > 0) {
            String str = String.valueOf(value);
            char[] array = str.toCharArray();
            int rsl = 0;
            for (char c : array) {
                int num = Character.getNumericValue(c);
                rsl += Math.pow(num, array.length);
            }
            return (value == rsl);
        }
        return false;
    }
}
