package method;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(palindrom("доход") ? "Палиндром" : "Не палиндром");  //нечетн
        System.out.println(palindrom("загар") ? "Палиндром" : "Не палиндром");
        System.out.println();
        System.out.println(palindrom("abba") ? "Палиндром" : "Не палиндром");   //четн
        System.out.println(palindrom("мясо") ? "Палиндром" : "Не палиндром");
    }

    public static boolean palindrom(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            if (!(chars[i] == chars[chars.length-1-i])) {
                return false;
            }
        }
        return true;
    }
}
