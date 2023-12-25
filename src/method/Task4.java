package method;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(countNumber(2563));
        System.out.println(countNumber(1));
        System.out.println(countNumber(7));
    }

    public static int countNumber(int number) {
        char[] chars = Integer.toString(number).toCharArray();
        return chars.length;
    }

}

//можно еще через цикл символов и count, однако это дольше
