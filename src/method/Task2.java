package method;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(sumNumbers(25));    // 7
        System.out.println(sumNumbers(356));   // 14
        System.out.println(sumNumbers(0));     // 0
    }

    public static int sumNumbers(int number) {
        char[] chars = Integer.toString(number).toCharArray();
        int rsl = 0;
        for (char ch : chars) {
            rsl += Character.getNumericValue(ch);
        }
        return rsl;
    }
}
